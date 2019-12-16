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
@Table(name = "structure")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Structure.findAll", query = "SELECT s FROM Structure s"),
    @NamedQuery(name = "Structure.findByIdstructure", query = "SELECT s FROM Structure s WHERE s.idstructure = :idstructure"),
    @NamedQuery(name = "Structure.findByNomStructure", query = "SELECT s FROM Structure s WHERE s.nomStructure = :nomStructure"),
    @NamedQuery(name = "Structure.findByDescriptionStructure", query = "SELECT s FROM Structure s WHERE s.descriptionStructure = :descriptionStructure"),
    @NamedQuery(name = "Structure.findByTelStructure", query = "SELECT s FROM Structure s WHERE s.telStructure = :telStructure"),
    @NamedQuery(name = "Structure.findByEmailStructure", query = "SELECT s FROM Structure s WHERE s.emailStructure = :emailStructure"),
    @NamedQuery(name = "Structure.findByLogoStructure", query = "SELECT s FROM Structure s WHERE s.logoStructure = :logoStructure")})
public class Structure implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idstructure")
    private Integer idstructure;
    @Column(name = "nom_structure")
    private String nomStructure;
    @Column(name = "description_structure")
    private String descriptionStructure;
    @Column(name = "tel_structure")
    private String telStructure;
    @Column(name = "email_structure")
    private String emailStructure;
    @Column(name = "logo_structure")
    private String logoStructure;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "structureIdstructure")
    private List<Note> noteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "structure")
    private List<Recevoir> recevoirList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "structureIdstructure")
    private List<Participer> participerList;

    public Structure() {
    }

    public Structure(Integer idstructure) {
        this.idstructure = idstructure;
    }

    public Integer getIdstructure() {
        return idstructure;
    }

    public void setIdstructure(Integer idstructure) {
        this.idstructure = idstructure;
    }

    public String getNomStructure() {
        return nomStructure;
    }

    public void setNomStructure(String nomStructure) {
        this.nomStructure = nomStructure;
    }

    public String getDescriptionStructure() {
        return descriptionStructure;
    }

    public void setDescriptionStructure(String descriptionStructure) {
        this.descriptionStructure = descriptionStructure;
    }

    public String getTelStructure() {
        return telStructure;
    }

    public void setTelStructure(String telStructure) {
        this.telStructure = telStructure;
    }

    public String getEmailStructure() {
        return emailStructure;
    }

    public void setEmailStructure(String emailStructure) {
        this.emailStructure = emailStructure;
    }

    public String getLogoStructure() {
        return logoStructure;
    }

    public void setLogoStructure(String logoStructure) {
        this.logoStructure = logoStructure;
    }

    @XmlTransient
    public List<Note> getNoteList() {
        return noteList;
    }

    public void setNoteList(List<Note> noteList) {
        this.noteList = noteList;
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
        hash += (idstructure != null ? idstructure.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Structure)) {
            return false;
        }
        Structure other = (Structure) object;
        if ((this.idstructure == null && other.idstructure != null) || (this.idstructure != null && !this.idstructure.equals(other.idstructure))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.reunion.bean.Structure[ idstructure=" + idstructure + " ]";
    }
    
}
