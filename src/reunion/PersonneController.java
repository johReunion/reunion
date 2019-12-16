/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reunion;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import org.dao.reuniondao;
import org.reunion.bean.Personne;
import org.reunion.bean.Pole;

/**
 * FXML Controller class
 *
 * @author root
 */
public class PersonneController implements Initializable {

    @FXML
    private TextField editnom,editprenom,edittel,editmail,editrechnom,editrechprenom;
    @FXML
    private TableView tabpers;
    @FXML
    private Button btn_add,btn_cancel,btn_update,btn_delete,btn_elargire,btn_close;
    
    private Personne personne;
    private reuniondao dao;
    private List<Personne> personnes=new ArrayList<>();
    
    
    
      @FXML
    public void addPole()
    {   dao=new reuniondao();
        personne=new Personne();
        personne.setNom(editnom.getText());
        personne.setPrenom(editprenom.getText());
        personne.setTel(edittel.getText());
        personne.setEmail(editmail.getText());
        
        dao.addPersonne(personne);
    
      
        
    }
    @FXML
    public void cancel()
    {
       editnom.setText(null);
       editprenom.setText(null);
       edittel.setText(null);
       editmail.setText(null);
    }
    @FXML
    public void modifier()
    {     dao=new reuniondao();
        personne=new Personne();
        personne.setIdPersonne(Integer.MIN_VALUE);
        personne.setNom(editnom.getText());
        personne.setPrenom(editprenom.getText());
        personne.setTel(edittel.getText());
        personne.setEmail(editmail.getText());
        
        dao.updatePersonne(personne);
        
        
    }
    @FXML
    public void delete()
    {      dao=new reuniondao();
        personne=new Personne();
        personne.setIdPersonne(Integer.MIN_VALUE);
        personne.setNom(editnom.getText());
        personne.setPrenom(editprenom.getText());
        personne.setTel(edittel.getText());
        personne.setEmail(editmail.getText());
        
        dao.deletePersonne(personne);
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
