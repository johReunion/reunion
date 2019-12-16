/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.reunion.bean;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author root
 */
@Embeddable
public class RecevoirPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "Personne_idPersonne")
    private int personneidPersonne;
    @Basic(optional = false)
    @Column(name = "invitation_idinvitation")
    private int invitationIdinvitation;
    @Basic(optional = false)
    @Column(name = "structure_idstructure")
    private int structureIdstructure;

    public RecevoirPK() {
    }

    public RecevoirPK(int personneidPersonne, int invitationIdinvitation, int structureIdstructure) {
        this.personneidPersonne = personneidPersonne;
        this.invitationIdinvitation = invitationIdinvitation;
        this.structureIdstructure = structureIdstructure;
    }

    public int getPersonneidPersonne() {
        return personneidPersonne;
    }

    public void setPersonneidPersonne(int personneidPersonne) {
        this.personneidPersonne = personneidPersonne;
    }

    public int getInvitationIdinvitation() {
        return invitationIdinvitation;
    }

    public void setInvitationIdinvitation(int invitationIdinvitation) {
        this.invitationIdinvitation = invitationIdinvitation;
    }

    public int getStructureIdstructure() {
        return structureIdstructure;
    }

    public void setStructureIdstructure(int structureIdstructure) {
        this.structureIdstructure = structureIdstructure;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) personneidPersonne;
        hash += (int) invitationIdinvitation;
        hash += (int) structureIdstructure;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RecevoirPK)) {
            return false;
        }
        RecevoirPK other = (RecevoirPK) object;
        if (this.personneidPersonne != other.personneidPersonne) {
            return false;
        }
        if (this.invitationIdinvitation != other.invitationIdinvitation) {
            return false;
        }
        if (this.structureIdstructure != other.structureIdstructure) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.reunion.bean.RecevoirPK[ personneidPersonne=" + personneidPersonne + ", invitationIdinvitation=" + invitationIdinvitation + ", structureIdstructure=" + structureIdstructure + " ]";
    }
    
}
