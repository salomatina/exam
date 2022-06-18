package ru.mephi.regions;

import ru.mephi.multipleObjects.*;

public class Tundra extends Region{
    private CaveList caveList;
//    private HouseList houseList;
    private IceList iceList;
    private RiverList riverList;
    private RockList rockList;
    private String imagePath = "file:/C:\\Users\\Елена\\IdeaProjects\\exam\\src\\main\\resources\\tundraPic.jpg";

    @Override
    public String getImagePath() {
        return imagePath;
    }

    public Tundra(int caveNum, int houseNum, int iceNum, int riverNum, int rockNum, int treeNum) {
        super(treeNum, houseNum);
        caveList = new CaveList(caveNum);
        iceList = new IceList(iceNum);
        riverList = new RiverList(riverNum);
        rockList = new RockList(rockNum);
    }

    public CaveList getCaveList() {
        return caveList;
    }

    @Override
    public String getName() {
        return "tundra";
    }

    public void setCaveList(CaveList caveList) {
        this.caveList = caveList;
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
