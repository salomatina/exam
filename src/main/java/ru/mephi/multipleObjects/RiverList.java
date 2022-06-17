package ru.mephi.multipleObjects;

import ru.mephi.objects.River;

import java.util.ArrayList;
import java.util.List;

public class RiverList extends ObjList{
    private List<River> riverList;

    public RiverList(int number){
        riverList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            River river = new River();
            riverList.add(river);
        }
    }
}
