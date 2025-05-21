package com.helion.dslist.dto;

import com.helion.dslist.entities.Game;

public class GameDTO {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDTO(){}

    public GameDTO(Long id,
                   String title,
                   Integer year,
                   String genre,
                   String platforms,
                   Double score,
                   String imgUrl,
                   String shortDescription,
                   String longDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.imgUrl = imgUrl;
        this.genre = genre;
        this.platforms = platforms;
        this.score = score;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public GameDTO(Game aGame){
        this.id = aGame.getId();
        this.title = aGame.getTitle();
        this.year = aGame.getYear();
        this.genre = aGame.getGenre();
        this.platforms = aGame.getPlatforms();
        this.score = aGame.getScore();
        this.imgUrl = aGame.getImgUrl();
        this.shortDescription = aGame.getShortDescription();
        this.longDescription = aGame.getLongDescription();
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

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
}
