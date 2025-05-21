package com.helion.dslist.dto;

import com.helion.dslist.entities.GameList;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO() {}

    public GameListDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public GameListDTO(GameList aList) {
        id = aList.getId();
        name = aList.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
