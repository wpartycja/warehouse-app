package edu.pw.pap21z.z15;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WorkerTaskController extends WorkerController{

    public void switchToWorkerScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("worker.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(){}

}
