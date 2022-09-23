package com.javarush.game.engine;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserRepositoryTest {
    @Spy
    UserRepository mockRepository = new UserRepository();
    @Spy
    User mockUser = new User();

    @Test
    void ifUserIsExists() {
        mockUser.setUserName("dan");
        String expected = "dan";
        mockRepository.save(mockUser);
        assertTrue(mockRepository.isExists(expected));
    }
}