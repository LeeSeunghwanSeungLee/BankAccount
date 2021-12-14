package com.naver.line.demo.transfer;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transfers")
public class TransferController {
  /**
   * 4. 이체
   */
    @PostMapping("/{id}/transfer-limit")
    public void makeTransfer(@RequestHeader(value=" X-USER-ID") int userId,
                             @PathVariable int id,
                             @RequestBody String sender_account_number,
                             @RequestBody String receiver_account_number,
                             @RequestBody int amount,
                             @RequestBody String sender_note,
                             @RequestBody String receiver_note) {
        // 0. userId 검증 -> 메소드로 따로 빼서 확인하던지, 아니면 filter를 적용하는 것이 좋을 것으로 보임
        // 1. 데이터 검증에 실패했을 경우 400 Bad Request로 응답합니다.
        // 2. accounts 테이블에서 계좌 정보를 가져옵니다.
        // 3. 출금 계좌나 입금 계좌를 찾을 수 없을 경우 404 Not Found으로 응답합니다.
        // 4. 사용자가 출금 계좌의 소유자가 아닌 경우 403 Forbidden으로 응답합니다.
        // 5. 출금 계좌나 입금 계좌가 비활성화 상태인 경우 400 Bad Request로 응답합니다.
        // 6. 출금액이 출금 계좌의 잔액보다 많은 경우 400 Bad Request로 응답합니다.
        // 7. 이체 금액이 출금 계좌의 1회 이체 한도를 초과할 경우 400 Bad Request로 응답합니다.
        // 8. 당일 총 이체 금액과 이체 금액의 합이 출금 계좌의 1일 이체 한도를 초과할 경우 400 Bad Request로 응답합니다.
        // 9. 당일 총 이체 금액은 00시 00분 00초 ~ 23시 59분 59초 사이 이체 금액의 총 합을 말합니다.
        // 10.  출금 정보를 balance_transactions 테이블에 저장합니다.
        // 11.  타입은 WITHDRAW으로 저장합니다.
        // 12.  출금 전 계좌의 잔액을 before_balance_amount에 저장합니다.
        // 13.  note에 sender_note를 저장합니다. sender_note 값이 없을 경우 입금 계좌의 고객명을 저장합니다.
        // 14.  출금 계좌의 잔액을 금액만큼 감소시킵니다.
        // 15.  입금 정보를 balance_transactions 테이블에 저장합니다.
        // 16.  타입은 DEPOSIT으로 저장합니다.
        // 17.  입금 전 계좌의 잔액을 before_balance_amount에 저장합니다.
        // 18.  note에 receiver_note 값을 저장합니다. receiver_note 값이 없을 경우 출금 계좌의 고객명을 저장합니다.
        // 19.  입금 계좌의 잔액을 금액만큼 증가시킵니다.
        // 20.  transfers 테이블에 데이터를 저장합니다.
        // 21.  출금 정보 저장 후 생성된 ID를 withdraw_id에 저장합니다.
        // 22.  입금 정보 저장 후 생성된 ID를 deposit_id에 저장합니다.
        // 23.  응답으로 출금 거래 정보를 내려줍니다.
        return;
    }
}
