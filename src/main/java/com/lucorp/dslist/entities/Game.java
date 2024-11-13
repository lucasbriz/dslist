package com.lucorp.dslist.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "TB_GAME")
public class Game {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  @Column(name = "game_year")
  private Integer year;
  private String genre;
  private String platform;
  private String imgUrl;
  private String shortDescription;
  private String longDescription;

  public Game() {
  }

  public Game(Long id, String title, Integer year, String genre, String platform, String imgUrl,
      String shortDescription, String longDescription) {
    this.id = id;
    this.title = title;
    this.year = year;
    this.genre = genre;
    this.platform = platform;
    this.imgUrl = imgUrl;
    this.shortDescription = shortDescription;
    this.longDescription = longDescription;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }

  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Game game = (Game) o;
    return Objects.equals(id, game.id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }

  @Override
  public String toString() {
    return "Game{" +
        "id=" + id +
        ", title='" + title + '\'' +
        ", year=" + year +
        ", genre='" + genre + '\'' +
        ", platform='" + platform + '\'' +
        ", imgUrl='" + imgUrl + '\'' +
        ", shortDescription='" + shortDescription + '\'' +
        ", longDescription='" + longDescription + '\'' +
        '}';
  }
}