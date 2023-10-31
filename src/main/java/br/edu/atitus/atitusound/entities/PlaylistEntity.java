package br.edu.atitus.atitusound.entities;

import java.time.Duration;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;

import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_playlist_music")
public class PlaylistEntity extends GenericEntity{
	
	private String name;
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinTable(name = "tb_playlist_music")
	private MusicEntity music;
	private boolean public_share;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MusicEntity getMusic() {
		return music;
	}
	public void setMusic(MusicEntity music) {
		this.music = music;
	}
	public boolean isPublic_share() {
		return public_share;
	}
	public void setPublic_share(boolean public_share) {
		this.public_share = public_share;
	}
	
}
