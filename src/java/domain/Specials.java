/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
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
@Table(name = "specials")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Specials.findAll", query = "SELECT s FROM Specials s"),
    @NamedQuery(name = "Specials.findBySpecialsID", query = "SELECT s FROM Specials s WHERE s.specialsID = :specialsID"),
    @NamedQuery(name = "Specials.findByName", query = "SELECT s FROM Specials s WHERE s.name = :name"),
    @NamedQuery(name = "Specials.findByPrice", query = "SELECT s FROM Specials s WHERE s.price = :price")})
public class Specials implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "specialsID")
    private String specialsID;
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private String price;
            
            
     

    public Specials() {
    }

    public Specials(String specialsID, String name, String price) {
        this.specialsID = specialsID;
        this.name = name;
        this.price = price;
    }



    @Override
    public String toString() {
        return "domain.Specials[ specialsID=" + specialsID + " ]";
    }

    public String getSpecialsID() {
        return specialsID;
    }

    public void setSpecialsID(String specialsID) {
        this.specialsID = specialsID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
}
