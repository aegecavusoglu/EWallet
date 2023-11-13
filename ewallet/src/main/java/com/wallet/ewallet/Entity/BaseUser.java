package com.wallet.ewallet.Entity;


import com.wallet.ewallet.DTO.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "GENDER")
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(name = "BIRTHDATE")
    private LocalDate birthdate;
    @Column(name = "TCKN")
    private String tckn;
    @Column(name = "LAST_SUCCESSFUL_LOGIN")
    private LocalDateTime lastSuccessfulLogin;
    @Column(name = "LAST_LOGIN_ATTEMPT")
    private LocalDateTime lastLoginAttempt;
}
