package com.lucorp.dslist.services;

import com.lucorp.dslist.dto.GameListDTO;
import com.lucorp.dslist.entities.GameList;
import com.lucorp.dslist.projections.GameMinProjection;
import com.lucorp.dslist.repositories.GameListRepository;
import com.lucorp.dslist.repositories.GameRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameListService {

  private final GameListRepository gameListRepository;
  private final GameRepository gameRepository;

  public GameListService(GameListRepository gameListRepository, GameRepository gameRepository) {
    this.gameListRepository = gameListRepository;
    this.gameRepository = gameRepository;
  }

  @Transactional(readOnly = true)
  public List<GameListDTO> findAll() {
    List<GameList> result = gameListRepository.findAll();
    return result.stream().map(x -> new GameListDTO(x)).toList();
  }

  @Transactional
  public void move(Long listId, int sourceIndex, int destinationIndex) {

    List<GameMinProjection> list = gameRepository.searchByList(listId);

    GameMinProjection obj = list.remove(sourceIndex);
    list.add(destinationIndex, obj);

    int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
    int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

    for (int i = min; i <= max; i++) {
      gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
    }
  }

  @Transactional(readOnly = true)
  public GameListDTO findById(Long id) {
    GameList entity = gameListRepository.findById(id).get();
    return new GameListDTO(entity);
  }

}
