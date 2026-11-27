package com.example.werewolfgame.dto;

import lombok.Data;

@Data
public class Game {
    private long gameId;
    private Long userId;
    private Integer day;     // 経過日数
    private String status;   // ゲームの進行状態　※朝昼晩など
    private Integer meetingTurn;
    private String result;
}
