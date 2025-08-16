package com.overlay.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.TestInstance;

import com.overlay.mapper.UserService;
import com.overlay.model.User;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class UserMapperTest {

	@Autowired
	UserService service;

	@Test
	void test() {
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
}
