package ru.mephi.objectsOfInterest;

import ru.mephi.keyElements.Fire;
import ru.mephi.elements.Ice;

import java.util.ArrayList;
import java.util.List;

public class Cave extends Obj{
    private List<Ice> iceList;

    public Cave(int iceNum) {
        super(0, 0);
        fillIceList(iceNum);
        getObjectList().addAll(iceList);
    }

    public void fillIceList(int iceNum) {
        iceList = new ArrayList<>();
        for (int i = 0; i < iceNum; i++) {
            Ice ice = new Ice();
            iceList.add(ice);
        }
    }

    @Override
    public String toString() {
        return "Cave";
    }
}
