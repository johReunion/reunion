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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "groupereunion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Groupereunion.findAll", query = "SELECT g FROM Groupereunion g"),
    @NamedQuery(name = "Groupereunion.findByIdgroupereunion", query = "SELECT g FROM Groupereunion g WHERE g.idgroupereunion = :idgroupereunion"),
    @NamedQuery(name = "Groupereunion.findByLibelleGroupereunion", query = "SELECT g FROM Groupereunion g WHERE g.libelleGroupereunion = :libelleGroupereunion")})
public class Groupereunion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idgroupereunion")
    private Integer idgroupereunion;
    @Column(name = "libelle_groupereunion")
    private String libelleGroupereunion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "groupereunionIdgroupereunion")
    private List<Reunion> reunionList;
    @JoinColumn(name = "pole_idpole", referencedColumnName = "idpole")
    @ManyToOne(optional = false)
    private Pole poleIdpole;

    public Groupereunion() {
    }

    public Groupereunion(Integer idgroupereunion) {
        this.idgroupereunion = idgroupereunion;
    }

    public Integer getIdgroupereunion() {
        return idgroupereunion;
    }

    public void setIdgroupereunion(Integer idgroupereunion) {
        this.idgroupereunion = idgroupereunion;
    }

    public String getLibelleGroupereunion() {
        return libelleGroupereunion;
    }

    public void setLibelleGroupereunion(String libelleGroupereunion) {
        this.libelleGroupereunion = libelleGroupereunion;
    }

    @XmlTransient
    public List<Reunion> getReunionList() {
        return reunionList;
    }

    public void setReunionList(List<Reunion> reunionList) {
        this.reunionList = reunionList;
    }

    public Pole getPoleIdpole() {
        return poleIdpole;
    }

    public void setPoleIdpole(Pole poleIdpole) {
        this.poleIdpole = poleIdpole;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idgroupereunion != null ? idgroupereunion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Groupereunion)) {
            return false;
        }
        Groupereunion other = (Groupereunion) object;
        if ((this.idgroupereunion == null && other.idgroupereunion != null) || (this.idgroupereunion != null && !this.idgroupereunion.equals(other.idgroupereunion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.reunion.bean.Groupereunion[ idgroupereunion=" + idgroupereunion + " ]";
    }
    
}
