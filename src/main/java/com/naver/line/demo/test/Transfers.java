package com.naver.line.demo.test;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "transfers")
public class Transfers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer user_id;

    @Column
    private Long withdraw_id;

    @Column
    private Long deposit_id;

    @Column
    private Long amount;

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDate createdAt;
}
