/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.Interface;

import org.reunion.bean.Duree;
import org.reunion.bean.Groupereunion;
import org.reunion.bean.Invitation;
import org.reunion.bean.Note;
import org.reunion.bean.Notecnej;
import org.reunion.bean.Participer;
import org.reunion.bean.Personne;
import org.reunion.bean.Personnelcnej;
import org.reunion.bean.Pole;
import org.reunion.bean.Recevoir;
import org.reunion.bean.Reunion;
import org.reunion.bean.Structure;

/**
 *
 * @author root
 */
public interface interfaceDao {
    public void addStructure(Structure structure);
    public void addReunion(Reunion reunion);
    public void addNote(Note note);
    public void addPole(Pole pole);
    public void addGroupereunion(Groupereunion groupereunion);
    public void addDuree(Duree duree);
    public void addInvitation(Invitation invitation);
    public void addRecevoir(Recevoir recevoir);
    public void addPersonnecnej(Personnelcnej personnelcnej);
    public void addPersonne(Personne personne);
    public void addNotecnej(Notecnej notecnej);
    public void addParticiper(Participer participer);
    
      
    /*------------------------modification--------------------------------------------------------*/
    
    public  void updateStructure(Structure structure);
    public void updateReunion(Reunion reunion);
    public void updateNote(Note note);
    public void updatePole(Pole pole);
    public void updateGroupereunion(Groupereunion groupereunion);
    public void updateDuree(Duree duree);
    public void updateInvitation(Invitation invitation);
    public void updateRecevoir(Recevoir recevoir);
    public void updatePersonnecnej(Personnelcnej personnelcnej);
    public void updateNotecnej(Notecnej notecnej);
    public void updateParticiper(Participer participer);
    public void updatePersonne(Personne personne);
    
    
    /*--------------------------Delete ------------------------------------------*/
    
    public void deleteStructure(Structure structure);
    public void deleteReunion(Reunion reunion);
    public void deleteNote(Note note);
    public void deletePole(Pole pole);
    public void deleteGroupereunion(Groupereunion groupereunion);
    public void deleteDuree(Duree duree);
    public void deleteInvitation(Invitation invitation);
    public void deleteRecevoir(Recevoir recevoir);
    public void deletePersonnecnej(Personnelcnej personnelcnej);
    public void deleteNotecnej(Notecnej notecnej);
    public void deleteParticiper(Participer participer);
   public void  deletePersonne(Personne personne);
    
}
