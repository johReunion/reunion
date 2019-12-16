/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.reunion.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author root
 */
@Entity
@Table(name = "duree")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Duree.findAll", query = "SELECT d FROM Duree d"),
    @NamedQuery(name = "Duree.findByIdduree", query = "SELECT d FROM Duree d WHERE d.idduree = :idduree"),
    @NamedQuery(name = "Duree.findByHeureDebut", query = "SELECT d FROM Duree d WHERE d.heureDebut = :heureDebut"),
    @NamedQuery(name = "Duree.findByHeureFin", query = "SELECT d FROM Duree d WHERE d.heureFin = :heureFin")})
public class Duree implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idduree")
    private Integer idduree;
    @Column(name = "heure_debut")
    private String heureDebut;
    @Column(name = "heure_fin")
    private String heureFin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dureeIdduree")
    private List<Reunion> reunionList;

    public Duree() {
    }

    public Duree(Integer idduree) {
        this.idduree = idduree;
    }

    public Integer getIdduree() {
        return idduree;
    }

    public void setIdduree(Integer idduree) {
        this.idduree = idduree;
    }

    public String getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    public String getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }

    @XmlTransient
    public List<Reunion> getReunionList() {
        return reunionList;
    }

    public void setReunionList(List<Reunion> reunionList) {
        this.reunionList = reunionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idduree != null ? idduree.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Duree)) {
            return false;
        }
        Duree other = (Duree) object;
        if ((this.idduree == null && other.idduree != null) || (this.idduree != null && !this.idduree.equals(other.idduree))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.reunion.bean.Duree[ idduree=" + idduree + " ]";
    }
    
}
