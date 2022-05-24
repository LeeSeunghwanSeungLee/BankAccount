package com.naver.line.demo.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BalanceTransactionsRepository extends JpaRepository<BalanceTransactions, Long> {
}
