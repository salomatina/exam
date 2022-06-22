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
    private List<Region> allRegionsList;
    private NumbersGiver numbersGiver = new NumbersGiver();

    public World(int desertNum, int forestNum, int tundraNum) {
        initializeDesert(desertNum);
        initializeForest(forestNum);
        initializeTundra(tundraNum);
        allRegionsList = new ArrayList<>();
        allRegionsList.addAll(desertList);
        allRegionsList.addAll(forestList);
        allRegionsList.addAll(tundraList);
        Collections.shuffle(allRegionsList);
    }

    public void initializeDesert(int desertNum) {
        desertList = new ArrayList<>();
        for (int i = 0; i < desertNum ; i++) {
            Map<Integer, Integer> map = numbersGiver.getDesertNumbers();
            int oasisNum = map.get(1);
            int ruinsNum = map.get(2);
            Desert desert = new Desert(oasisNum, ruinsNum);
            desertList.add(desert);
        }
    }

    public void initializeForest(int forestNum) {
        forestList = new ArrayList<>();
        for (int i = 0; i < forestNum; i++) {
            Map<Integer, Integer> map = numbersGiver.getForestNumbers();
            int caveNum = map.get(1);
            int n2 = map.get(2);
            int n3 = map.get(3);
            Forest forest = new Forest(caveNum, n2, n3);
            forestList.add(forest);
        }
    }

    public void initializeTundra(int tundraNum) {
        tundraList = new ArrayList<>();
        for (int i = 0; i < tundraNum; i++) {
            Map<Integer, Integer> map = numbersGiver.getTundraNumbers();
            int caveNum = map.get(1);
            int villageNum = map.get(2);
            int glacierNum = map.get(3);
            Tundra tundra = new Tundra(caveNum, villageNum, glacierNum);
            tundraList.add(tundra);
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

    public List<Region> getAllRegionsList() {
        return allRegionsList;
    }
}
