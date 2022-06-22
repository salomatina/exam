package ru.mephi.player;

import ru.mephi.keyElements.Fire;
import ru.mephi.items.*;
import ru.mephi.keyElements.House;
import ru.mephi.objectsOfInterest.FireInTheVillageException;
import ru.mephi.objectsOfInterest.Obj;
import ru.mephi.objectsOfInterest.OutOfTreesException;
import ru.mephi.regions.FireException;
import ru.mephi.regions.Region;

public class Player {
    private LogList logList = new LogList();
    private Region currentLocation;

    public void CutDownATree(Obj objectOfInterest) throws OutOfTreesException {
        currentLocation.removeTreeInRegion(objectOfInterest);
        Log log = new Log();
        logList.addLog(log);
        System.out.println(logList.getLogList().size());
    }

    public void BuildAHouse(Obj objectOfInterest)  {
            House house = new House();
        System.out.println(objectOfInterest.getHouseList().size() + " before");
            currentLocation.addHouse(house, objectOfInterest);
        System.out.println(objectOfInterest.getHouseList().size() + " after");
    }

    public void setFire(Obj objectOfInterest) throws OutOfLogException, FireInTheVillageException, FireException {
//        if (logList.getLogList().size() >= 1) {
//            logList.removeLog();
            Fire fire = new Fire();
        System.out.println(objectOfInterest.getFireList().size() + " before");
            currentLocation.addFire(fire, objectOfInterest);
        System.out.println(objectOfInterest.getFireList().size() + " after");
//        }
//        else {
//            throw new OutOfLogException();
//        }
    }

    public Region getCurrentLocation() {
        return currentLocation;
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
