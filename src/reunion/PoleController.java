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
import org.reunion.bean.Pole;

/**
 * FXML Controller class
 *
 * @author root
 */
public class PoleController implements Initializable {

    @FXML
    private TextField editlibellepole;
    @FXML
    private TextArea textArea;
    @FXML
    private Button btn_add,btn_cancel;
    
    private Pole pole;
    private reuniondao dao;
    
    @FXML
    public void addPole()
    { pole=new Pole();
      dao=new reuniondao();
      pole.setLibellePole(editlibellepole.getText());
      pole.setCommentairePole(textArea.getText());
      dao.addPole(pole);
      
        
    }
    @FXML
    public void cancel()
    {
        editlibellepole.setText(null);
        textArea.setText(null);
    }
    @FXML
    public void modifier()
    {   dao=new reuniondao();
        pole=new Pole();
        pole.setIdpole(Integer.SIZE);
        pole.setLibellePole(editlibellepole.getText());
        pole.setCommentairePole(textArea.getText());
        dao.updatePole(pole);
        
        
    }
    @FXML
    public void delete()
    {   dao=new reuniondao();
        pole=new Pole();
        pole.setIdpole(Integer.SIZE);
        pole.setLibellePole(editlibellepole.getText());
        pole.setCommentairePole(textArea.getText());
        dao.deletePole(pole);
    }
    /**
     * Initializes the controller class.
     */
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
