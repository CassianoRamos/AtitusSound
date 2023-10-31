package br.edu.atitus.atitusound.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.atitus.atitusound.dtos.MusicDTO;
import br.edu.atitus.atitusound.dtos.PlaylistDTO;
import br.edu.atitus.atitusound.entities.ArtistEntity;
import br.edu.atitus.atitusound.entities.MusicEntity;
import br.edu.atitus.atitusound.entities.PlaylistEntity;
import br.edu.atitus.atitusound.services.GenericService;
import br.edu.atitus.atitusound.services.MusicService;
import br.edu.atitus.atitusound.services.PlaylistService;
@RestController
@RequestMapping("/playlist")
public class PlaylistController extends GenericController<PlaylistEntity, PlaylistDTO> {

	
	private final PlaylistService service;
	
	public PlaylistController(PlaylistService service) {
		super();
		this.service = service;
	}
	@Override
	public GenericService<PlaylistEntity> getService() {
		// TODO Auto-generated method stub
		return service;
	}

	@Override
	protected PlaylistEntity convertDTO2Entity(PlaylistDTO dto) {
		PlaylistEntity entidade = new PlaylistEntity();
		entidade.setName(dto.getName());
		MusicEntity entidadeMusica = new MusicEntity();
		entidadeMusica.setName(dto.getMusica().getName());
		entidade.setMusic(entidadeMusica);
		return entidade;
	}

}