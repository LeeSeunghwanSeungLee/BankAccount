package com.naver.line.demo.test;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "balance_transactions")
public class BalanceTransactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer user_id;

    @Column
    private Long account_id;

    @Column
    private BalanceType type;

    @Column
    private Long amount;

    @Column
    private Long before_balance_amount;

    @Column
    private String note;

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;
}
