package ru.mephi.multipleObjects;

import ru.mephi.objects.Ruin;

import java.util.ArrayList;
import java.util.List;

public class RuinsList extends ObjList{
    private List<Ruin> ruinsList;

    public RuinsList(int number){
        ruinsList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            Ruin ruin = new Ruin();
            ruinsList.add(ruin);
        }
    }
}