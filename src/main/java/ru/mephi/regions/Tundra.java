package ru.mephi.regions;

import ru.mephi.helping.NumbersGiver;
import ru.mephi.objectsOfInterest.Cave;
import ru.mephi.objectsOfInterest.Glacier;
import ru.mephi.objectsOfInterest.Village;

import java.util.ArrayList;
import java.util.List;

public class Tundra extends Region{
    private NumbersGiver numbersGiver = new NumbersGiver();
    private List<Cave> caveList;
    private List<Glacier> glacierList;
    private List<Village> villageList;
    private String imagePath = "file:/C:\\Users\\Елена\\IdeaProjects\\exam\\exam\\src\\main\\resources\\tundraPic.jpg";

    @Override
    public String getImagePath() {
        return imagePath;
    }

    public void fillGlacierList(int glacierNum) {
        glacierList = new ArrayList<>();
        for (int i = 0; i < glacierNum; i++) {
            int iceNum = numbersGiver.getGlacierNumbers().get(1);
            Glacier glacier = new Glacier(iceNum);
            glacierList.add(glacier);
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

    public Tundra(int caveNum, int villageNum, int glacierNum) {
        fillCaveList(caveNum);
        fillSmallVillageList(villageNum);
        fillGlacierList(glacierNum);
        getObjectOfInterestList().addAll(caveList);
        getObjectOfInterestList().addAll(glacierList);
        getObjectOfInterestList().addAll(villageList);
    }

    @Override
    public String getName() {
        return "tundra";
    }

}
