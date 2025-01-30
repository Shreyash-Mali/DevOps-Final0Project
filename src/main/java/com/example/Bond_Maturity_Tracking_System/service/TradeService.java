
package com.example.Bond_Maturity_Tracking_System.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.Bond_Maturity_Tracking_System.repository.TradeRepository;
import com.example.Bond_Maturity_Tracking_System.entity.Trade;

@Service
public class TradeService {

    @Autowired
    private TradeRepository tradeRepository;

    public List<Trade> getActiveTrades() {
        return tradeRepository.findByStatus("OPEN");
    }

    public List<Trade> getTradesMaturingSoon(int page, int size) {
        LocalDate today = LocalDate.now();
        LocalDate soon = today.plusMonths(5);

        Pageable pageable = PageRequest.of(page, size);
        return tradeRepository.findTradesMaturingSoon(today, soon, pageable);
    }
}






