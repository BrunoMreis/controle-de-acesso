package com.overlay.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.overlay.model.User;

@Service
public class UserService{
	
    private UserMapper userMapper;

    UserService(@Autowired UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    public void saveUser(User user) {
        userMapper.saveUser(user);
    }

    public void deleteUserById(Long id) {
        userMapper.deleteUserById(id);
    }

    public void updateUser(Long id, String userName, String  passWord) {
        userMapper.updateUser(id, userName, passWord);
    }

	public List<User> getAll() {
		 List<User> list = userMapper.getAll();
		return list;
	}

	public User findById(Long id) {
		return userMapper.findById(id);
	}

}
