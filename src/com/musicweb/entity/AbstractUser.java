package com.musicweb.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractUser entity provides the base persistence definition of the User
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUser implements java.io.Serializable {

	// Fields

	private Integer userId;
	private Pic pic;
	private String userName;
	private String userPassword;
	private Timestamp userBirthdate;
	private String userSex;
	private String userHabit;
	private Set musiclists = new HashSet(0);
	private Set musiclists_1 = new HashSet(0);
	private Set comments = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractUser() {
	}

	/** minimal constructor */
	public AbstractUser(Pic pic, String userName, String userPassword) {
		this.pic = pic;
		this.userName = userName;
		this.userPassword = userPassword;
	}

	/** full constructor */
	public AbstractUser(Pic pic, String userName, String userPassword, Timestamp userBirthdate, String userSex,
			String userHabit, Set musiclists, Set musiclists_1, Set comments) {
		this.pic = pic;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userBirthdate = userBirthdate;
		this.userSex = userSex;
		this.userHabit = userHabit;
		this.musiclists = musiclists;
		this.musiclists_1 = musiclists_1;
		this.comments = comments;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Pic getPic() {
		return this.pic;
	}

	public void setPic(Pic pic) {
		this.pic = pic;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Timestamp getUserBirthdate() {
		return this.userBirthdate;
	}

	public void setUserBirthdate(Timestamp userBirthdate) {
		this.userBirthdate = userBirthdate;
	}

	public String getUserSex() {
		return this.userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getUserHabit() {
		return this.userHabit;
	}

	public void setUserHabit(String userHabit) {
		this.userHabit = userHabit;
	}

	public Set getMusiclists() {
		return this.musiclists;
	}

	public void setMusiclists(Set musiclists) {
		this.musiclists = musiclists;
	}

	public Set getMusiclists_1() {
		return this.musiclists_1;
	}

	public void setMusiclists_1(Set musiclists_1) {
		this.musiclists_1 = musiclists_1;
	}

	public Set getComments() {
		return this.comments;
	}

	public void setComments(Set comments) {
		this.comments = comments;
	}

}