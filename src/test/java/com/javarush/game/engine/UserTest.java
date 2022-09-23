package com.javarush.game.engine;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class UserTest {
    @Spy
    UserRepository mockRepository = new UserRepository();
    @Spy
    User mockUser = new User();
    @Test
    void userNameIsCorrect() {
        mockUser.setUserName("dan");
        String expected = "dan";
        String actual = mockUser.getUserName();
        assertEquals(expected, actual);
    }

    @Test
    void addingOfUserIsCorrect(){
        mockUser.addItems("knife");
        String expected = "knife";
        String actual = mockUser.getItems().get(0);
        assertEquals(expected, actual);
    }

    @Test
    void ifItemsOfUserWereRemoved(){
        mockUser.addItems("balloon");
        mockUser.removeItems();
        assertEquals(0, mockUser.getItems().size());
    }

    @Test
    void ifItemsExists(){
        assertNotNull(mockUser.getItems());
    }

    @Test
    void ifItemWasUsed(){
        mockUser.addItems("ball");
        mockUser.useItem("ball");
        assertEquals(0, mockUser.getItems().size());
    }


}