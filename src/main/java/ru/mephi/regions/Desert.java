package ru.mephi.regions;

import ru.mephi.multipleObjects.MountainList;
import ru.mephi.multipleObjects.OasisList;
import ru.mephi.multipleObjects.RuinsList;

public class Desert extends Region{
    private OasisList oasisList;
    private RuinsList ruinsList;
    private MountainList mountainList;

    public Desert() {
        setTreeList(null);
    }
}
