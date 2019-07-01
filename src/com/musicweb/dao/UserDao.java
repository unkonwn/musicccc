package com.musicweb.dao;

import java.util.List;

import com.musicweb.entity.*;
import com.musicweb.util.PageItem;

public interface UserDao {

	public User getUser(int userId);
	
	public List<PageItem> getCollectedMusicLists(int pageNum, int pageSize, String sortWay, String sortItem);

	public List<PageItem> getMyMusicLists(int pageNum, int pageSize, String sortWay, String sortItem);

	public List<PageItem> getComments(int pageNum, int pageSize, String sortWay, String sortItem);

	public boolean deletComment(Comment comment);

	public boolean addComment(Comment comment);

	public boolean updateUser(User user);

	public boolean deletUser(int userId);

	public boolean createMyMusicList(Musiclist music);

	public boolean addCollectedMusicList(Musiclist music);

	public boolean deletMyMusicList(Musiclist music);

	public boolean deletCreatedMusicList(Musiclist music);

	public boolean updatePassword(String password);

	public boolean updateHeadImage(String url);

	public boolean insertUser(User user);

}
