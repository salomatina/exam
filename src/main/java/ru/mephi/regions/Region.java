package ru.mephi.regions;

import ru.mephi.helping.NumbersGiver;
import ru.mephi.keyElements.Fire;
import ru.mephi.keyElements.House;
import ru.mephi.objectsOfInterest.FireInTheVillageException;
import ru.mephi.objectsOfInterest.Obj;
import ru.mephi.objectsOfInterest.OutOfTreesException;

import java.util.ArrayList;
import java.util.List;

public abstract class Region {
    private List<Region> neighbors = new ArrayList<>();
    private String imagePath;
    private List<Obj> objectOfInterestList = new ArrayList<>();

    public List<Region> getNeighbors() {
        return neighbors;
    }

    public List<Obj> getObjectOfInterestList() {
        return objectOfInterestList;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void removeTreeInRegion(Obj objectOfInterest) throws OutOfTreesException {
        objectOfInterest.removeTree();
    }

    public void burn(Obj objectOfInterest) {
        objectOfInterestList.remove(objectOfInterest);
    }

    public void addHouse(House house, Obj objectOfInterest) {
        objectOfInterest.addHouse(house);
    }

    public void addFire(Fire fire, Obj objectOfInterest) throws FireException, FireInTheVillageException {
        NumbersGiver numbersGiver = new NumbersGiver();
        int probability = numbersGiver.getProbability();
        if (probability == 1) {
            burn(objectOfInterest);
            throw new FireException();
        } else {
            objectOfInterest.addFire(fire);
        }
    }

    public String getName() {
        return "region";
    }


}
