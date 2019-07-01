package com.musicweb.entity;

import java.util.Set;

/**
 * Pic entity. @author MyEclipse Persistence Tools
 */
public class Pic extends AbstractPic implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Pic() {
	}

	/** minimal constructor */
	public Pic(Double picSize, String picUrl) {
		super(picSize, picUrl);
	}

	/** full constructor */
	public Pic(Double picSize, String picUrl, Set musiclists, Set singers, Set users) {
		super(picSize, picUrl, musiclists, singers, users);
	}

}
