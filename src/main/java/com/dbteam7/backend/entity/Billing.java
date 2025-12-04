package com.dbteam7.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "billing")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Billing {
    @Id
    @Column(name = "billing_id", length = 45)
    private String billingId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;

    @Column(name = "price")
    private Integer price;

    @Column(name = "status", length = 45)
    private String status;

    @Column(name = "means", length = 45)
    private String means;

    @Column(name = "date")
    private LocalDateTime date;
}

