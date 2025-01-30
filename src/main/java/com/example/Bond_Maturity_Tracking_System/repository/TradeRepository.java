package com.example.Bond_Maturity_Tracking_System.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Bond_Maturity_Tracking_System.entity.Trade;

@Repository
public interface TradeRepository extends JpaRepository<Trade, Long> {

    List<Trade> findByStatus(String status);

    List<Trade> findBySettlementDateBetween(LocalDate startDate, LocalDate endDate);

    @Query("SELECT t FROM Trade t WHERE t.settlementDate BETWEEN :startDate AND :endDate ORDER BY t.settlementDate ASC")
    List<Trade> findTradesMaturingSoon(LocalDate startDate, LocalDate endDate, Pageable pageable);
}

