package com.lucorp.dslist.controllers;

import com.lucorp.dslist.dto.GameDTO;
import com.lucorp.dslist.dto.GameListDTO;
import com.lucorp.dslist.services.GameListService;
import com.lucorp.dslist.services.GameService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

  private final GameListService gameListService;
  private final GameService gameService;

  public GameListController(GameListService gameListService, GameService gameService) {
    this.gameListService = gameListService;
    this.gameService = gameService;
  }

  @GetMapping
  public List<GameListDTO> findAll() {
    return gameListService.findAll();
  }

  @GetMapping(value = "/{listId}/games")
  public List<GameDTO> findByList(@PathVariable Long listId) {
    return gameService.findByList(listId);
  }

}
