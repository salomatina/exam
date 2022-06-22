package ru.mephi.elements;

import ru.mephi.keyElements.Tree;

import java.util.ArrayList;
import java.util.List;

public class SmallForest extends Element{
    private List<Tree> treeList;

    public SmallForest(int treeNum) {
        fillTreeList(treeNum);
    }

    public void fillTreeList(int treeNum) {
        treeList = new ArrayList<>();
        for (int i = 0; i < treeNum; i++) {
            Tree tree = new Tree();
            treeList.add(tree);
        }
    }

    public List<Tree> getTreeList() {
        return treeList;
    }

    public void removeTree() {
        treeList.remove(treeList.size() - 1);
    }

    @Override
    public String toString() {
        if (treeList.size() > 0) {
            return "A few trees";
        }
        else return "";
    }
}
