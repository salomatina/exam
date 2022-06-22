package ru.mephi.regions;

import ru.mephi.elements.SmallForest;
import ru.mephi.helping.NumbersGiver;
import ru.mephi.objectsOfInterest.Cave;
import ru.mephi.objectsOfInterest.Village;

import java.util.ArrayList;
import java.util.List;

public class Forest extends Region{
    private List<Cave> caveList;
    private List<SmallForest> smallForestList;
    private List<Village> villageList;
    private NumbersGiver numbersGiver = new NumbersGiver();
    private String imagePath = "file:/C:\\Users\\Елена\\IdeaProjects\\exam\\exam\\src\\main\\resources\\forestPicture.jpeg";

    @Override
    public String getImagePath() {
        return imagePath;
    }

    public Forest(int caveNum, int forNum, int villageNum) {
        fillCaveList(caveNum);
        fillSmallForestList(forNum);
        fillSmallVillageList(villageNum);
        getObjectOfInterestList().addAll(caveList);
        getObjectOfInterestList().addAll(villageList);
    }

    public void fillSmallVillageList(int villageNum) {
        villageList = new ArrayList<>();
        for (int i = 0; i < villageNum; i++) {
            int n1 = numbersGiver.getVillageNumbers().get(1);
            int n2 = numbersGiver.getVillageNumbers().get(2);
            int n3 = numbersGiver.getVillageNumbers().get(3);
            int n4 = numbersGiver.getVillageNumbers().get(4);
            int n5 = numbersGiver.getVillageNumbers().get(5);
            Village village = new Village(n1, n2, n3, n4, n5);
            villageList.add(village);
        }
    }

    public void fillSmallForestList(int forNum) {
        smallForestList = new ArrayList<>();
        for (int i = 0; i < forNum; i++) {
            SmallForest smallForest = new SmallForest(forNum);
            smallForestList.add(smallForest);
        }
    }

    public void fillCaveList(int caveNum) {
        caveList = new ArrayList<>();
        for (int i = 0; i < caveNum; i++) {
            int iceNum = numbersGiver.getCaveNumbers().get(1);
            Cave cave = new Cave(iceNum);
            caveList.add(cave);
        }
    }

    public List<Cave> getCaveList() {
        return caveList;
    }

    @Override
    public String getName() {
        return "forest";
    }

}
