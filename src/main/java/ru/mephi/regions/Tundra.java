package ru.mephi.regions;

import ru.mephi.multipleObjects.*;

public class Tundra extends Region{
    private CaveList caveList;
    private HouseList houseList;
    private IceList iceList;
    private RiverList riverList;
    private RockList rockList;

    public CaveList getCaveList() {
        return caveList;
    }

    public void setCaveList(CaveList caveList) {
        this.caveList = caveList;
    }

    public HouseList getHouseList() {
        return houseList;
    }

    public void setHouseList(HouseList houseList) {
        this.houseList = houseList;
    }

    public IceList getIceList() {
        return iceList;
    }

    public void setIceList(IceList iceList) {
        this.iceList = iceList;
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
