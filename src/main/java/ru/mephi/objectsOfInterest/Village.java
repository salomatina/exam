package ru.mephi.objectsOfInterest;

import ru.mephi.elements.*;

import java.util.ArrayList;
import java.util.List;

public class Village extends Obj{
    private List<Mountain> mountainList;
    private List<Pub> pubList;
    private List<River> riverList;

    public Village(int houseNum, int smForNum, int mountNum, int pubNum, int riverNum) {
        super(houseNum, smForNum);
        fillMountainList(mountNum);
        fillPubList(pubNum);
        fillRiverList(riverNum);
        getObjectList().addAll(mountainList);
        getObjectList().addAll(pubList);
        getObjectList().addAll(riverList);
    }

    public void fillRiverList(int riverNum) {
        riverList = new ArrayList<>();
        for (int i = 0; i < riverNum; i++) {
            River river = new River();
            riverList.add(river);
        }
    }

    public void fillPubList(int pubNum) {
        pubList = new ArrayList<>();
        for (int i = 0; i < pubNum; i++) {
            Pub pub = new Pub();
            pubList.add(pub);
        }
    }

    public void fillMountainList(int mountNum) {
        mountainList = new ArrayList<>();
        for (int i = 0; i < mountNum; i++) {
            Mountain mountain = new Mountain();
            mountainList.add(mountain);
        }
    }

    @Override
    public String toString() {
        return "Village";
    }
}
