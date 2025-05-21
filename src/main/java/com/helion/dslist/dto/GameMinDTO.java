package com.helion.dslist.dto;

import com.helion.dslist.entities.Game;
import com.helion.dslist.projections.GameMinProjection;
import jakarta.persistence.Column;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){}

    public GameMinDTO(Long id, String title, Integer year, String imgUrl, String shortDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
    }

    public GameMinDTO(Game aGame){
        this.id = aGame.getId();
        this.title = aGame.getTitle();
        this.year = aGame.getYear();

        this.imgUrl = aGame.getImgUrl();
        this.shortDescription = aGame.getShortDescription();
    }

    public GameMinDTO(GameMinProjection aProjection){
        this.id = aProjection.getId();
        this.title = aProjection.getTitle();
        this.year = aProjection.getYear();

        this.imgUrl = aProjection.getImgUrl();
        this.shortDescription = aProjection.getShortDescription();
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
}
