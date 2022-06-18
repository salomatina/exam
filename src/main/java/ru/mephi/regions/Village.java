package ru.mephi.regions;

import ru.mephi.multipleObjects.*;

public class Village extends Region{
//    private HouseList houseList;
    private PubList pubList;
    private RiverList riverList;
    private RockList rockList;
    private String imagePath = "file:/C:\\Users\\Елена\\IdeaProjects\\exam\\src\\main\\resources\\villagePic.jpg";

    @Override
    public String getImagePath() {
        return imagePath;
    }

    public Village(int houseNum, int pubNum, int riverNum, int rockNum, int treeNum) {
        super(treeNum, houseNum);
        pubList = new PubList(pubNum);
        riverList = new RiverList(riverNum);
        rockList = new RockList(rockNum);
    }

    @Override
    public String getName() {
        return "village";
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
