package ru.mephi.regions;

import ru.mephi.multipleObjects.*;

public class Village extends Region{
    private HouseList houseList;
    private PubList pubList;
    private RiverList riverList;
    private RockList rockList;

    public HouseList getHouseList() {
        return houseList;
    }

    public void setHouseList(HouseList houseList) {
        this.houseList = houseList;
    }

    public PubList getPubList() {
        return pubList;
    }

    public void setPubList(PubList pubList) {
        this.pubList = pubList;
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

    public void setRockList(RockList rockList) {
        this.rockList = rockList;
    }

}
