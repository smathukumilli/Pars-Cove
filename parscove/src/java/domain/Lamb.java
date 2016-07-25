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
@NamedQueries({@NamedQuery(name="Lamb.getAll", query="Select l from Lamb l")})
public class Lamb implements Serializable {

    @Id
    private String lambID;
        @Column
    private String name;
    @Column
    private String price;

    public Lamb(String lambID, String name, String price) {
        this.lambID = lambID;
        this.name = name;
        this.price = price;
    }

    public Lamb() {
    }

    public String getLambID() {
        return lambID;
    }

    public void setLambID(String lambID) {
        this.lambID = lambID;
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
