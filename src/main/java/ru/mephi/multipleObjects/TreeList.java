package ru.mephi.multipleObjects;

import ru.mephi.objects.Tree;

import java.util.ArrayList;
import java.util.List;

public class TreeList extends ObjList{
    private List<Tree> treeList;

    public TreeList(int number){
        treeList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            Tree tree = new Tree();
            treeList.add(tree);
        }
    }

    public void remove(Tree tree) throws OutOfTreesException{
        treeList.remove(tree);
    }

    public List<Tree> getTreeList() {
        return treeList;
    }
}
