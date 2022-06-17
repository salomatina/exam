package ru.mephi.regions;

import ru.mephi.multipleObjects.MountainList;
import ru.mephi.multipleObjects.OasisList;
import ru.mephi.multipleObjects.RuinsList;

public class Desert extends Region{
    private OasisList oasisList;
    private RuinsList ruinsList;
    private MountainList mountainList;

    public Desert(int oasisNum, int ruinsNum, int mountainsNum, int houseNum) {
        super(0, houseNum);
        oasisList = new OasisList(oasisNum);
        ruinsList = new RuinsList(ruinsNum);
        mountainList = new MountainList(mountainsNum);
//        setTreeList(null);
    }

    @Override
    public String getName() {
        return "desert";
    }

}
