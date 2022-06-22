package ru.mephi.objectsOfInterest;

import ru.mephi.elements.Mountain;

import java.util.ArrayList;
import java.util.List;

public class Ruin extends Obj{
    private List<Mountain> mountainList;

    public Ruin(int forNum, int mountNum) {
        super(0, forNum);
        fillMountList(mountNum);
        getObjectList().addAll(mountainList);
    }

    @Override
    public String toString() {
        return "Ruin";
    }

    public void fillMountList(int mountNum) {
        mountainList = new ArrayList<>();
        for (int i = 0; i < mountNum; i++) {
            Mountain mountain = new Mountain();
            mountainList.add(mountain);
        }
    }
}
