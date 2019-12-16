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
import javafx.scene.control.TextField;
import org.dao.reuniondao;
import org.reunion.bean.Note;
import org.reunion.bean.Pole;
import org.reunion.bean.Structure;

/**
 * FXML Controller class
 *
 * @author root
 */
public class NoteController implements Initializable {

    @FXML
    private TextField editnote;
    @FXML
    private ComboBox combstructure,combpole;
    @FXML
    private Button btn_add,btn_cancel;
    
    private reuniondao dao;
    private Note note;
    
      @FXML
    public void addPole()
    { dao=new reuniondao();
      note=new Note();
      note.setPoleIdpole((Pole) combpole.getValue());
      note.setStructureIdstructure((Structure) combstructure.getValue());
      note.setValeur(editnote.getText());
      dao.addNote(note);
    }
    @FXML
    public void cancel()
    {
        combpole.setValue(null);
        combstructure.setValue(null);
        editnote.setText(null);
    }
    @FXML
    public void modifier()
    { dao=new reuniondao();
      note=new Note();
      note.setIdnote(Integer.SIZE);
      note.setPoleIdpole((Pole) combpole.getValue());
      note.setStructureIdstructure((Structure) combstructure.getValue());
      note.setValeur(editnote.getText());
      dao.addNote(note);
        
        
    }
    @FXML
    public void delete()
    { dao=new reuniondao();
      note=new Note();
      note.setIdnote(Integer.SIZE);
      note.setPoleIdpole((Pole) combpole.getValue());
      note.setStructureIdstructure((Structure) combstructure.getValue());
      note.setValeur(editnote.getText());
      dao.addNote(note);
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
