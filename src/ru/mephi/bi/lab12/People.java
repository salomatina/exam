package ru.mephi.bi.lab12;

public class People extends AliveCreature implements Breathing{

    @Override
    public void getSick() {
        System.out.println("I feel awful");
    }

    @Override
    public void makeDeepBreath() {
        System.out.println("I can feel smells");
    }
}
