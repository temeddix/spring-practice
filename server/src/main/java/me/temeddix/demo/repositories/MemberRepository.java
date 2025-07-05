package me.temeddix.demo.repositories;

import me.temeddix.demo.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
