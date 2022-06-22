package ru.mephi.userInterface;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import ru.mephi.player.Player;
import ru.mephi.world.World;

public class App extends Application {

    private World world;
    private Player player;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label desertLabel = new Label("Choose number of deserts");
        desertLabel.setPrefSize(150, 20);
        TextArea desertTextField = new TextArea();
        desertTextField.setPrefSize(20, 20);
        HBox desertHBox = new HBox(desertLabel, desertTextField);
        Label forestLabel = new Label("Choose number of forests");
        forestLabel.setPrefSize(150, 20);
        TextArea forestTextField = new TextArea();
        forestTextField.setPrefSize(20, 20);
        HBox forestHBox = new HBox(forestLabel, forestTextField);
        Label tundraLabel = new Label("Choose number of tundras");
        tundraLabel.setPrefSize(150, 20);
        TextArea tundraTextField = new TextArea();
        tundraTextField.setPrefSize(20, 20);
        HBox tundraHBox = new HBox(tundraLabel, tundraTextField);
        Button playButton = new Button("Play");
        playButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                player = new Player();
                world = new World(Integer.parseInt(desertTextField.getText()),
                        Integer.parseInt(forestTextField.getText()),
                        Integer.parseInt(tundraTextField.getText()));
                player.setCurrentLocation(world.getAllRegionsList().get(0));
                WorldMap worldMap = WorldMap.getInstance(world, player);
                worldMap.displayMap();
            }
        });
        playButton.setPrefSize(100, 40);
        VBox root = new VBox(desertHBox, forestHBox, tundraHBox, playButton);
        Scene scene = new Scene(root, 210, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Get started");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
