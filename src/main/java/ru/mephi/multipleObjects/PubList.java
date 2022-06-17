package ru.mephi.multipleObjects;

import ru.mephi.objects.Pub;

import java.util.ArrayList;
import java.util.List;

public class PubList extends ObjList{
    private List<Pub> pubList;

    public PubList(int number){
        pubList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            Pub pub = new Pub();
            pubList.add(pub);
        }
    }
}
