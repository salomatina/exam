package ru.mephi.userInterface;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import ru.mephi.player.Player;
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
                player.setCurrentLocation(world.getAllRegionsList().get(n));
                System.out.println(player.getCurrentLocation());
                CurrentRegion.displayRegion(world.getAllRegionsList().get(n), player, this);
                mapWindow.close();
            });
            vBox.getChildren().add(button);
            if (n % subSize == 0) {
                hBox.getChildren().add(vBox);
                vBox = new VBox();
            }
        }
        Scene scene = new Scene(hBox);
        mapWindow.setScene(scene);
        mapWindow.showAndWait();
    }

}
