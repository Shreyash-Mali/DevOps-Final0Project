package com.example.Bond_Maturity_Tracking_System.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "counterparties")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Counterparty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long counterpartyId;
    private String name;
}
