package ru.mephi.world;

import ru.mephi.helping.NumbersGiver;
import ru.mephi.regions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class World {
    private List<Desert> desertList;
    private List<Forest> forestList;
    private List<Tundra> tundraList;
    private List<Village> villageList;
    private List<Region> allRegionsList;
    private NumbersGiver numbersGiver = new NumbersGiver();

    public World(int desertNum, int forestNum, int tundraNum, int villageNum) {
        initializeDesert(desertNum);
        initializeForest(forestNum);
        initializeTundra(tundraNum);
        initializeVillage(villageNum);
        allRegionsList = new ArrayList<>();
        allRegionsList.addAll(desertList);
        allRegionsList.addAll(forestList);
        allRegionsList.addAll(tundraList);
        allRegionsList.addAll(villageList);
        Collections.shuffle(allRegionsList);
    }

    public void initializeDesert(int desertNum) {
        desertList = new ArrayList<>();
        for (int i = 0; i < desertNum ; i++) {
            Map<Integer, Integer> map = numbersGiver.getDesertNumbers();
            int oasisNum = map.get(1);
            int ruinsNum = map.get(2);
            int mountainsNum = map.get(3);
            int houseNum = map.get(4);
            Desert desert = new Desert(oasisNum, ruinsNum, mountainsNum, houseNum);
            desertList.add(desert);
        }
    }

    public void initializeForest(int forestNum) {
        forestList = new ArrayList<>();
        for (int i = 0; i < forestNum; i++) {
            Map<Integer, Integer> map = numbersGiver.getForestNumbers();
            int caveNum = map.get(1);
            int riverNum = map.get(2);
            int rockNum = map.get(3);
            int treeNum = map.get(4);
            int houseNum = map.get(5);
            Forest forest = new Forest(caveNum, riverNum, rockNum, treeNum, houseNum);
            forestList.add(forest);
        }
    }

    public void initializeTundra(int tundraNum) {
        tundraList = new ArrayList<>();
        for (int i = 0; i < tundraNum; i++) {
            Map<Integer, Integer> map = numbersGiver.getTundraNumbers();
            int caveNum = map.get(1);
            int houseNum = map.get(2);
            int iceNum = map.get(3);
            int riverNum = map.get(4);
            int rockNum = map.get(5);
            int treeNum = map.get(6);
            Tundra tundra = new Tundra(caveNum, houseNum, iceNum, riverNum, rockNum, treeNum);
            tundraList.add(tundra);
        }
    }

    public void initializeVillage(int villageNum) {
        villageList = new ArrayList<>();
        for (int i = 0; i < villageNum; i++) {
            Map<Integer, Integer> map = numbersGiver.getVillageNumbers();
            int houseNum = map.get(1);
            int pubNum = map.get(2);
            int riverNum = map.get(3);
            int rockNum = map.get(4);
            int treeNum = map.get(5);
            Village village = new Village(houseNum, pubNum, riverNum, rockNum, treeNum);
            villageList.add(village);
        }
    }

    public List<Desert> getDesertList() {
        return desertList;
    }

    public List<Forest> getForestList() {
        return forestList;
    }

    public List<Tundra> getTundraList() {
        return tundraList;
    }

    public List<Village> getVillageList() {
        return villageList;
    }

    public List<Region> getAllRegionsList() {
        return allRegionsList;
    }
}
