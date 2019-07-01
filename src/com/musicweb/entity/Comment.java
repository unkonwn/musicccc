package com.musicweb.entity;

import java.sql.Timestamp;

/**
 * Comment entity. @author MyEclipse Persistence Tools
 */
public class Comment extends AbstractComment implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Comment() {
	}

	/** full constructor */
	public Comment(Music music, User user, String commentContent, Timestamp commentTime) {
		super(music, user, commentContent, commentTime);
	}

}
