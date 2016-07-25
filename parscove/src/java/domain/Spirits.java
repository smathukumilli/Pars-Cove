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
@NamedQueries({@NamedQuery(name="Spirits.getAll", query="Select s from Spirits s")})
public class Spirits implements Serializable {

    @Id
    @Column
    private String spiritID;
 @Column
    private String name;
    @Column
    private String price;

    public Spirits(String spiritID, String name, String price) {
        this.spiritID = spiritID;
        this.name = name;
        this.price = price;
    }

    public Spirits() {
    }

    public String getSpiritID() {
        return spiritID;
    }

    public void setSpiritID(String spiritID) {
        this.spiritID = spiritID;
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
