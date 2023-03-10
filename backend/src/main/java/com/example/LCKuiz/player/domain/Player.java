package com.example.LCKuiz.player.domain;

import com.example.LCKuiz.team.domain.Team;

import javax.persistence.*;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;

    private String userNickname;

    private Position Position;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

}
