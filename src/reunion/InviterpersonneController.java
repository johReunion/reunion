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
import org.reunion.bean.Groupereunion;
import org.reunion.bean.Invitation;
import org.reunion.bean.Personne;
import org.reunion.bean.Recevoir;
import org.reunion.bean.Structure;

/**
 * FXML Controller class
 *
 * @author root
 */
public class InviterpersonneController implements Initializable {

    @FXML
    private TextField editrechnom1,editrechnom2,editprenom;
    @FXML
    private ComboBox combstructure,combinvitation;
    @FXML
    private Button btn_add,btn_cancel,btn_update,btn_delete,btn_elargire,btn_close,btn_envoie,btn_resortir,btn_retirall;
    @FXML
    private TableView tabpers1,tabpers2,tabinvitation;
    
    private Recevoir recevoir;
    private reuniondao dao;
    private ArrayList<Personne> personnelist= new ArrayList<>();
    private Personne personne;
    
    
    
   @FXML
   public void addtab()
   {
       personnelist.add(personne);
       
   }
    @FXML
   public void removetab()
   {
       personnelist.remove(personne);
       
   }
    @FXML
   public void removealltab()
   {
       personnelist.removeAll(personnelist);
       
   }
      @FXML
    public void add()
    { recevoir=new Recevoir();
      dao=new reuniondao();
      recevoir.setInvitation(null);
      recevoir.setPersonne(null);
      recevoir.setStructure(null);
      dao.addRecevoir(recevoir);

    }
    @FXML
    public void cancel()
    {
        combinvitation.setValue(null);
        combstructure.setValue(null);
       
    }
    @FXML
    public void modifier()
    {   
      recevoir=new Recevoir();
      dao=new reuniondao();
      recevoir.setRecevoirPK(null);
      recevoir.setInvitation((Invitation) combinvitation.getValue());
      recevoir.setPersonne(null);
      recevoir.setStructure((Structure) combstructure.getValue());
      dao.updateRecevoir(recevoir);
    }
    @FXML
    public void delete()
    { 
        recevoir=new Recevoir();
      dao=new reuniondao();
      recevoir.setRecevoirPK(null);
      recevoir.setInvitation((Invitation) combinvitation.getValue());
      recevoir.setPersonne(null);
      recevoir.setStructure((Structure) combstructure.getValue());
      dao.updateRecevoir(recevoir);
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
