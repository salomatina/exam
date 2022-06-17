package ru.mephi.bi.lab12;

public abstract class AliveCreature {

    private int age;

    public abstract void getSick();

    public void getOlder(){
        age++;
    }


}
