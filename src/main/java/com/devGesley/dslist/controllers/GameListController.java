package com.devGesley.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devGesley.dslist.dto.GameListDTO;
import com.devGesley.dslist.dto.GameMinDTO;
import com.devGesley.dslist.dto.ReplacementDTO;
import com.devGesley.dslist.services.GameListService;
import com.devGesley.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;

	@Autowired
	private GameService gameService;

	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return result;

	}

	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable long listId) {
		List<GameMinDTO> result = gameService.findAllByList(listId);
		return result;
	}

	@PostMapping(value = "/{listId}/replacement")
	public void move(@PathVariable long listId, @RequestBody ReplacementDTO body) {
		gameListService.move(listId, body.getSourceIndex() , body.getDestinationIndex());

	}

}
