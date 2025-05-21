package com.devGesley.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devGesley.dslist.entities.GameList;

public interface GameListRepository  extends JpaRepository<GameList, Long>{
	

}
