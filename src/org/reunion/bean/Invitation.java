/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.reunion.bean;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author root
 */
@Entity
@Table(name = "invitation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Invitation.findAll", query = "SELECT i FROM Invitation i"),
    @NamedQuery(name = "Invitation.findByIdinvitation", query = "SELECT i FROM Invitation i WHERE i.idinvitation = :idinvitation"),
    @NamedQuery(name = "Invitation.findByDateInvitation", query = "SELECT i FROM Invitation i WHERE i.dateInvitation = :dateInvitation")})
public class Invitation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idinvitation")
    private Integer idinvitation;
    @Column(name = "date_invitation")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateInvitation;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invitation")
    private List<Recevoir> recevoirList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invitationIdinvitation")
    private List<Participer> participerList;

    public Invitation() {
    }

    public Invitation(Integer idinvitation) {
        this.idinvitation = idinvitation;
    }

    public Integer getIdinvitation() {
        return idinvitation;
    }

    public void setIdinvitation(Integer idinvitation) {
        this.idinvitation = idinvitation;
    }

    public Date getDateInvitation() {
        return dateInvitation;
    }

    public void setDateInvitation(Date dateInvitation) {
        this.dateInvitation = dateInvitation;
    }

    @XmlTransient
    public List<Recevoir> getRecevoirList() {
        return recevoirList;
    }

    public void setRecevoirList(List<Recevoir> recevoirList) {
        this.recevoirList = recevoirList;
    }

    @XmlTransient
    public List<Participer> getParticiperList() {
        return participerList;
    }

    public void setParticiperList(List<Participer> participerList) {
        this.participerList = participerList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idinvitation != null ? idinvitation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Invitation)) {
            return false;
        }
        Invitation other = (Invitation) object;
        if ((this.idinvitation == null && other.idinvitation != null) || (this.idinvitation != null && !this.idinvitation.equals(other.idinvitation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.reunion.bean.Invitation[ idinvitation=" + idinvitation + " ]";
    }
    
}
