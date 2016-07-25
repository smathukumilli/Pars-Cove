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
@NamedQueries({@NamedQuery(name="Beef.getAll", query="Select b from Beef b")})
public class Beef implements Serializable {

    @Id
    private String beefID;
     @Column
    private String name;
    @Column
    private String price;

    public Beef(String beefID, String name, String price) {
        this.beefID = beefID;
        this.name = name;
        this.price = price;
    }

    public Beef() {
    }

    public String getBeefID() {
        return beefID;
    }

    public void setBeefID(String beefID) {
        this.beefID = beefID;
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
