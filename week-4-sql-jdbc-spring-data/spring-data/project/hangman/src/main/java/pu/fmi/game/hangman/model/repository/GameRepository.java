package pu.fmi.game.hangman.model.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import pu.fmi.game.hangman.model.entity.HangmanGame;
import pu.fmi.game.hangman.model.entity.Status;

public interface GameRepository extends JpaRepository<HangmanGame, Long> {

  // SELECT * FROM HANGMAN_GAME WHERE STATUS = ?
  List<HangmanGame> findByStatus(Status status);

  // ✅ Връща последните 10 игри, подредени по startedOnDate в низходящ ред
  List<HangmanGame> findTop10ByOrderByStartedOnDateDesc();
}
