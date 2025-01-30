
package com.example.Bond_Maturity_Tracking_System.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Example for Trade.java

@Entity
@Table(name = "trades")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trade {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long tradeId;

 @ManyToOne
 @JoinColumn(name = "book_id", nullable = false)
 private Book book;

 @ManyToOne
 @JoinColumn(name = "security_id", nullable = false)
 private Security security;

 @ManyToOne
 @JoinColumn(name = "counterparty_id", nullable = false)
 private Counterparty counterparty;

 private String currency;
 private String status;
 private Integer quantity;
 private Double unitPrice;
 private String buySellIndicator;
 private LocalDate tradeDate;
 private LocalDate settlementDate;
}
