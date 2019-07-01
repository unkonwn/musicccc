package com.musicweb.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractMusic entity provides the base persistence definition of the Music
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMusic implements java.io.Serializable {

	// Fields

	private Integer musicId;
	private String musicName;
	private String musicLyrics;
	private Integer playTimes;
	private String musicPath;
	private Integer picId;
	private Set comments = new HashSet(0);
	private Set singers = new HashSet(0);
	private Set musiclists = new HashSet(0);
	private Set attributeValues = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractMusic() {
	}

	/** minimal constructor */
	public AbstractMusic(String musicName, String musicLyrics, Integer playTimes, String musicPath, Integer picId) {
		this.musicName = musicName;
		this.musicLyrics = musicLyrics;
		this.playTimes = playTimes;
		this.musicPath = musicPath;
		this.picId = picId;
	}

	/** full constructor */
	public AbstractMusic(String musicName, String musicLyrics, Integer playTimes, String musicPath, Integer picId,
			Set comments, Set singers, Set musiclists, Set attributeValues) {
		this.musicName = musicName;
		this.musicLyrics = musicLyrics;
		this.playTimes = playTimes;
		this.musicPath = musicPath;
		this.picId = picId;
		this.comments = comments;
		this.singers = singers;
		this.musiclists = musiclists;
		this.attributeValues = attributeValues;
	}

	// Property accessors

	public Integer getMusicId() {
		return this.musicId;
	}

	public void setMusicId(Integer musicId) {
		this.musicId = musicId;
	}

	public String getMusicName() {
		return this.musicName;
	}

	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}

	public String getMusicLyrics() {
		return this.musicLyrics;
	}

	public void setMusicLyrics(String musicLyrics) {
		this.musicLyrics = musicLyrics;
	}

	public Integer getPlayTimes() {
		return this.playTimes;
	}

	public void setPlayTimes(Integer playTimes) {
		this.playTimes = playTimes;
	}

	public String getMusicPath() {
		return this.musicPath;
	}

	public void setMusicPath(String musicPath) {
		this.musicPath = musicPath;
	}

	public Integer getPicId() {
		return this.picId;
	}

	public void setPicId(Integer picId) {
		this.picId = picId;
	}

	public Set getComments() {
		return this.comments;
	}

	public void setComments(Set comments) {
		this.comments = comments;
	}

	public Set getSingers() {
		return this.singers;
	}

	public void setSingers(Set singers) {
		this.singers = singers;
	}

	public Set getMusiclists() {
		return this.musiclists;
	}

	public void setMusiclists(Set musiclists) {
		this.musiclists = musiclists;
	}

	public Set getAttributeValues() {
		return this.attributeValues;
	}

	public void setAttributeValues(Set attributeValues) {
		this.attributeValues = attributeValues;
	}

}