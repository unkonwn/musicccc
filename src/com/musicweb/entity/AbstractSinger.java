package com.musicweb.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractSinger entity provides the base persistence definition of the Singer
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSinger implements java.io.Serializable {

	// Fields

	private Integer singerId;
	private Pic pic;
	private String singerName;
	private String singerInfo;
	private Set musiclists = new HashSet(0);
	private Set musics = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractSinger() {
	}

	/** minimal constructor */
	public AbstractSinger(Pic pic, String singerName, String singerInfo) {
		this.pic = pic;
		this.singerName = singerName;
		this.singerInfo = singerInfo;
	}

	/** full constructor */
	public AbstractSinger(Pic pic, String singerName, String singerInfo, Set musiclists, Set musics) {
		this.pic = pic;
		this.singerName = singerName;
		this.singerInfo = singerInfo;
		this.musiclists = musiclists;
		this.musics = musics;
	}

	// Property accessors

	public Integer getSingerId() {
		return this.singerId;
	}

	public void setSingerId(Integer singerId) {
		this.singerId = singerId;
	}

	public Pic getPic() {
		return this.pic;
	}

	public void setPic(Pic pic) {
		this.pic = pic;
	}

	public String getSingerName() {
		return this.singerName;
	}

	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}

	public String getSingerInfo() {
		return this.singerInfo;
	}

	public void setSingerInfo(String singerInfo) {
		this.singerInfo = singerInfo;
	}

	public Set getMusiclists() {
		return this.musiclists;
	}

	public void setMusiclists(Set musiclists) {
		this.musiclists = musiclists;
	}

	public Set getMusics() {
		return this.musics;
	}

	public void setMusics(Set musics) {
		this.musics = musics;
	}

}