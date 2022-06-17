package ru.mephi.helping;

import java.util.HashMap;
import java.util.Map;

public class NumbersGiver {
    private Randomizer randomizer;

    public Map<Integer, Integer> getDesertNumbers() {
        randomizer = new Randomizer();
        Map<Integer, Integer> map = new HashMap<>();
        int oasisNum = randomizer.getRandom(0, 3);
        map.put(1, oasisNum);
        int ruinsNum = randomizer.getRandom(0, 3);
        map.put(2, ruinsNum);
        int mountNum = randomizer.getRandom(0, 2);
        map.put(3, mountNum);
        int houseNum = randomizer.getRandom(0, 5);
        map.put(4, houseNum);
        return map;
    }

    public Map<Integer, Integer> getForestNumbers() {
        randomizer = new Randomizer();
        Map<Integer, Integer> map = new HashMap<>();
        int caveNum = randomizer.getRandom(0, 3);
        map.put(1, caveNum);
        int riverNum = randomizer.getRandom(0, 2);
        map.put(2, riverNum);
        int rockNum = randomizer.getRandom(2, 5);
        map.put(3, rockNum);
        int treeNum = randomizer.getRandom(20, 30);
        map.put(4, treeNum);
        int houseNum = randomizer.getRandom(0, 5);
        map.put(5, houseNum);
        return map;
    }

    public Map<Integer, Integer> getTundraNumbers() {
        randomizer = new Randomizer();
        Map<Integer, Integer> map = new HashMap<>();
        int caveNum = randomizer.getRandom(0, 3);
        map.put(1, caveNum);
        int houseNum = randomizer.getRandom(2, 5);
        map.put(2, houseNum);
        int iceNum = randomizer.getRandom(1, 5);
        map.put(3, iceNum);
        int riverNum = randomizer.getRandom(0, 2);
        map.put(4, riverNum);
        int rockNum = randomizer.getRandom(3, 5);
        map.put(5, rockNum);
        int treeNum = randomizer.getRandom(10, 20);
        map.put(6, treeNum);
        return map;
    }

    public Map<Integer, Integer> getVillageNumbers() {
        randomizer = new Randomizer();
        Map<Integer, Integer> map = new HashMap<>();
        int houseNum = randomizer.getRandom(6, 15);
        map.put(1, houseNum);
        int pubNum = randomizer.getRandom(1, 3);
        map.put(2, pubNum);
        int riverNum = randomizer.getRandom(1, 3);
        map.put(3, riverNum);
        int rockNum = randomizer.getRandom(3, 6);
        map.put(4, rockNum);
        int treeNum = randomizer.getRandom(10, 20);
        map.put(5, treeNum);
        return map;
    }

}
