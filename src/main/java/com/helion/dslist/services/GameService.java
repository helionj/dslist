package com.helion.dslist.services;

import com.helion.dslist.dto.GameDTO;
import com.helion.dslist.dto.GameMinDTO;
import com.helion.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        return this.gameRepository.findAll().stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long anid) {
        var game = this.gameRepository.findById(anid).get();
        return new GameDTO(game);
    }
}
