package ru.mephi.multipleObjects;

import ru.mephi.objects.Swamp;

import java.util.ArrayList;
import java.util.List;

public class SwampList extends ObjList{
    private final List<Swamp> swampList;

    public SwampList(int number){
        swampList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            Swamp swamp = new Swamp();
            swampList.add(swamp);
        }
    }
}
