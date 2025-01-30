
package com.example.Bond_Maturity_Tracking_System.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "securities")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;
    private String isin;
    private String cusip;
    private String issuerName;
    private LocalDate maturityDate;
    private Double coupon;
    private String type;
    private Double faceValue;
    private String currency;
    private String status;
}
