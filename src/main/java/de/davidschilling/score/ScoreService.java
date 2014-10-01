package de.davidschilling.score;

import java.util.List;

/**
 * David Schilling - davejs92@gmail.com
 */
public interface ScoreService {

    Score createScore(Score score);
    List<Score> getScoreForGame(String gameName);
}
