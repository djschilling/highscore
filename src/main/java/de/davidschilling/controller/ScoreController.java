package de.davidschilling.controller;

import de.davidschilling.game.GameService;
import de.davidschilling.score.Score;
import de.davidschilling.score.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * David Schilling - davejs92@gmail.com
 */
@Controller
@RequestMapping(value = "/scores")
public class ScoreController {

    private ScoreService scoreService;
    private GameService gameService;

    @Autowired
    public ScoreController(ScoreService scoreService, GameService gameService) {
        this.scoreService = scoreService;
        this.gameService = gameService;
    }

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String prepareCreate(Model model) {
        model.addAttribute("score", new Score());
        model.addAttribute("games", gameService.getAllGames());
        return "score/newScore";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String submitScore(Score score) {
        scoreService.createScore(score);
        return "redirect:/games/" + score.getGameName();
    }
}
