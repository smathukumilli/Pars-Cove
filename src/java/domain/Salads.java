/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author shanmukh
 */
@Entity
@Table(name = "Salads")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salads.findAll", query = "SELECT s FROM Salads s"),
    @NamedQuery(name = "Salads.findBySaladId", query = "SELECT s FROM Salads s WHERE s.saladId = :saladId"),
    @NamedQuery(name = "Salads.findBySaladname", query = "SELECT s FROM Salads s WHERE s.saladname = :saladname"),
    @NamedQuery(name = "Salads.findBySaladPrice", query = "SELECT s FROM Salads s WHERE s.saladPrice = :saladPrice"),
    @NamedQuery(name = "Salads.findByDescription", query = "SELECT s FROM Salads s WHERE s.description = :description")})
public class Salads implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "salad_id")
    private String saladId;
    @Size(max = 45)
    @Column(name = "Salad_name")
    private String saladname;
    @Column(name = "salad_price")
    private String saladPrice;
    @Size(max = 45)
    @Column(name = "description")
    private String description;

    public Salads() {
    }

    public Salads(String saladId) {
        this.saladId = saladId;
    }

    public Salads(String saladId, String saladname, String saladPrice) {
        this.saladId = saladId;
        this.saladname = saladname;
        this.saladPrice = saladPrice;
    }

    public String getSaladId() {
        return saladId;
    }

    public void setSaladId(String saladId) {
        this.saladId = saladId;
    }

    public String getSaladname() {
        return saladname;
    }

    public void setSaladname(String saladname) {
        this.saladname = saladname;
    }

    public String getSaladPrice() {
        return saladPrice;
    }

    public void setSaladPrice(String saladPrice) {
        this.saladPrice = saladPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
//
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (saladId != null ? saladId.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Salads)) {
//            return false;
//        }
//        Salads other = (Salads) object;
//        return !((this.saladId == null && other.saladId != null) || (this.saladId != null && !this.saladId.equals(other.saladId)));
//    }
//

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.saladId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Salads other = (Salads) obj;
        if (!Objects.equals(this.saladId, other.saladId)) {
            return false;
        }
        return true;
    }

    

    
}
