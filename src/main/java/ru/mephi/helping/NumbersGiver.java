package ru.mephi.helping;

import java.util.HashMap;
import java.util.Map;

public class NumbersGiver {
    private Randomizer randomizer;

    public Map<Integer, Integer> getDesertNumbers() {
        randomizer = new Randomizer();
        Map<Integer, Integer> map = new HashMap<>();
        int oasisNum = randomizer.getRandom(1, 3);
        map.put(1, oasisNum);
        int ruinsNum = randomizer.getRandom(0, 3);
        map.put(2, ruinsNum);
//        int mountNum = randomizer.getRandom(0, 2);
//        map.put(3, mountNum);
//        int houseNum = randomizer.getRandom(0, 5);
//        map.put(4, houseNum);
        return map;
    }

    public Map<Integer, Integer> getForestNumbers() {
        randomizer = new Randomizer();
        Map<Integer, Integer> map = new HashMap<>();
        int caveNum = randomizer.getRandom(1, 3);
        map.put(1, caveNum);
//        int riverNum = randomizer.getRandom(0, 2);
//        map.put(2, riverNum);
//        int rockNum = randomizer.getRandom(2, 5);
//        map.put(3, rockNum);
        int forNum = randomizer.getRandom(10, 30);
        map.put(2, forNum);
        int villageNum = randomizer.getRandom(1, 5);
        map.put(3, villageNum);
        return map;
    }

    public Map<Integer, Integer> getTundraNumbers() {
        randomizer = new Randomizer();
        Map<Integer, Integer> map = new HashMap<>();
        int caveNum = randomizer.getRandom(1, 3);
        map.put(1, caveNum);
        int villageNum = randomizer.getRandom(0, 5);
        map.put(2, villageNum);
        int glacierNum = randomizer.getRandom(2, 5);
        map.put(3, glacierNum);
//        int riverNum = randomizer.getRandom(0, 2);
//        map.put(4, riverNum);
//        int rockNum = randomizer.getRandom(3, 5);
//        map.put(5, rockNum);
//        int treeNum = randomizer.getRandom(10, 20);
//        map.put(6, treeNum);
        return map;
    }
//
//    public Map<Integer, Integer> getVillageNumbers() {
//        randomizer = new Randomizer();
//        Map<Integer, Integer> map = new HashMap<>();
//        int houseNum = randomizer.getRandom(6, 15);
//        map.put(1, houseNum);
//        int pubNum = randomizer.getRandom(1, 3);
//        map.put(2, pubNum);
//        int riverNum = randomizer.getRandom(1, 3);
//        map.put(3, riverNum);
//        int rockNum = randomizer.getRandom(3, 6);
//        map.put(4, rockNum);
//        int treeNum = randomizer.getRandom(10, 20);
//        map.put(5, treeNum);
//        return map;
//    }

    public Map<Integer, Integer> getCaveNumbers() {
        randomizer = new Randomizer();
        Map<Integer, Integer> map = new HashMap<>();
        int iceNum = randomizer.getRandom(1, 5);
        map.put(1, iceNum);
        return map;
    }

    public Map<Integer, Integer> getGlacierNumbers() {
        randomizer = new Randomizer();
        Map<Integer, Integer> map = new HashMap<>();
        int iceNum = randomizer.getRandom(3, 7);
        map.put(1, iceNum);
        return map;
    }

    public Map<Integer, Integer> getSwampNumbers() {
        randomizer = new Randomizer();
        Map<Integer, Integer> map = new HashMap<>();
        int smForNum = randomizer.getRandom(1, 3);
        map.put(1, smForNum);
        return map;
    }

    public Map<Integer, Integer> getVillageNumbers() {
        randomizer = new Randomizer();
        Map<Integer, Integer> map = new HashMap<>();
        int houseNum = randomizer.getRandom(5, 10);
        map.put(1, houseNum);
        int smForNum = randomizer.getRandom(3, 15);
        map.put(2, smForNum);
        int mountNum = randomizer.getRandom(0, 3);
        map.put(3, mountNum);
        int pubNum = randomizer.getRandom(1, 3);
        map.put(4, pubNum);
        int riverNum = randomizer.getRandom(1, 3);
        map.put(5, riverNum);
        return map;
    }

    public Map<Integer, Integer> getRuinNumbers() {
        randomizer = new Randomizer();
        Map<Integer, Integer> map = new HashMap<>();
        int forNum = randomizer.getRandom(1, 10);
        map.put(1, forNum);
        int mountNum = randomizer.getRandom(1, 2);
        map.put(2, mountNum);
        return map;
    }

    public Map<Integer, Integer> getOasisNumbers() {
        randomizer = new Randomizer();
        Map<Integer, Integer> map = new HashMap<>();
        int riverNum = randomizer.getRandom(1, 2);
        map.put(1, riverNum);
        int forNum = randomizer.getRandom(5, 15);
        map.put(2, forNum);
        return map;
    }

    public int getProbability() {
        randomizer = new Randomizer();
        return randomizer.getRandom(1, 100);
    }

}
