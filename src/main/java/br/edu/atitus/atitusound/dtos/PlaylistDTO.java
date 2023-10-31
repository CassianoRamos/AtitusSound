package br.edu.atitus.atitusound.dtos;

public class PlaylistDTO {

	private String name;
	private MusicDTO musica;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MusicDTO getMusica() {
		return musica;
	}
	public void setMusica(MusicDTO musica) {
		this.musica = musica;
	}
	
}
