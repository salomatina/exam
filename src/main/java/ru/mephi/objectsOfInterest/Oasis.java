package ru.mephi.objectsOfInterest;

import ru.mephi.elements.*;
import ru.mephi.keyElements.Fire;
import ru.mephi.keyElements.Tree;

import java.util.ArrayList;
import java.util.List;

public class Oasis extends Obj{
    private List<River> riverList;

    public Oasis(int riverNum, int forNum) {
        super(0, forNum);
        fillRiverList(riverNum);
        getObjectList().addAll(riverList);
    }

    public void fillRiverList(int riverNum) {
        riverList = new ArrayList<>();
        for (int i = 0; i < riverNum; i++) {
            River river = new River();
            riverList.add(river);
        }
    }

    @Override
    public String toString() {
        return "Oasis";
    }
}
