package com.lucorp.dslist.dto;

import com.lucorp.dslist.entities.Game;
import com.lucorp.dslist.projections.GameMinProjection;

public class GameDTO {

  private Long id;
  private String title;
  private Integer year;
  private String shortDescription;

  public GameDTO() {
  }

  public GameDTO(Game game) {
    id = game.getId();
    title = game.getTitle();
    year = game.getYear();
    shortDescription = game.getShortDescription();
  }

  public GameDTO(GameMinProjection gameMinProjection) {
    id = gameMinProjection.getId();
    title = gameMinProjection.getTitle();
    year = gameMinProjection.getGameYear();
    shortDescription = gameMinProjection.getShortDescription();
  }

  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public Integer getYear() {
    return year;
  }

  public String getShortDescription() {
    return shortDescription;
  }
}
