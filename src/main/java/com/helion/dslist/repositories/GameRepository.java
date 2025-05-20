package com.helion.dslist.repositories;

import com.helion.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GameRepository extends JpaRepository<Game, Long> { }
