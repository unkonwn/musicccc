package com.musicweb.entity;

import java.util.Set;

/**
 * Music entity. @author MyEclipse Persistence Tools
 */
public class Music extends AbstractMusic implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Music() {
	}

	/** minimal constructor */
	public Music(String musicName, String musicLyrics, Integer playTimes, String musicPath, Integer picId) {
		super(musicName, musicLyrics, playTimes, musicPath, picId);
	}

	/** full constructor */
	public Music(String musicName, String musicLyrics, Integer playTimes, String musicPath, Integer picId, Set comments,
			Set singers, Set musiclists, Set attributeValues) {
		super(musicName, musicLyrics, playTimes, musicPath, picId, comments, singers, musiclists, attributeValues);
	}

}
