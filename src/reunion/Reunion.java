/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reunion;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author root
 */
public class Reunion extends Application {

 private String page;
 private Stage stage;
 private Scene scene;
 private Parent root;
 

    public Reunion() throws Exception {
        this.page="configuration";
        this.root=FXMLLoader.load(getClass().getResource(this.page+".fxml"));
        this.scene=new Scene(this.getRoot());
    }

    public Reunion(String page) {
        this.page = page;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public Parent getRoot() {
        return root;
    }

    public void setRoot(Parent root) {
        this.root = root;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
 
    
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
      
        this.stage=primaryStage;
        lanceur();

    }

    public void lanceur() throws IOException
    {
        stage.setScene(this.getScene());
        stage.show();
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
