package me.temeddix.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "profiles")
public class Profile {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "bio", nullable = false)
  private String bio;

  @Column(name = "phone_number", nullable = false)
  private String phoneNumber;

  @Column(name = "date_of_birth", nullable = false)
  private Date dateOfBirth;

  @Column(name = "loyalty_points", nullable = false)
  private Integer loyaltyPoints;

}
