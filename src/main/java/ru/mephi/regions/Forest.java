package ru.mephi.regions;

import ru.mephi.multipleObjects.CaveList;
import ru.mephi.multipleObjects.RiverList;
import ru.mephi.multipleObjects.RockList;
import ru.mephi.multipleObjects.TreeList;

public class Forest extends Region{
    private CaveList caveList;
    private RiverList riverList;
    private RockList rockList;

    public Forest(int caveNum, int riverNum, int rockNum, int treeNum, int houseNum) {
        super(treeNum, houseNum);
        caveList = new CaveList(caveNum);
        riverList = new RiverList(riverNum);
        rockList = new RockList(rockNum);
    }

    public CaveList getCaveList() {
        return caveList;
    }

    public void setCaveList(CaveList caveList) {
        this.caveList = caveList;
    }

    public RiverList getRiverList() {
        return riverList;
    }

    public void setRiverList(RiverList riverList) {
        this.riverList = riverList;
    }

    public RockList getRockList() {
        return rockList;
    }

    @Override
    public String getName() {
        return "forest";
    }

    public void setRockList(RockList rockList) {
        this.rockList = rockList;
    }

}
