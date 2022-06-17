package ru.mephi.multipleObjects;

import ru.mephi.objects.Mountain;

import java.util.ArrayList;
import java.util.List;

public class MountainList extends ObjList{
    private List<Mountain> mountainList;

    public MountainList(int number){
        mountainList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            Mountain mountain = new Mountain();
            mountainList.add(mountain);
        }
    }
}
