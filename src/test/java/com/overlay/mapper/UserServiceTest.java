package com.overlay.mapper;

import com.overlay.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Mock
    private UserMapper userMapper;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSaveUser() {
        User user = mock(User.class);
        userService.saveUser(user);
        verify(userMapper, times(1)).saveUser(user);
    }

    @Test
    void testDeleteUserById() {
        Long id = 1L;
        userService.deleteUserById(id);
        verify(userMapper, times(1)).deleteUserById(id);
    }

    @Test
    void testUpdateUser() {
        Long id = 1L;
        String name = "Test";
        String password = "123";
        userService.updateUser(id, name, password);
        verify(userMapper, times(1)).updateUser(id, name, password);
    }

    @Test
    void testGetAll() {
        User user1 = mock(User.class);
        User user2 = mock(User.class);
        List<User> users = Arrays.asList(user1, user2);
        when(userMapper.getAll()).thenReturn(users);
        List<User> result = userService.getAll();
        assertEquals(2, result.size());
        verify(userMapper, times(1)).getAll();
    }

    @Test
    void testFindById() {
        Long id = 1L;
        User user = mock(User.class);
        when(userMapper.findById(id)).thenReturn(user);
        User result = userService.findById(id);
        assertEquals(user, result);
        verify(userMapper, times(1)).findById(id);
    }
}
