package com.musicweb.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.musicweb.entity.*;
import com.musicweb.util.HibernateSessionFactory;
import com.musicweb.util.PageItem;

public class UserDaoImpl implements UserDao{

    public Transaction transaction;


    @Override
    public User getUser(int userId) {
        // TODO implement here
        return null;
    }

    @Override
    public boolean createMyMusicList(Musiclist music) {
        // TODO implement here
        return false;
    }

    @Override
    public boolean addCollectedMusicList(Musiclist music) {
        // TODO implement here
        return false;
    }

    @Override
    public boolean deletMyMusicList(Musiclist music) {
        // TODO implement here
        return false;
    }

    @Override
    public boolean deletCreatedMusicList(Musiclist music) {
        // TODO implement here
        return false;
    }

    @Override
    public boolean updatePassword(String password) {
        // TODO implement here
        return false;
    }

    @Override
    public boolean updateHeadImage(String url) {
        // TODO implement here
        return false;
    }

    @Override
    public boolean insertUser(User user) {
        // TODO implement here
        return false;
    }

    @Override
    public boolean deletUser(int userId) {
        // TODO implement here
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        // TODO implement here
        return false;
    }

    @Override
    public boolean addComment(Comment comment) {
        // TODO implement here
        return false;
    }

    @Override
    public boolean deletComment(Comment comment) {
        // TODO implement here
        return false;
    }

    @Override
    public List<PageItem> getComments(int pageNum, int pageSize, String sortWay, String sortItem) {
        // TODO implement here
        return null;
    }

    @Override
    public List<PageItem> getMyMusicLists(int pageNum, int pageSize, String sortWay, String sortItem) {
        // TODO implement here
        return null;
    }

    @Override
    public List<PageItem> getCollectedMusicLists(int pageNum, int pageSize, String sortWay, String sortItem) {
        // TODO implement here
        return null;
    }


}
