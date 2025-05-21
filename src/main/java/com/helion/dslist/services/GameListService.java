package com.helion.dslist.services;

import com.helion.dslist.dto.GameListDTO;
import com.helion.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        return this.gameListRepository.findAll().stream().map(GameListDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public GameListDTO findById(Long anid) {
        var list = this.gameListRepository.findById(anid).get();
        return new GameListDTO(list);
    }
}
