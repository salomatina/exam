package ru.mephi.userInterface;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import ru.mephi.player.Player;
import ru.mephi.world.World;

public class WorldMap {

    public static void displayMap(World world, Player player) {
        Stage mapWindow = new Stage();
        mapWindow.initModality(Modality.APPLICATION_MODAL);
        mapWindow.setTitle("Map");
        VBox vBox = new VBox();
        for (int i = 0; i < world.getAllRegionsList().size() ; i++) {
            String name = world.getAllRegionsList().get(i).getName();
            Button button;
            if (player.getCurrentLocation() == world.getAllRegionsList().get(i)) {
                name = i + 1 + " (current) region: " + name;
                button = new Button(name);
            }
            else {
                button = new Button(i + 1 + " region: " + name);
            }
            int n = i;
            button.setOnAction(actionEvent -> {
                player.setCurrentLocation(world.getAllRegionsList().get(n));
                mapWindow.close();
            });
            vBox.getChildren().add(button);
        }
        Scene scene = new Scene(vBox, 400, 200);
        mapWindow.setScene(scene);
        mapWindow.showAndWait();
    }

}
