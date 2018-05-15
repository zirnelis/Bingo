/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatLoto;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import GUI.*;

/**
 *
 * @author Elina
 */
public class LatLoto extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();

        MainWindowGUI maingui = new MainWindowGUI();
        
        btn.setText("Sākam");
        
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Laipni lūdzam LatLoto!");
        primaryStage.setScene(scene);
        primaryStage.show();

//        StackPane main = new StackPane();
//        
//        Scene mainScene = new Scene(main, 500, 500);
        
        btn.setOnAction(new EventHandler<ActionEvent>() { 
            @Override
            public void handle(ActionEvent event) {
                primaryStage.close();
                maingui.setVisible(true);
            }
        });

    }
    
    public void btnActionListener(ActionEvent evt) {
        System.out.println("Test");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
