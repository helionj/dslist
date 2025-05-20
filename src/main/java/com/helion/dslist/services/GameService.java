package com.helion.dslist.services;

import com.helion.dslist.dto.GameMinDTO;
import com.helion.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        return this.gameRepository.findAll().stream().map(GameMinDTO::new).toList();
    }
}
