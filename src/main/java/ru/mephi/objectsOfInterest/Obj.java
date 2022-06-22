package ru.mephi.objectsOfInterest;

import ru.mephi.elements.Element;
import ru.mephi.elements.SmallForest;
import ru.mephi.keyElements.Fire;
import ru.mephi.keyElements.House;

import java.util.ArrayList;
import java.util.List;

public abstract class Obj {
    private List<House> houseList;
    private List<Fire> fireList = new ArrayList<>();
    private SmallForest smallForest;
    private List<Element> objectList;

    public List<Element> getObjectList() {
        return objectList;
    }

    public Obj(int houseNum, int forNum) {
        houseList = new ArrayList<>();
        for (int i = 0; i < houseNum; i++) {
            House house = new House();
            houseList.add(house);
        }
        smallForest = new SmallForest(forNum);
        objectList = new ArrayList<>();
        objectList.add(smallForest);
        objectList.addAll(houseList);
        objectList.addAll(fireList);
    }

    public void removeTree() throws OutOfTreesException {
        if (smallForest.getTreeList().size() > 0) {
            smallForest.removeTree();
        }
        else {
            throw new OutOfTreesException();
        }
    }

    public void addHouse(House house) {
        houseList.add(house);
        objectList.add(house);
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public List<Fire> getFireList() {
        return fireList;
    }

    public void addFire(Fire fire) throws FireInTheVillageException {
        if (this instanceof Village) {
            throw new FireInTheVillageException();
        }
        else {
            if (fireList == null) {
                fireList = new ArrayList<>();
            }
            fireList.add(fire);
            objectList.add(fire);
        }

    }

    @Override
    public String toString() {
        return "objectOfInterest";
    }

    public SmallForest getSmallForestList() {
        return smallForest;
    }
}
