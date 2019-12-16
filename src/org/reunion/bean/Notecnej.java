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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author root
 */
@Entity
@Table(name = "notecnej")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Notecnej.findAll", query = "SELECT n FROM Notecnej n"),
    @NamedQuery(name = "Notecnej.findByIdnotecnej", query = "SELECT n FROM Notecnej n WHERE n.idnotecnej = :idnotecnej"),
    @NamedQuery(name = "Notecnej.findByValeurNotecnej", query = "SELECT n FROM Notecnej n WHERE n.valeurNotecnej = :valeurNotecnej")})
public class Notecnej implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idnotecnej")
    private Integer idnotecnej;
    @Column(name = "valeur_notecnej")
    private String valeurNotecnej;
    @JoinColumn(name = "personnelcnej_idpersonnelcnej", referencedColumnName = "idpersonnelcnej")
    @ManyToOne(optional = false)
    private Personnelcnej personnelcnejIdpersonnelcnej;
    @JoinColumn(name = "reunion_idreunion", referencedColumnName = "idreunion")
    @ManyToOne(optional = false)
    private Reunion reunionIdreunion;

    public Notecnej() {
    }

    public Notecnej(Integer idnotecnej) {
        this.idnotecnej = idnotecnej;
    }

    public Integer getIdnotecnej() {
        return idnotecnej;
    }

    public void setIdnotecnej(Integer idnotecnej) {
        this.idnotecnej = idnotecnej;
    }

    public String getValeurNotecnej() {
        return valeurNotecnej;
    }

    public void setValeurNotecnej(String valeurNotecnej) {
        this.valeurNotecnej = valeurNotecnej;
    }

    public Personnelcnej getPersonnelcnejIdpersonnelcnej() {
        return personnelcnejIdpersonnelcnej;
    }

    public void setPersonnelcnejIdpersonnelcnej(Personnelcnej personnelcnejIdpersonnelcnej) {
        this.personnelcnejIdpersonnelcnej = personnelcnejIdpersonnelcnej;
    }

    public Reunion getReunionIdreunion() {
        return reunionIdreunion;
    }

    public void setReunionIdreunion(Reunion reunionIdreunion) {
        this.reunionIdreunion = reunionIdreunion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnotecnej != null ? idnotecnej.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notecnej)) {
            return false;
        }
        Notecnej other = (Notecnej) object;
        if ((this.idnotecnej == null && other.idnotecnej != null) || (this.idnotecnej != null && !this.idnotecnej.equals(other.idnotecnej))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.reunion.bean.Notecnej[ idnotecnej=" + idnotecnej + " ]";
    }
    
}
