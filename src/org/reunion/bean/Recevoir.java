/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.reunion.bean;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author root
 */
@Entity
@Table(name = "recevoir")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Recevoir.findAll", query = "SELECT r FROM Recevoir r"),
    @NamedQuery(name = "Recevoir.findByPersonneidPersonne", query = "SELECT r FROM Recevoir r WHERE r.recevoirPK.personneidPersonne = :personneidPersonne"),
    @NamedQuery(name = "Recevoir.findByInvitationIdinvitation", query = "SELECT r FROM Recevoir r WHERE r.recevoirPK.invitationIdinvitation = :invitationIdinvitation"),
    @NamedQuery(name = "Recevoir.findByStructureIdstructure", query = "SELECT r FROM Recevoir r WHERE r.recevoirPK.structureIdstructure = :structureIdstructure")})
public class Recevoir implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RecevoirPK recevoirPK;
    @JoinColumn(name = "Personne_idPersonne", referencedColumnName = "idPersonne", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Personne personne;
    @JoinColumn(name = "invitation_idinvitation", referencedColumnName = "idinvitation", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Invitation invitation;
    @JoinColumn(name = "structure_idstructure", referencedColumnName = "idstructure", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Structure structure;

    public Recevoir() {
    }

    public Recevoir(RecevoirPK recevoirPK) {
        this.recevoirPK = recevoirPK;
    }

    public Recevoir(int personneidPersonne, int invitationIdinvitation, int structureIdstructure) {
        this.recevoirPK = new RecevoirPK(personneidPersonne, invitationIdinvitation, structureIdstructure);
    }

    public RecevoirPK getRecevoirPK() {
        return recevoirPK;
    }

    public void setRecevoirPK(RecevoirPK recevoirPK) {
        this.recevoirPK = recevoirPK;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public Invitation getInvitation() {
        return invitation;
    }

    public void setInvitation(Invitation invitation) {
        this.invitation = invitation;
    }

    public Structure getStructure() {
        return structure;
    }

    public void setStructure(Structure structure) {
        this.structure = structure;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (recevoirPK != null ? recevoirPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recevoir)) {
            return false;
        }
        Recevoir other = (Recevoir) object;
        if ((this.recevoirPK == null && other.recevoirPK != null) || (this.recevoirPK != null && !this.recevoirPK.equals(other.recevoirPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.reunion.bean.Recevoir[ recevoirPK=" + recevoirPK + " ]";
    }
    
}
