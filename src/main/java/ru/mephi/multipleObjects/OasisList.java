package ru.mephi.multipleObjects;

import ru.mephi.objects.Oasis;

import java.util.ArrayList;
import java.util.List;

public class OasisList extends ObjList{
    private List<Oasis> oasisList;

    public OasisList(int number){
        oasisList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            Oasis oasis = new Oasis();
            oasisList.add(oasis);
        }
    }
}
