package com.devGesley.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devGesley.dslist.entities.Game;

public interface GameRepository extends  JpaRepository<Game, Long>{

	
}
