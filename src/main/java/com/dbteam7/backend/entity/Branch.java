package com.dbteam7.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "branch")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Branch {
    @Id
    @Column(name = "branch_id", length = 45)
    private String branchId;

    @Column(name = "address", length = 45)
    private String address;

    @Column(name = "charge_rate", length = 45)
    private String chargeRate;

    @OneToMany(mappedBy = "branch", cascade = CascadeType.ALL)
    private List<Group> groups = new ArrayList<>();

    @OneToMany(mappedBy = "branch", cascade = CascadeType.ALL)
    private List<Facility> facilities = new ArrayList<>();
}

