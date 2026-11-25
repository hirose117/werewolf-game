package com.example.werewolfgame.dto;

import lombok.Data;

@Data
public class Game {
    private long gameId;
    private Long userId;
    private Integer day;
    private String status;
    private Integer meetingTurn;
    private String result;
}
