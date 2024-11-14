package com.lucorp.dslist.services;

import com.lucorp.dslist.dto.GameDTO;
import com.lucorp.dslist.dto.GameEntityDTO;
import com.lucorp.dslist.entities.Game;
import com.lucorp.dslist.projections.GameMinProjection;
import com.lucorp.dslist.repositories.GameRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameService {

  private final GameRepository gameRepository;

  public GameService(GameRepository gameRepository) {
    this.gameRepository = gameRepository;
  }

  @Transactional(readOnly = true)
  public List<GameDTO> findAll() {
    List<Game> result = gameRepository.findAll();
    return result.stream().map(x -> new GameDTO(x)).toList();
  }

  @Transactional(readOnly = true)
  public GameEntityDTO findById(Long id) {
    Game result = gameRepository.findById(id).get();
    return new GameEntityDTO(result);
  }

  @Transactional(readOnly = true)
  public List<GameDTO> findByList(Long listId) {
    List<GameMinProjection> result = gameRepository.searchByList(listId);
    return result.stream().map(x -> new GameDTO(x)).toList();
  }
}
