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
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import Kryo.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Elina
 * ITB3
 */
public class LatLoto extends Application {
    
    private ClientApp clientApp = new ClientApp();


    public LatLoto() throws IOException {

    }
    
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        Button btn = new Button();

        MainWindowGUI maingui = new MainWindowGUI();
        
        btn.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, 25));
        btn.setText("Sākam");
        
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        Scene scene = new Scene(root, 600, 200);
        
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
        
//        Packet.Packet02Message msg = new Packet.Packet02Message();
//        msg.equals(clientApp.getVtempGUI().getVariation());
//        
//        
//        
//        System.out.println("Tik tāl ir aizgājais");
        

    }
    
    public void btnActionListener(ActionEvent evt) {
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
