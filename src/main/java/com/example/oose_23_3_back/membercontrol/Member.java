package com.example.oose_23_3_back.membercontrol;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer memberNumber;
    private String identification;
    private String password;
    private String rentalPassword;
    private String name;
    private String phoneNumber;
    private String email;
    private LocalDateTime birthDate;

    @CreatedDate
    private LocalDateTime registrationDate;
}
