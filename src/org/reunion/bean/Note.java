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
@Table(name = "note")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Note.findAll", query = "SELECT n FROM Note n"),
    @NamedQuery(name = "Note.findByIdnote", query = "SELECT n FROM Note n WHERE n.idnote = :idnote"),
    @NamedQuery(name = "Note.findByValeur", query = "SELECT n FROM Note n WHERE n.valeur = :valeur")})
public class Note implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idnote")
    private Integer idnote;
    @Column(name = "valeur")
    private String valeur;
    @JoinColumn(name = "pole_idpole", referencedColumnName = "idpole")
    @ManyToOne(optional = false)
    private Pole poleIdpole;
    @JoinColumn(name = "structure_idstructure", referencedColumnName = "idstructure")
    @ManyToOne(optional = false)
    private Structure structureIdstructure;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "noteIdnote")
    private List<Participer> participerList;

    public Note() {
    }

    public Note(Integer idnote) {
        this.idnote = idnote;
    }

    public Integer getIdnote() {
        return idnote;
    }

    public void setIdnote(Integer idnote) {
        this.idnote = idnote;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public Pole getPoleIdpole() {
        return poleIdpole;
    }

    public void setPoleIdpole(Pole poleIdpole) {
        this.poleIdpole = poleIdpole;
    }

    public Structure getStructureIdstructure() {
        return structureIdstructure;
    }

    public void setStructureIdstructure(Structure structureIdstructure) {
        this.structureIdstructure = structureIdstructure;
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
        hash += (idnote != null ? idnote.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Note)) {
            return false;
        }
        Note other = (Note) object;
        if ((this.idnote == null && other.idnote != null) || (this.idnote != null && !this.idnote.equals(other.idnote))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.reunion.bean.Note[ idnote=" + idnote + " ]";
    }
    
}
