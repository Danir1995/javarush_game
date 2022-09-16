package com.javarush.game.engine;

import lombok.Data;

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

    public String useItem(int item){
        return items.remove(item);
    }

    public void removeItems(){
        items.clear();
    }

}