package ru.mephi.multipleObjects;

import ru.mephi.objects.Rock;

import java.util.ArrayList;
import java.util.List;

public class RockList extends ObjList{
    private List<Rock> rockList;

    public RockList(int number){
        rockList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            Rock rock = new Rock();
            rockList.add(rock);
        }
    }
}