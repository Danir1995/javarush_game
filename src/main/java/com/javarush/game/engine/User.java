package com.javarush.game.engine;

import lombok.Data;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

@Data
public class User {

    private String userName;
    private List<String> items = new ArrayList<>();
    private int attempts;
    public void addItems(String item){
        items.add(item);
    }

    public void useItem(String item){
         items.remove(item);
    }

    public void removeItems(){
        items.clear();
    }

}