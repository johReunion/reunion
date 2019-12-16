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
@Table(name = "pole")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pole.findAll", query = "SELECT p FROM Pole p"),
    @NamedQuery(name = "Pole.findByIdpole", query = "SELECT p FROM Pole p WHERE p.idpole = :idpole"),
    @NamedQuery(name = "Pole.findByLibellePole", query = "SELECT p FROM Pole p WHERE p.libellePole = :libellePole"),
    @NamedQuery(name = "Pole.findByCommentairePole", query = "SELECT p FROM Pole p WHERE p.commentairePole = :commentairePole")})
public class Pole implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idpole")
    private Integer idpole;
    @Column(name = "libelle_pole")
    private String libellePole;
    @Column(name = "commentaire_pole")
    private String commentairePole;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "poleIdpole")
    private List<Note> noteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "poleIdpole")
    private List<Participer> participerList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "poleIdpole")
    private List<Groupereunion> groupereunionList;

    public Pole() {
    }

    public Pole(Integer idpole) {
        this.idpole = idpole;
    }

    public Integer getIdpole() {
        return idpole;
    }

    public void setIdpole(Integer idpole) {
        this.idpole = idpole;
    }

    public String getLibellePole() {
        return libellePole;
    }

    public void setLibellePole(String libellePole) {
        this.libellePole = libellePole;
    }

    public String getCommentairePole() {
        return commentairePole;
    }

    public void setCommentairePole(String commentairePole) {
        this.commentairePole = commentairePole;
    }

    @XmlTransient
    public List<Note> getNoteList() {
        return noteList;
    }

    public void setNoteList(List<Note> noteList) {
        this.noteList = noteList;
    }

    @XmlTransient
    public List<Participer> getParticiperList() {
        return participerList;
    }

    public void setParticiperList(List<Participer> participerList) {
        this.participerList = participerList;
    }

    @XmlTransient
    public List<Groupereunion> getGroupereunionList() {
        return groupereunionList;
    }

    public void setGroupereunionList(List<Groupereunion> groupereunionList) {
        this.groupereunionList = groupereunionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpole != null ? idpole.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pole)) {
            return false;
        }
        Pole other = (Pole) object;
        if ((this.idpole == null && other.idpole != null) || (this.idpole != null && !this.idpole.equals(other.idpole))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.reunion.bean.Pole[ idpole=" + idpole + " ]";
    }
    
}
