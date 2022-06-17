package ru.mephi.bi.lab12;

public interface Breathing {

    boolean canBreath = true;

    default void makeBreath(){
        System.out.println("How peaceful");
    }
    void makeDeepBreath();
}
