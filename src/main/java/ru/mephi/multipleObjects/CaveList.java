package ru.mephi.multipleObjects;

import ru.mephi.objects.Cave;

import java.util.ArrayList;
import java.util.List;

public class CaveList extends ObjList{
    private List<Cave> caveList;

    public CaveList(int number){
        caveList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            Cave cave = new Cave();
            caveList.add(cave);
        }
    }
}