package com.lucorp.dslist.services;

import com.lucorp.dslist.dto.GameDTO;
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

  public List<GameDTO> findAll() {
    List<Game> result = gameRepository.findAll();
    return result.stream().map(x -> new GameDTO(x)).toList();
  }
}
