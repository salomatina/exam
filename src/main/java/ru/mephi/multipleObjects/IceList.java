package ru.mephi.multipleObjects;

import ru.mephi.objects.Ice;

import java.util.ArrayList;
import java.util.List;

public class IceList extends ObjList{
    private List<Ice> iceList;

    public IceList(int number){
        iceList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            Ice ice = new Ice();
            iceList.add(ice);
        }
    }
}
