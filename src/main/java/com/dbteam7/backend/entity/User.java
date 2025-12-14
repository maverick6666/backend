package com.dbteam7.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user", uniqueConstraints = {
    @UniqueConstraint(name = "uk_user_mail", columnNames = "mail")
})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @Column(name = "user_id", length = 28)
    private String userId;

    @Column(name = "user_name", length = 10)
    private String userName;

    @Column(name = "mail", length = 45)
    private String mail;

    @Column(name = "penalty")
    private Integer penalty;
}

