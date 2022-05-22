package com.naver.line.demo.account.entities;

import com.naver.line.demo.user.entities.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.checkerframework.checker.units.qual.C;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@RequiredArgsConstructor
@Table(name="accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer user_id;

    @Column
    private String number;

    @Column
    private Integer amount; // TODO - check boundary

    @Column
    private String status;

    @Column
    private Integer transfer_limit;

    @Column Integer daily_transfer_limit;
}
