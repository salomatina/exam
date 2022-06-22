package ru.mephi.userInterface;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import ru.mephi.player.Player;
import ru.mephi.regions.Region;
import ru.mephi.world.World;

public class WorldMap {

    private static WorldMap instance;
    private World world;
    private Player player;

    private WorldMap(World world, Player player) {
        this.world = world;
        this.player = player;
    }

    public static WorldMap getInstance(World world, Player player) {
        if (instance == null) {
            instance = new WorldMap(world, player);
        }
        return instance;
    }

    public void displayMap() {
        Stage mapWindow = new Stage();
        mapWindow.initModality(Modality.APPLICATION_MODAL);
        mapWindow.setTitle("Map");
        VBox vBox = new VBox();
        int size = world.getAllRegionsList().size();
        int subSize = (int) Math.sqrt(size);
        HBox hBox = new HBox();
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
                if (player.getCurrentLocation().getNeighbors().contains(world.getAllRegionsList().get(n))
                        || player.getCurrentLocation() == world.getAllRegionsList().get(n)) {
                    player.setCurrentLocation(world.getAllRegionsList().get(n));
                    System.out.println(player.getCurrentLocation());
                    CurrentRegion.displayRegion(world.getAllRegionsList().get(n), player, this);
                    mapWindow.close();
                }
                else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("It didn't work");
                    alert.setHeaderText(null);
                    alert.setContentText("You can't go there, it' too far");
                    alert.showAndWait();
                }
            });
            vBox.getChildren().add(button);
            Region current = world.getAllRegionsList().get(n);
            if ((n - 1) % subSize != 0 && n - 1 >= 0 || (n) % subSize == 1) {
                current.getNeighbors().add(world.getAllRegionsList().get(n - 1));
            }
            if ((n + 1) % subSize != 0 && n + 1 < size) {
                current.getNeighbors().add(world.getAllRegionsList().get(n + 1));
            }
            if (n - subSize >= 0) {
                current.getNeighbors().add(world.getAllRegionsList().get(n - subSize));
            }
            if (n + subSize < size) {
                current.getNeighbors().add(world.getAllRegionsList().get(n + subSize));
            }
            if ((n + 1) % subSize == 0) {
                hBox.getChildren().add(vBox);
                vBox = new VBox();
            }
            else if (n + 1 == size) {
                hBox.getChildren().add(vBox);
            }
        }
        Scene scene = new Scene(hBox);
        mapWindow.setScene(scene);
        mapWindow.showAndWait();
    }

}
