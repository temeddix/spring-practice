package me.temeddix.demo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {

  private final Logger log = LoggerFactory.getLogger(this.getClass());

  /**
   * Pointcut that matches all repositories, services and controllers in the
   * application
   */
  @Pointcut("within(@org.springframework.stereotype.Repository *)" +
      " || within(@org.springframework.stereotype.Service *)" +
      " || within(@org.springframework.stereotype.Controller *)" +
      " || within(@org.springframework.web.bind.annotation.RestController *)")
  public void springBeanPointcut() {
    // Method is empty as this is just a Pointcut
  }

  /**
   * Pointcut that matches all beans in your application's main package
   */
  @Pointcut("within(me.temeddix.demo..*)")
  public void applicationPackagePointcut() {
    // Method is empty as this is just a Pointcut
  }

  /**
   * Logs method entry and exit including execution time
   */
  @Around("applicationPackagePointcut() && springBeanPointcut()")
  public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
    if (log.isDebugEnabled()) {
      log.debug("Enter: {}.{}() with arguments = {}",
          joinPoint.getSignature().getDeclaringTypeName(),
          joinPoint.getSignature().getName(),
          Arrays.toString(joinPoint.getArgs()));
    }

    long start = System.currentTimeMillis();
    Object result = joinPoint.proceed();
    long elapsedTime = System.currentTimeMillis() - start;

    if (log.isDebugEnabled()) {
      log.debug("Exit: {}.{}() with result = {} in {}ms",
          joinPoint.getSignature().getDeclaringTypeName(),
          joinPoint.getSignature().getName(),
          result, elapsedTime);
    }
    return result;
  }

  /**
   * Logs exceptions thrown by methods
   */
  @AfterThrowing(pointcut = "applicationPackagePointcut() && springBeanPointcut()", throwing = "e")
  public void logAfterThrowing(JoinPoint joinPoint, Throwable e) {
    log.error("Exception in {}.{}() with cause = {}",
        joinPoint.getSignature().getDeclaringTypeName(),
        joinPoint.getSignature().getName(),
        e.getCause() != null ? e.getCause() : "NULL");

    if (log.isDebugEnabled()) {
      log.debug("Exception details: ", e);
    }
  }
}
