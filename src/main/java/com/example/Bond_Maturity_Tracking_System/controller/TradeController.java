package com.example.Bond_Maturity_Tracking_System.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Bond_Maturity_Tracking_System.service.TradeService;
import com.example.Bond_Maturity_Tracking_System.entity.Trade;

@RestController
@RequestMapping("/api/trades")
public class TradeController {

    @Autowired
    private TradeService tradeService;

    @GetMapping("/active")
    public List<Trade> getActiveTrades() {
        return tradeService.getActiveTrades();
    }

    @GetMapping("/maturing-soon")
    public List<Trade> getTradesMaturingSoon(
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "10") int size) {
        return tradeService.getTradesMaturingSoon(page, size);
    }
}
