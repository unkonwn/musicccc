package com.musicweb.entity;

import java.sql.Timestamp;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
public class User extends AbstractUser implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(Pic pic, String userName, String userPassword) {
		super(pic, userName, userPassword);
	}

	/** full constructor */
	public User(Pic pic, String userName, String userPassword, Timestamp userBirthdate, String userSex,
			String userHabit, Set musiclists, Set musiclists_1, Set comments) {
		super(pic, userName, userPassword, userBirthdate, userSex, userHabit, musiclists, musiclists_1, comments);
	}

}
