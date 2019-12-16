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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import org.dao.reuniondao;
import org.reunion.bean.Groupereunion;
import org.reunion.bean.Reunion;

/**
 * FXML Controller class
 *
 * @author root
 */
public class ReunionController implements Initializable {

    @FXML
    private TextField editrechgroupe;
    @FXML
    private ComboBox combreunion;
    @FXML
    private DatePicker datepinckreunion;
    @FXML
    private Button btn_add,btn_cancel,btn_update,btn_delete,btn_close;
    @FXML
    private TableView tabreunion;
    
    
    private Reunion reunion;
    private reuniondao dao;
    
    @FXML
    public void add()
    {
        dao=new reuniondao();
        reunion=new Reunion();
        reunion.setDateReunion(datepinckreunion.getValue().toString());
        reunion.setGroupereunionIdgroupereunion((Groupereunion) combreunion.getValue());
        
        dao.addReunion(reunion);    
        
    }
    
    @FXML
    public void cancel()
    {
        combreunion.setValue(null);
        datepinckreunion.setValue(null);
    }
    @FXML
    public void update()
    {
        
    }
    @FXML
    public void delete()
    {
        
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}
