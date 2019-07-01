package com.musicweb.dao;

import org.hibernate.Session;

import com.musicweb.entity.*;
import com.musicweb.util.HibernateSessionFactory;

public class UserDaoImpl implements UserInfoDao{

    public Transaction transaction = new Transaction();


    public User getUser(int userId) {
        // TODO implement here
        return null;
    }

    public boolean createMyMusicList(MusicList music) {
        // TODO implement here
        return false;
    }

    public boolean addCollectedMusicList(MusicList music) {
        // TODO implement here
        return false;
    }

    public boolean deletMyMusicList(MusicList music) {
        // TODO implement here
        return false;
    }

    public boolean deletMyMusicList(MusicList music) {
        // TODO implement here
        return false;
    }

    public boolean updatePassword(String password) {
        // TODO implement here
        return false;
    }

    public boolean updateHeadImage(String url) {
        // TODO implement here
        return false;
    }

    public boolean insertUser(User user) {
        // TODO implement here
        return false;
    }

    public boolean deletUser(int userId) {
        // TODO implement here
        return false;
    }

    public boolean updateUser(User user) {
        // TODO implement here
        return false;
    }

    public boolean addComment(Comment comment) {
        // TODO implement here
        return false;
    }

    public boolean deletComment(Comment comment) {
        // TODO implement here
        return false;
    }

    public pageUtil getComments(int pageNum, int pageSize, String sortWay, String sortItem) {
        // TODO implement here
        return null;
    }

    public pageUtil getMyMusicLists(int pageNum, int pageSize, String sortWay, String sortItem) {
        // TODO implement here
        return null;
    }

    public pageUtil getCollectedMusicLists(int pageNum, int pageSize, String sortWay, String sortItem) {
        // TODO implement here
        return null;
    }


}
