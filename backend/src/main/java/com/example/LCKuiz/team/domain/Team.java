package com.example.LCKuiz.team.domain;

import com.example.LCKuiz.player.domain.Player;

import javax.persistence.*;
import java.util.List;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private TeamName teamName;

    @OneToMany(mappedBy = "team")
    private List<Player> member;
}
