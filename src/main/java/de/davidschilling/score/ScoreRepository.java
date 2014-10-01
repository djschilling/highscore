package de.davidschilling.score;

import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * David Schilling - davejs92@gmail.com
 */
public interface ScoreRepository extends JpaRepository<Score, Long>{


    List<Score> findByGameNameOrderByScoreDesc(String gameName, Pageable pageable);
}
