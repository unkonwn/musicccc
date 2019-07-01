package com.musicweb.dao;

import com.musicweb.entity.*;

public interface UserDao {
	public User getUserById(int userId);
	public boolean createMyMusiclist(Musiclist musiclist);
	public boolean addMusiclist(Musiclist musiclist);
	public boolean deletMyMusiclist(Musiclist musiclist);
	public boolean deletColMusiclist(Musiclist musiclist);
	

}
