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
@Table(name = "reunion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reunion.findAll", query = "SELECT r FROM Reunion r"),
    @NamedQuery(name = "Reunion.findByIdreunion", query = "SELECT r FROM Reunion r WHERE r.idreunion = :idreunion"),
    @NamedQuery(name = "Reunion.findByDateReunion", query = "SELECT r FROM Reunion r WHERE r.dateReunion = :dateReunion")})
public class Reunion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idreunion")
    private Integer idreunion;
    @Column(name = "date_reunion")
    private String dateReunion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "reunionIdreunion")
    private List<Notecnej> notecnejList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "reunionIdreunion")
    private List<Participer> participerList;
    @JoinColumn(name = "duree_idduree", referencedColumnName = "idduree")
    @ManyToOne(optional = false)
    private Duree dureeIdduree;
    @JoinColumn(name = "groupereunion_idgroupereunion", referencedColumnName = "idgroupereunion")
    @ManyToOne(optional = false)
    private Groupereunion groupereunionIdgroupereunion;

    public Reunion() {
    }

    public Reunion(Integer idreunion) {
        this.idreunion = idreunion;
    }

    public Integer getIdreunion() {
        return idreunion;
    }

    public void setIdreunion(Integer idreunion) {
        this.idreunion = idreunion;
    }

    public String getDateReunion() {
        return dateReunion;
    }

    public void setDateReunion(String dateReunion) {
        this.dateReunion = dateReunion;
    }

    @XmlTransient
    public List<Notecnej> getNotecnejList() {
        return notecnejList;
    }

    public void setNotecnejList(List<Notecnej> notecnejList) {
        this.notecnejList = notecnejList;
    }

    @XmlTransient
    public List<Participer> getParticiperList() {
        return participerList;
    }

    public void setParticiperList(List<Participer> participerList) {
        this.participerList = participerList;
    }

    public Duree getDureeIdduree() {
        return dureeIdduree;
    }

    public void setDureeIdduree(Duree dureeIdduree) {
        this.dureeIdduree = dureeIdduree;
    }

    public Groupereunion getGroupereunionIdgroupereunion() {
        return groupereunionIdgroupereunion;
    }

    public void setGroupereunionIdgroupereunion(Groupereunion groupereunionIdgroupereunion) {
        this.groupereunionIdgroupereunion = groupereunionIdgroupereunion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreunion != null ? idreunion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reunion)) {
            return false;
        }
        Reunion other = (Reunion) object;
        if ((this.idreunion == null && other.idreunion != null) || (this.idreunion != null && !this.idreunion.equals(other.idreunion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.reunion.bean.Reunion[ idreunion=" + idreunion + " ]";
    }
    
}
