package de.davidschilling.game;

/**
 * David Schilling - davejs92@gmail.com
 */
public class GameDTO {

    private String name;
    private String description;
    private String pictureUrl;
    private int highscore;

    public GameDTO(String name, String description, String pictureUrl, int highscore) {
        this.name = name;
        this.description = description;
        this.pictureUrl = pictureUrl;
        this.highscore = highscore;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public int getHighscore() {
        return highscore;
    }
}
