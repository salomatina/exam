package ru.mephi.regions;

import ru.mephi.items.Fire;
import ru.mephi.multipleObjects.HouseList;
import ru.mephi.multipleObjects.OutOfTreesException;
import ru.mephi.multipleObjects.TreeList;
import ru.mephi.objects.House;
import ru.mephi.objects.Tree;

import java.util.ArrayList;
import java.util.List;

public abstract class Region {
    private TreeList treeList;
    private HouseList houseList;
    private List<Fire> fireList;
    private String imagePath;

    public String getImagePath() {
        return imagePath;
    }

    public Region(int treeNum, int houseNum) {
        treeList = new TreeList(treeNum);
        houseList = new HouseList(houseNum);
    }

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
        houseList.addHouse(house);
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

    public String getName() {
        return "region";
    }

    public void removeFire() {
        fireList.remove(fireList.size() - 1);
    }

}
