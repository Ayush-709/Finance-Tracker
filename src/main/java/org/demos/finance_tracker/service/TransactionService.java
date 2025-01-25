package org.demos.finance_tracker.service;

import lombok.RequiredArgsConstructor;
import org.demos.finance_tracker.repository.TransactionRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionService {
    private final TransactionRepository transactionRepository;



}
