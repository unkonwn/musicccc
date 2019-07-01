package com.musicweb.dao;

import org.hibernate.Session;

import com.musicweb.entity.UserInformation;
import com.musicweb.util.HibernateSessionFactory;

public class userInfoDaoImpl implements userInfoDao{

	@Override
	public boolean getUser(int userId) {
		Session session = HibernateSessionFactory.getSession();
		
		return false;
	}



}
