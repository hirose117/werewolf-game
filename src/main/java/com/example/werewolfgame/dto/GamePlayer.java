package com.example.werewolfgame.dto;

import lombok.Data;

@Data
public class GamePlayer {
    private long playerId;
    private long gameId;
    private Long userId;
    private String name;
    private String role;       // 役職
    private Boolean isAlive;   // 生死判定
    private Integer suspicion; // 疑惑値
}
