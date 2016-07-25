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
@NamedQueries({@NamedQuery(name="Appetizers.getAll", query="Select a from Appetizers a")})
public class Appetizers implements Serializable {

    @Id
    private String AppetizerID;
        @Column
    private String name;
    @Column
    private String price;

    public Appetizers(String AppetizerID, String name, String price) {
        this.AppetizerID = AppetizerID;
        this.name = name;
        this.price = price;
    }

    public Appetizers() {
    }

    public String getAppetizerID() {
        return AppetizerID;
    }

    public void setAppetizerID(String AppetizerID) {
        this.AppetizerID = AppetizerID;
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
