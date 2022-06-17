package ru.mephi.regions;

import ru.mephi.items.Fire;
import ru.mephi.multipleObjects.OutOfTreesException;
import ru.mephi.multipleObjects.TreeList;
import ru.mephi.items.House;
import ru.mephi.objects.Tree;

import java.util.ArrayList;
import java.util.List;

public abstract class Region {
    private TreeList treeList;
    private List<House> houseList;
    private List<Fire> fireList;

    public void removeTree(Tree tree) throws OutOfTreesException {
        treeList.remove(tree);
    }

    public TreeList getTreeList() {
        return treeList;
    }

    public void setTreeList(TreeList treeList) {
        this.treeList = treeList;
    }

    public void addHouse(House house) {
        if (houseList == null) {
            houseList = new ArrayList<>();
        }
        houseList.add(house);
    }

    public void addFire(Fire fire) throws InterruptedException {
        if (fireList == null) {
            fireList = new ArrayList<>();
        }
        fireList.add(fire);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wait(50000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    removeFire();
                }
                catch (Exception ignored) {
                    System.out.println("removing not existed fire");
                }
            }
        });
        thread.start();
        System.out.println(thread.isAlive());
        thread.join(60000);
        System.out.println(thread.isAlive());
    }

    public void removeFire() {
        fireList.remove(fireList.size() - 1);
    }

}
