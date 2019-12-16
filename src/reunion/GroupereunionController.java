/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reunion;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.dao.reuniondao;
import org.reunion.bean.Groupereunion;
import org.reunion.bean.Pole;

/**
 * FXML Controller class
 *
 * @author root
 */
public class GroupereunionController implements Initializable {

    @FXML
    private TextField editlibpole;
    @FXML
    private Button btn_add,btn_cancel;
    
    private Groupereunion groupereunion;
    private reuniondao dao;
    
      @FXML
    public void add()
    { groupereunion=new Groupereunion();
      dao=new reuniondao();
      groupereunion.setLibelleGroupereunion(editlibpole.getText());
      dao.addGroupereunion(groupereunion);

    }
    @FXML
    public void cancel()
    {
        editlibpole.setText(null);
       
    }
    @FXML
    public void modifier()
    {   
        groupereunion=new Groupereunion();
      dao=new reuniondao();
      groupereunion.setIdgroupereunion(Integer.MIN_VALUE);
      groupereunion.setLibelleGroupereunion(editlibpole.getText());
      dao.updateGroupereunion(groupereunion);
    }
    @FXML
    public void delete()
    { 
        groupereunion=new Groupereunion();
      dao=new reuniondao();
      groupereunion.setIdgroupereunion(Integer.MIN_VALUE);
      groupereunion.setLibelleGroupereunion(editlibpole.getText());
      dao.updateGroupereunion(groupereunion);
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
