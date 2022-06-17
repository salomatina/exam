package ru.mephi.multipleObjects;

import ru.mephi.objects.House;

import java.util.ArrayList;
import java.util.List;

public class HouseList extends ObjList{
    private List<House> houseList;

    public HouseList(int number){
        houseList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            House house = new House();
            houseList.add(house);
        }
    }

    public void addHouse(House house) {
        houseList.add(house);
    }
}