module ru.mephi {
    requires javafx.controls;
    requires javafx.fxml;
    requires commons.math3;
    requires java.desktop;

    opens ru.mephi.userInterface to javafx.fxml;
//    exports ru.mephi;
    exports ru.mephi.userInterface;
    exports ru.mephi.regions;
    exports ru.mephi.multipleObjects;
    exports ru.mephi.objects;
    exports ru.mephi.items;
    exports ru.mephi.player;
    exports ru.mephi.helping;
    exports ru.mephi.world;
//    opens ru.mephi.helping to javafx.fxml;
}