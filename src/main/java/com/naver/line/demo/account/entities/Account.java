package com.naver.line.demo.account.entities;

import com.naver.line.demo.user.entities.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.checkerframework.checker.units.qual.C;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name="accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer user_id;

    @Column
    private String number;

    @Column
    private Long amount;

    @Column
    private User.Status status;

    @Column
    private Integer transfer_limit;

    @Column
    private Integer daily_transfer_limit;

    @Column(name = "created_at")
    @CreationTimestamp // jpa 추가 어노테이션 create 시에 시간을 작성
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp // update 시에 시간을 작성
    private LocalDateTime updatedAt;
}
