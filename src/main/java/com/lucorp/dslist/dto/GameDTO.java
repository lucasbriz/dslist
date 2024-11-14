package com.lucorp.dslist.dto;

import com.lucorp.dslist.entities.Game;

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
