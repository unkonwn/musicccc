package com.musicweb.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractMusiclist entity provides the base persistence definition of the
 * Musiclist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMusiclist implements java.io.Serializable {

	// Fields

	private Integer musiclistId;
	private Singer singer;
	private Pic pic;
	private String musiclistName;
	private Integer musiclistType;
	private Integer musicNum;
	private String musiclistInfo;
	private Integer openTimes;
	private Timestamp createTime;
	private Set users = new HashSet(0);
	private Set users_1 = new HashSet(0);
	private Set musics = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractMusiclist() {
	}

	/** minimal constructor */
	public AbstractMusiclist(Pic pic, String musiclistName, Integer musiclistType, Integer musicNum,
			String musiclistInfo, Integer openTimes, Timestamp createTime) {
		this.pic = pic;
		this.musiclistName = musiclistName;
		this.musiclistType = musiclistType;
		this.musicNum = musicNum;
		this.musiclistInfo = musiclistInfo;
		this.openTimes = openTimes;
		this.createTime = createTime;
	}

	/** full constructor */
	public AbstractMusiclist(Singer singer, Pic pic, String musiclistName, Integer musiclistType, Integer musicNum,
			String musiclistInfo, Integer openTimes, Timestamp createTime, Set users, Set users_1, Set musics) {
		this.singer = singer;
		this.pic = pic;
		this.musiclistName = musiclistName;
		this.musiclistType = musiclistType;
		this.musicNum = musicNum;
		this.musiclistInfo = musiclistInfo;
		this.openTimes = openTimes;
		this.createTime = createTime;
		this.users = users;
		this.users_1 = users_1;
		this.musics = musics;
	}

	// Property accessors

	public Integer getMusiclistId() {
		return this.musiclistId;
	}

	public void setMusiclistId(Integer musiclistId) {
		this.musiclistId = musiclistId;
	}

	public Singer getSinger() {
		return this.singer;
	}

	public void setSinger(Singer singer) {
		this.singer = singer;
	}

	public Pic getPic() {
		return this.pic;
	}

	public void setPic(Pic pic) {
		this.pic = pic;
	}

	public String getMusiclistName() {
		return this.musiclistName;
	}

	public void setMusiclistName(String musiclistName) {
		this.musiclistName = musiclistName;
	}

	public Integer getMusiclistType() {
		return this.musiclistType;
	}

	public void setMusiclistType(Integer musiclistType) {
		this.musiclistType = musiclistType;
	}

	public Integer getMusicNum() {
		return this.musicNum;
	}

	public void setMusicNum(Integer musicNum) {
		this.musicNum = musicNum;
	}

	public String getMusiclistInfo() {
		return this.musiclistInfo;
	}

	public void setMusiclistInfo(String musiclistInfo) {
		this.musiclistInfo = musiclistInfo;
	}

	public Integer getOpenTimes() {
		return this.openTimes;
	}

	public void setOpenTimes(Integer openTimes) {
		this.openTimes = openTimes;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

	public Set getUsers_1() {
		return this.users_1;
	}

	public void setUsers_1(Set users_1) {
		this.users_1 = users_1;
	}

	public Set getMusics() {
		return this.musics;
	}

	public void setMusics(Set musics) {
		this.musics = musics;
	}

}