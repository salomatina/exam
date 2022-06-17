package ru.mephi.items;

import java.util.ArrayList;
import java.util.List;

public class LogList {
    private List<Log> logList = new ArrayList<>();

    public void removeLog(){
        logList.remove(logList.size() - 1);
    }

    public void removeTenLog(){
        for (int i = 0; i < 10; i++) {
            removeLog();
        }
    }
    public void addLog(Log log) {
        logList.add(log);
    }

    public List<Log> getLogList() {
        return logList;
    }
}
