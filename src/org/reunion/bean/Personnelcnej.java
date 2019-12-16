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
@Table(name = "personnelcnej")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personnelcnej.findAll", query = "SELECT p FROM Personnelcnej p"),
    @NamedQuery(name = "Personnelcnej.findByIdpersonnelcnej", query = "SELECT p FROM Personnelcnej p WHERE p.idpersonnelcnej = :idpersonnelcnej"),
    @NamedQuery(name = "Personnelcnej.findByNomCnej", query = "SELECT p FROM Personnelcnej p WHERE p.nomCnej = :nomCnej"),
    @NamedQuery(name = "Personnelcnej.findByPrenomCnej", query = "SELECT p FROM Personnelcnej p WHERE p.prenomCnej = :prenomCnej")})
public class Personnelcnej implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idpersonnelcnej")
    private Integer idpersonnelcnej;
    @Column(name = "nom_cnej")
    private String nomCnej;
    @Column(name = "prenom_cnej")
    private String prenomCnej;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personnelcnejIdpersonnelcnej")
    private List<Notecnej> notecnejList;

    public Personnelcnej() {
    }

    public Personnelcnej(Integer idpersonnelcnej) {
        this.idpersonnelcnej = idpersonnelcnej;
    }

    public Integer getIdpersonnelcnej() {
        return idpersonnelcnej;
    }

    public void setIdpersonnelcnej(Integer idpersonnelcnej) {
        this.idpersonnelcnej = idpersonnelcnej;
    }

    public String getNomCnej() {
        return nomCnej;
    }

    public void setNomCnej(String nomCnej) {
        this.nomCnej = nomCnej;
    }

    public String getPrenomCnej() {
        return prenomCnej;
    }

    public void setPrenomCnej(String prenomCnej) {
        this.prenomCnej = prenomCnej;
    }

    @XmlTransient
    public List<Notecnej> getNotecnejList() {
        return notecnejList;
    }

    public void setNotecnejList(List<Notecnej> notecnejList) {
        this.notecnejList = notecnejList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpersonnelcnej != null ? idpersonnelcnej.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personnelcnej)) {
            return false;
        }
        Personnelcnej other = (Personnelcnej) object;
        if ((this.idpersonnelcnej == null && other.idpersonnelcnej != null) || (this.idpersonnelcnej != null && !this.idpersonnelcnej.equals(other.idpersonnelcnej))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.reunion.bean.Personnelcnej[ idpersonnelcnej=" + idpersonnelcnej + " ]";
    }
    
}
