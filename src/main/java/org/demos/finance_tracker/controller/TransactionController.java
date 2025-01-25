package org.demos.finance_tracker.controller;

import lombok.RequiredArgsConstructor;
import org.demos.finance_tracker.entity.Transactions;
import org.demos.finance_tracker.service.TransactionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    @GetMapping("/")
    public String getHomePage(Model model) {
        double totalBalance = 10000;
        model.addAttribute("totalBalance", totalBalance);
        model.addAttribute("totalCash", totalBalance);
        model.addAttribute("transactions", List.of(new Transactions()));

        return "home_page"; // This is the name of your Thymeleaf template
    }
}
