package de.davidschilling.game;

import de.davidschilling.score.Score;
import de.davidschilling.score.ScoreService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * David Schilling - davejs92@gmail.com
 */
@Service
public class GameServiceImpl implements GameService {

    private GameRepository gameRepository;
    private ScoreService scoreService;

    @Autowired
    public GameServiceImpl(GameRepository gameRepository, ScoreService scoreService) {
        this.gameRepository = gameRepository;
        this.scoreService = scoreService;
    }

    @Override
    public Game getGameByName(String name) {
        Game game = gameRepository.findOne(name);
        if(game == null) {
            throw new GameServiceException("Game with name " + name + " not found.");
        }
        return game;
    }

    @Override
    public Game createGame(Game game) {
        return gameRepository.save(game);
    }

    @Override
    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    @Override
    public List<GameDTO> getAllGamesWithHighscore() {
        List<Game> games = gameRepository.findAll();
        List<GameDTO> gameDTOs = new ArrayList<>();
        for (Game game : games) {
            List<Score> scores = scoreService.getScoreForGame(game.getName());
            int score = !scores.isEmpty() ? scores.get(0).getScore() : 0;
            gameDTOs.add(new GameDTO(game.getName(), game.getDescription(), game.getPictureUrl(), score));
        }
        return gameDTOs;
    }
}
