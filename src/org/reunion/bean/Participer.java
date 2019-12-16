/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.reunion.bean;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author root
 */
@Entity
@Table(name = "participer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Participer.findAll", query = "SELECT p FROM Participer p"),
    @NamedQuery(name = "Participer.findByPersonneidPersonne", query = "SELECT p FROM Participer p WHERE p.personneidPersonne = :personneidPersonne"),
    @NamedQuery(name = "Participer.findByDateReunion", query = "SELECT p FROM Participer p WHERE p.dateReunion = :dateReunion"),
    @NamedQuery(name = "Participer.findByNotereunion", query = "SELECT p FROM Participer p WHERE p.notereunion = :notereunion")})
public class Participer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Personne_idPersonne")
    private Integer personneidPersonne;
    @Column(name = "date_reunion")
    private String dateReunion;
    @Column(name = "notereunion")
    private String notereunion;
    @JoinColumn(name = "Personne_idPersonne", referencedColumnName = "idPersonne", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Personne personne;
    @JoinColumn(name = "invitation_idinvitation", referencedColumnName = "idinvitation")
    @ManyToOne(optional = false)
    private Invitation invitationIdinvitation;
    @JoinColumn(name = "note_idnote", referencedColumnName = "idnote")
    @ManyToOne(optional = false)
    private Note noteIdnote;
    @JoinColumn(name = "pole_idpole", referencedColumnName = "idpole")
    @ManyToOne(optional = false)
    private Pole poleIdpole;
    @JoinColumn(name = "reunion_idreunion", referencedColumnName = "idreunion")
    @ManyToOne(optional = false)
    private Reunion reunionIdreunion;
    @JoinColumn(name = "structure_idstructure", referencedColumnName = "idstructure")
    @ManyToOne(optional = false)
    private Structure structureIdstructure;

    public Participer() {
    }

    public Participer(Integer personneidPersonne) {
        this.personneidPersonne = personneidPersonne;
    }

    public Integer getPersonneidPersonne() {
        return personneidPersonne;
    }

    public void setPersonneidPersonne(Integer personneidPersonne) {
        this.personneidPersonne = personneidPersonne;
    }

    public String getDateReunion() {
        return dateReunion;
    }

    public void setDateReunion(String dateReunion) {
        this.dateReunion = dateReunion;
    }

    public String getNotereunion() {
        return notereunion;
    }

    public void setNotereunion(String notereunion) {
        this.notereunion = notereunion;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public Invitation getInvitationIdinvitation() {
        return invitationIdinvitation;
    }

    public void setInvitationIdinvitation(Invitation invitationIdinvitation) {
        this.invitationIdinvitation = invitationIdinvitation;
    }

    public Note getNoteIdnote() {
        return noteIdnote;
    }

    public void setNoteIdnote(Note noteIdnote) {
        this.noteIdnote = noteIdnote;
    }

    public Pole getPoleIdpole() {
        return poleIdpole;
    }

    public void setPoleIdpole(Pole poleIdpole) {
        this.poleIdpole = poleIdpole;
    }

    public Reunion getReunionIdreunion() {
        return reunionIdreunion;
    }

    public void setReunionIdreunion(Reunion reunionIdreunion) {
        this.reunionIdreunion = reunionIdreunion;
    }

    public Structure getStructureIdstructure() {
        return structureIdstructure;
    }

    public void setStructureIdstructure(Structure structureIdstructure) {
        this.structureIdstructure = structureIdstructure;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personneidPersonne != null ? personneidPersonne.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Participer)) {
            return false;
        }
        Participer other = (Participer) object;
        if ((this.personneidPersonne == null && other.personneidPersonne != null) || (this.personneidPersonne != null && !this.personneidPersonne.equals(other.personneidPersonne))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.reunion.bean.Participer[ personneidPersonne=" + personneidPersonne + " ]";
    }
    
}
