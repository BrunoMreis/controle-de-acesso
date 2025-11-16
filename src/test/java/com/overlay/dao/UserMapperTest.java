package com.overlay.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import com.overlay.mapper.UserService;
import com.overlay.model.User;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class UserMapperTest {

	@Autowired
	private UserService service;

	@Test
	void testSaveUser() {
		User user = new User();
		user.setId(1L);
		user.setName("Passaro do capeta");
		user.setEmail("email@email.com");
		// deepcode ignore HardcodedPassword/test: This is a test password
		user.setPassword("1234567sdf");
		service.saveUser(user);
		User userResult = service.findById(1L);
		assertEquals(user.getId(), userResult.getId());
	}

	@Test
	void testDeleteUserById() {
		User user = new User();
		user.setId(1L);
		user.setName("Delete");
		user.setEmail("delete@email.com");
		user.setPassword("123");
		service.saveUser(user);
		Long id = user.getId();
		service.deleteUserById(id);
		List<User> users = service.getAll();
		boolean found = users.stream().anyMatch(u -> "Test".equals(u.getName()));
		org.junit.jupiter.api.Assertions.assertFalse(found, "Usuário salvo encontrado na lista");
	}

	
}
