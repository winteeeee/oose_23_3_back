package com.example.oose_23_3_back.membercontrol.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@ToString
public class Member {
    @Id
    private String identification;
    private String password;
    private String rentalPassword;
    private String name;
    private String phoneNumber;
    private String email;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime birthDate;

    @CreatedDate
    private LocalDateTime registrationDate;
}
