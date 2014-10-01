package de.davidschilling.score;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * David Schilling - davejs92@gmail.com
 */
@Entity
public class Score {

    @Id
    @GeneratedValue
    private Long id;

    private String gameName;

    private String username;

    private int score;

    public Score(String gameName, String username, int score) {
        this.gameName = gameName;
        this.username = username;
        this.score = score;
    }

    public Score() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
