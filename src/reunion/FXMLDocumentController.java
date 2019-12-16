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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.dao.reuniondao;
import org.reunion.bean.Personne;
import org.reunion.bean.Structure;

/**
 *
 * @author root
 */
public class FXMLDocumentController  implements Initializable {
    
  
      @FXML
    private TextField editnomstructure,edittelstructure,editmailstructure,editrechnomstructure,editlogo;
      @FXML
      private TextArea textdescristructure;
    @FXML
    private TableView tabstructure;
    @FXML
    private Button btn_add,btn_cancel,btn_update,btn_delete,btn_elargire,btn_close;
    
    private Structure structure;
    private reuniondao dao;
    private List<Structure> structures=new ArrayList<>();
    
    
    
      @FXML
    public void addPole()
    {   dao=new reuniondao();
        structure=new Structure();
        structure.setNomStructure(editnomstructure.getText());
        structure.setDescriptionStructure(textdescristructure.getText());
        structure.setTelStructure(edittelstructure.getText());
        structure.setEmailStructure(editmailstructure.getText());
        dao.addStructure(structure);
    
      
        
    }
    @FXML
    public void cancel()
    {
        editnomstructure.setText(null);
        textdescristructure.setText(null);
        edittelstructure.setText(null);
        editmailstructure.setText(null);
        
    }
    @FXML
    public void modifier()
    {   dao=new reuniondao();
        structure=new Structure();
        structure.setIdstructure(Integer.MIN_VALUE);
        structure.setNomStructure(editnomstructure.getText());
        structure.setDescriptionStructure(textdescristructure.getText());
        structure.setTelStructure(edittelstructure.getText());
        structure.setEmailStructure(editmailstructure.getText());
        dao.addStructure(structure);
        
        
    }
    @FXML
    public void delete()
    {    dao=new reuniondao();
        structure=new Structure();
        structure.setIdstructure(Integer.MIN_VALUE);
        structure.setNomStructure(editnomstructure.getText());
        structure.setDescriptionStructure(textdescristructure.getText());
        structure.setTelStructure(edittelstructure.getText());
        structure.setEmailStructure(editmailstructure.getText());
        dao.addStructure(structure);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}
