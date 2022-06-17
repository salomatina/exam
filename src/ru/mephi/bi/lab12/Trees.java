package ru.mephi.bi.lab12;

public class Trees extends AliveCreature implements Breathing{
    @Override
    public void getSick() {
        System.out.println("I can't actually speak but I'm sick");
    }

    @Override
    public void makeBreath() {
        System.out.println("I can't actually speak but I made a breath");
    }

    @Override
    public void makeDeepBreath() {
        System.out.println("I can't actually speak but I made a deep breath");
    }
}
