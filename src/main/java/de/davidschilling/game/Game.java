package de.davidschilling.game;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * David Schilling - davejs92@gmail.com
 */
@Entity
public class Game {

    @Id
    private String name;
    private String description;
    private String pictureUrl;

    public Game() {
    }

    public Game(String name, String description, String pictureUrl) {
        this.name = name;
        this.description = description;
        this.pictureUrl = pictureUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}
