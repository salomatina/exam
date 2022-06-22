package ru.mephi.userInterface;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import ru.mephi.items.OutOfLogException;
import ru.mephi.objectsOfInterest.FireInTheVillageException;
import ru.mephi.objectsOfInterest.Obj;
import ru.mephi.objectsOfInterest.OutOfTreesException;
import ru.mephi.player.Player;
import ru.mephi.regions.FireException;
import ru.mephi.regions.Region;

public class CurrentRegion {

    public static void displayRegion(Region region, Player player, WorldMap worldMap) {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Image image = new Image(region.getImagePath());
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(240);
        imageView.setFitWidth(400);
        ComboBox<Obj> comboBox = new ComboBox<>();
        comboBox.setPrefSize(200, 30);
        comboBox.getItems().addAll(region.getObjectOfInterestList());
        Button cutDownATree = new Button("Cut down a tree");
        cutDownATree.setPrefSize(140, 30);
        cutDownATree.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    player.CutDownATree(comboBox.getValue());
                } catch (OutOfTreesException e) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Sorry");
                    alert.setHeaderText(null);
                    alert.setContentText("There are no trees here");
                    alert.showAndWait();
//                    e.printStackTrace();
                }
                catch (NullPointerException exception) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("It didn't work");
                    alert.setHeaderText(null);
                    alert.setContentText("Please choose an object");
                    alert.showAndWait();
//                    exception.printStackTrace();
                }
            }
        });

        HBox hBox = new HBox(comboBox, cutDownATree);

        Button buildAHouseButton = new Button("Build a house");
        buildAHouseButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    player.BuildAHouse(comboBox.getValue());
                }
                catch (NullPointerException exception) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("It didn't work");
                    alert.setHeaderText(null);
                    alert.setContentText("Please choose an object");
                    alert.showAndWait();
//                    exception.printStackTrace();
                }
            }
        });

        Button setFireButton = new Button("Set fire");
        setFireButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    player.setFire(comboBox.getValue());
                } catch (OutOfLogException e) {
                    e.printStackTrace();
                } catch (FireInTheVillageException e) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("It didn't work");
                    alert.setHeaderText(null);
                    alert.setContentText("You can't do it in the village");
                    alert.showAndWait();
//                    e.printStackTrace();
                } catch (FireException e) {
//                    e.printStackTrace();
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Too bad");
                    alert.setHeaderText(null);
                    alert.setContentText("Fire is death... You won't see this object again");
//                    comboBox.commitValue();
                    comboBox.getItems().remove(comboBox.getValue());
//                    comboBox.getItems().addAll(region.getObjectOfInterestList());
                    alert.showAndWait();
                }
                catch (NullPointerException exception) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("It didn't work");
                    alert.setHeaderText(null);
                    alert.setContentText("Please choose an object");
                    alert.showAndWait();
//                    exception.printStackTrace();
                }
            }
        });

        Button showElements = new Button("Show elements");
        showElements.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    Stage objStage = new Stage();
                    objStage.initModality(Modality.APPLICATION_MODAL);
                    TreeView<String> treeView = new TreeView<>();
                    TreeItem<String> root = new TreeItem<>();
                    for (int i = 0; i < comboBox.getValue().getObjectList().size(); i++) {
                        TreeItem<String> treeItem = new TreeItem<>(comboBox.getValue().getObjectList().get(i).toString());
//                        treeItem.getValue().
                        root.getChildren().add(treeItem);
                    }
                    treeView.setRoot(root);
                    treeView.setShowRoot(false);
                    Scene scene = new Scene(treeView, 400, 400);
                    objStage.setScene(scene);
                    objStage.showAndWait();
                }
                catch (NullPointerException e) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("It didn't work");
                    alert.setHeaderText(null);
                    alert.setContentText("Please choose an object");
                    alert.showAndWait();
                }
            }
        });

        Button openMapButton = new Button("Open map");
        openMapButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                worldMap.displayMap();
                stage.close();
            }
        });

        VBox vBox = new VBox(imageView, hBox, buildAHouseButton, setFireButton, showElements, openMapButton);
        Scene scene = new Scene(vBox, 400, 400);
        stage.setScene(scene);
        stage.showAndWait();

    }

}
