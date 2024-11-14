package com.lucorp.dslist.controllers;

import com.lucorp.dslist.dto.GameDTO;
import com.lucorp.dslist.dto.GameEntityDTO;
import com.lucorp.dslist.services.GameService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/games")
public class GameController {

  private final GameService gameService;

  public GameController(GameService gameService) {
    this.gameService = gameService;
  }

  @GetMapping
  public List<GameDTO> findAll() {
    return gameService.findAll();
  }

  @GetMapping(value = "/{id}")
  public GameEntityDTO findById(@PathVariable Long id) {
    return gameService.findById(id);
  }
}
