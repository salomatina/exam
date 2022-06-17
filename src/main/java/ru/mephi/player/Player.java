package ru.mephi.player;

import ru.mephi.items.*;
import ru.mephi.multipleObjects.OutOfTreesException;
import ru.mephi.objects.Tree;
import ru.mephi.regions.Region;

public class Player {
    private LogList logList = new LogList();
    private Region currentLocation;

    public void CutDownATree(Tree tree) throws OutOfTreesException {
        currentLocation.removeTree(tree);
        Log log = new Log();
        logList.addLog(log);
    }

    public void BuildAHouse() throws OutOfLogException {
        if (logList.getLogList().size() >= 10) {
            logList.removeTenLog();
            House house = new House();
            currentLocation.addHouse(house);
        }
        else {
            throw new OutOfLogException();
        }
    }

    public void SetFire() throws InterruptedException, OutOfLogException {
        if (logList.getLogList().size() >= 1) {
            logList.removeLog();
            Fire fire = new Fire();
            currentLocation.addFire(fire);
        }
        else {
            throw new OutOfLogException();
        }
    }

    public void setCurrentLocation(Region currentLocation) {
        this.currentLocation = currentLocation;
    }

    public LogList getLogList() {
        return logList;
    }

    public void setLogList(LogList logList) {
        this.logList = logList;
    }
}
