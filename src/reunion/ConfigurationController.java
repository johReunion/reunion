/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reunion;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author root
 */
public class ConfigurationController  implements Initializable {

    @FXML
    private Button btn_ajt1,btn_ajt2,btn_ajt3,btn_ajt4,btn_ajt5,btn_ajt6;
    private String page=null;
    private Reunion reunion;
    private Stage stage;
    /**
     * Initializes the controller class.
     */
    
   
    
    
   @FXML
    public void addNote(ActionEvent event) throws Exception
    {
        
        page="note";
        reunion=new Reunion();
        reunion.setRoot(parent(page));
        reunion.setScene(scene(parent(page)));
        stage=new Stage();
        stage.setScene(reunion.getScene());
        reunion.start(stage);
   
    }@FXML
    public void addPole(ActionEvent event) throws Exception
    {
        
        page="note";
        reunion=new Reunion();
        reunion.setRoot(parent(page));
        reunion.setScene(scene(parent(page)));
        stage=new Stage();
        stage.setScene(reunion.getScene());
        reunion.start(stage);
   
    }
     
    public void addInvitation(ActionEvent event) throws Exception
    {
       page="inviterpersonne";
        reunion=new Reunion();
        reunion.setRoot(parent(page));
        reunion.setScene(scene(parent(page)));
        stage=new Stage();
        stage.setScene(reunion.getScene());
        reunion.start(stage);

    }
    
    public void addReunion(ActionEvent event) throws Exception
    {
       page="reunion";
        reunion=new Reunion();
        reunion.setRoot(parent(page));
        reunion.setScene(scene(parent(page)));
        stage=new Stage();
        stage.setScene(reunion.getScene());
        reunion.start(stage);
    }
   @FXML
    public void addPersonneexterne(ActionEvent event) throws Exception
    {
        page="personne";
        reunion=new Reunion();
        reunion.setRoot(parent(page));
        reunion.setScene(scene(parent(page)));
        stage=new Stage();
        stage.setScene(reunion.getScene());
        reunion.start(stage);
        
        
    }
   @FXML
    public void addPersonnecenj(ActionEvent event) throws Exception
    {

        page="personnecnej";
        reunion=new Reunion();
        reunion.setRoot(parent(page));
        reunion.setScene(scene(parent(page)));
        stage=new Stage();
        stage.setScene(reunion.getScene());
        reunion.start(stage);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public Parent parent( String page) throws Exception
    {
        
                
        Parent root = FXMLLoader.load(getClass().getResource(page+".fxml"));   
        
        return root;
        
    }
    
    public Scene scene(Parent p)
    {
        Scene scene=new Scene(p);
        return scene;
    }
}
