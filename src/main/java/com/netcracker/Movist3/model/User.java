package com.netcracker.Movist3.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="users")
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name="login", nullable = false)
    private String login;

    @Column (name="password", nullable = false)
    private String password;

    @Column (name="mail", nullable = false)
    private String mail;
}
