package ru.mephi.userInterface;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import ru.mephi.multipleObjects.OutOfTreesException;
import ru.mephi.objects.Tree;
import ru.mephi.player.Player;
import ru.mephi.regions.Region;

import java.util.Collection;

public class CurrentRegion {

    public static void displayRegion(Region region, Player player) {
        Stage stage = new Stage();
        Image image = new Image(region.getImagePath());
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(100);
        imageView.setFitWidth(140);
        ComboBox<Tree> comboBox = new ComboBox<>();
        comboBox.getItems().addAll(region.getTreeList().getTreeList());
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
                    alert.setContentText("There is no trees here");
                    alert.showAndWait();
                    e.printStackTrace();
                }
            }
        });

        HBox hBox = new HBox(comboBox, cutDownATree);

        VBox vBox = new VBox(imageView, hBox);
        Scene scene = new Scene(vBox, 160, 260);
        stage.setScene(scene);
        stage.showAndWait();

    }

//    public Tree chooseTreeStage(Region region) {
//        Stage treeStage = new Stage();
//        TreeView<Tree> treeTreeView = new TreeView<>();
//        TreeItem<Tree> root = new TreeItem<>();
//        for (Tree tree : region.getTreeList().getTreeList()) {
//            TreeItem<Tree> item = new TreeItem<>(tree);
//            root.getChildren().add(item);
//        }
//        treeTreeView.setRoot(root);
//        treeTreeView.setShowRoot(false);
//        Button chooseButton = new Button("Make a choice");
//        chooseButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                Tree tree = treeTreeView.getSele
//                treeStage.close();
//            }
//        });
//        VBox vBox = new VBox(treeTreeView, chooseButton);
//        Scene scene = new Scene(vBox);
//        treeStage.setScene(scene);
//        treeStage.showAndWait();
//
//    }
}
