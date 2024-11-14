package com.lucorp.dslist.services;

import com.lucorp.dslist.entities.Game;
import com.lucorp.dslist.repositories.GameRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class GameService {

  private final GameRepository gameRepository;

  public GameService(GameRepository gameRepository) {
    this.gameRepository = gameRepository;
  }

  public List<Game> findAll() {
    return gameRepository.findAll();
  }
}
