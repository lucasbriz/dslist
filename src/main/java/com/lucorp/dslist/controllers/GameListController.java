package com.lucorp.dslist.controllers;

import com.lucorp.dslist.dto.GameListDTO;
import com.lucorp.dslist.services.GameListService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

  private final GameListService gameListService;

  public GameListController(GameListService gameListService) {
    this.gameListService = gameListService;
  }

  @GetMapping
  public List<GameListDTO> findAll() {
    return gameListService.findAll();
  }

}
