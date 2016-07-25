/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author shanmukh
 */
@Entity
@Table
@NamedQueries({@NamedQuery(name="Veg.getAll", query="Select v from Veg v")})
public class Veg implements Serializable {

    @Id
    @Column
    private String VegID;
        @Column
    private String name;
    @Column
    private String price;

    public Veg(String VegID, String name, String price) {
        this.VegID = VegID;
        this.name = name;
        this.price = price;
    }

    public Veg() {
    }

    public String getVegID() {
        return VegID;
    }

    public void setVegID(String VegID) {
        this.VegID = VegID;
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
