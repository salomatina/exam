module ru.mephi {
    requires javafx.controls;
    requires javafx.fxml;
    requires commons.math3;
    requires java.desktop;

    opens ru.mephi.userInterface to javafx.fxml;
//    exports ru.mephi;
    exports ru.mephi.userInterface;
    exports ru.mephi.regions;
//    exports ru.mephi.multipleObjectsOfInterest;
    exports ru.mephi.objectsOfInterest;
    exports ru.mephi.items;
    exports ru.mephi.player;
    exports ru.mephi.helping;
    exports ru.mephi.world;
    exports ru.mephi.elements;
    exports ru.mephi.keyElements;
//    opens ru.mephi.helping to javafx.fxml;
}