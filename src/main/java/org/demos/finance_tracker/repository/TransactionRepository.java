package org.demos.finance_tracker.repository;

import org.demos.finance_tracker.entity.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transactions, Long> {
}
