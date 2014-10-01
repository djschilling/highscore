package de.davidschilling.score;

import de.davidschilling.user.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * David Schilling - davejs92@gmail.com
 */
@Service
public class ScoreServiceImpl implements ScoreService {

    private ScoreRepository scoreRepository;
    private UserService userService;

    @Autowired
    public ScoreServiceImpl(ScoreRepository scoreRepository, UserService userService) {
        this.scoreRepository = scoreRepository;
        this.userService = userService;
    }

    @Override
    public Score createScore(Score score) {
        score.setUsername(userService.getCurrentlyLoggedIn().getUsername());
        return scoreRepository.save(score);
    }

    @Override
    public List<Score> getScoreForGame(String gameName) {

        return scoreRepository.findByGameNameOrderByScoreDesc(gameName, new PageRequest(0, 10));
    }
}
