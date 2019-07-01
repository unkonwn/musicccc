package com.musicweb.entity;

import java.sql.Timestamp;
import java.util.Set;

/**
 * Musiclist entity. @author MyEclipse Persistence Tools
 */
public class Musiclist extends AbstractMusiclist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Musiclist() {
	}

	/** minimal constructor */
	public Musiclist(Pic pic, String musiclistName, Integer musiclistType, Integer musicNum, String musiclistInfo,
			Integer openTimes, Timestamp createTime) {
		super(pic, musiclistName, musiclistType, musicNum, musiclistInfo, openTimes, createTime);
	}

	/** full constructor */
	public Musiclist(Singer singer, Pic pic, String musiclistName, Integer musiclistType, Integer musicNum,
			String musiclistInfo, Integer openTimes, Timestamp createTime, Set users, Set users_1, Set musics) {
		super(singer, pic, musiclistName, musiclistType, musicNum, musiclistInfo, openTimes, createTime, users, users_1,
				musics);
	}

}
