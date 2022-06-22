package ru.mephi.regions;

import ru.mephi.helping.NumbersGiver;
import ru.mephi.objectsOfInterest.Oasis;
import ru.mephi.objectsOfInterest.Ruin;

import java.util.ArrayList;
import java.util.List;

public class Desert extends Region{
    private List<Oasis> oasisList;
    private List<Ruin> ruinsList;
    private NumbersGiver numbersGiver = new NumbersGiver();
    private String imagePath = "file:/C:\\Users\\Елена\\IdeaProjects\\exam\\src\\main\\resources\\desertPic.jpg";

    @Override
    public String getImagePath() {
        return imagePath;
    }

    public Desert(int oasisNum, int ruinsNum) {
        fillOasisList(oasisNum);
        fillRuinsList(ruinsNum);
        getObjectOfInterestList().addAll(oasisList);
        getObjectOfInterestList().addAll(ruinsList);
    }

    public void fillRuinsList(int ruinsNum) {
        ruinsList = new ArrayList<>();
        for (int i = 0; i < ruinsNum; i++) {
            int n1 = numbersGiver.getRuinNumbers().get(1);
            int n2 = numbersGiver.getRuinNumbers().get(2);
            Ruin ruin = new Ruin(n1, n2);
            ruinsList.add(ruin);
        }
    }

    public void fillOasisList(int oasisNum) {
        oasisList = new ArrayList<>();
        for (int i = 0; i < oasisNum; i++) {
            int n1 = numbersGiver.getOasisNumbers().get(1);
            int n2 = numbersGiver.getOasisNumbers().get(2);
            Oasis oasis = new Oasis(n1, n2);
            oasisList.add(oasis);
        }
    }

    @Override
    public String getName() {
        return "desert";
    }

}
