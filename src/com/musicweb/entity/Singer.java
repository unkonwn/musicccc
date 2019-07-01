package com.musicweb.entity;

import java.util.Set;

/**
 * Singer entity. @author MyEclipse Persistence Tools
 */
public class Singer extends AbstractSinger implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Singer() {
	}

	/** minimal constructor */
	public Singer(Pic pic, String singerName, String singerInfo) {
		super(pic, singerName, singerInfo);
	}

	/** full constructor */
	public Singer(Pic pic, String singerName, String singerInfo, Set musiclists, Set musics) {
		super(pic, singerName, singerInfo, musiclists, musics);
	}

}
