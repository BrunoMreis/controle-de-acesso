package com.overlay.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.overlay.model.User;

@Mapper
public interface UserMapper {

	public List<User> getAll();
	
	public User findById(Long id);
	
	public void saveUser(User user);

	public void deleteUserById(Long id);

	public void updateUser(@Param("id") Long id, @Param("userName") String userName,
			@Param("passWord") String passWord);

}
