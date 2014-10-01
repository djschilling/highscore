package de.davidschilling.game;

import java.util.List;

/**
 * David Schilling - davejs92@gmail.com
 */
public interface GameService {

    Game getGameByName(String name);

    Game createGame(Game game);

    List<Game> getAllGames();

    List<GameDTO> getAllGamesWithHighscore();
}
