package com.musicweb.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractPic entity provides the base persistence definition of the Pic
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPic implements java.io.Serializable {

	// Fields

	private Integer picId;
	private Double picSize;
	private String picUrl;
	private Set musiclists = new HashSet(0);
	private Set singers = new HashSet(0);
	private Set users = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractPic() {
	}

	/** minimal constructor */
	public AbstractPic(Double picSize, String picUrl) {
		this.picSize = picSize;
		this.picUrl = picUrl;
	}

	/** full constructor */
	public AbstractPic(Double picSize, String picUrl, Set musiclists, Set singers, Set users) {
		this.picSize = picSize;
		this.picUrl = picUrl;
		this.musiclists = musiclists;
		this.singers = singers;
		this.users = users;
	}

	// Property accessors

	public Integer getPicId() {
		return this.picId;
	}

	public void setPicId(Integer picId) {
		this.picId = picId;
	}

	public Double getPicSize() {
		return this.picSize;
	}

	public void setPicSize(Double picSize) {
		this.picSize = picSize;
	}

	public String getPicUrl() {
		return this.picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public Set getMusiclists() {
		return this.musiclists;
	}

	public void setMusiclists(Set musiclists) {
		this.musiclists = musiclists;
	}

	public Set getSingers() {
		return this.singers;
	}

	public void setSingers(Set singers) {
		this.singers = singers;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

}