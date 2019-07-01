package com.musicweb.entity;

import java.sql.Timestamp;

/**
 * AbstractComment entity provides the base persistence definition of the
 * Comment entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractComment implements java.io.Serializable {

	// Fields

	private Integer commentId;
	private Music music;
	private User user;
	private String commentContent;
	private Timestamp commentTime;

	// Constructors

	/** default constructor */
	public AbstractComment() {
	}

	/** full constructor */
	public AbstractComment(Music music, User user, String commentContent, Timestamp commentTime) {
		this.music = music;
		this.user = user;
		this.commentContent = commentContent;
		this.commentTime = commentTime;
	}

	// Property accessors

	public Integer getCommentId() {
		return this.commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public Music getMusic() {
		return this.music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getCommentContent() {
		return this.commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public Timestamp getCommentTime() {
		return this.commentTime;
	}

	public void setCommentTime(Timestamp commentTime) {
		this.commentTime = commentTime;
	}

}