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
@NamedQueries({@NamedQuery(name="Fish.getAll", query="Select f from Fish f")})
public class Fish implements Serializable {

    @Id
    private String fishId;
        @Column
    private String name;
    @Column
    private String price;

    public Fish() {
    }

    public Fish(String fishId, String name, String price) {
        this.fishId = fishId;
        this.name = name;
        this.price = price;
    }

    public String getFishId() {
        return fishId;
    }

    public void setFishId(String fishId) {
        this.fishId = fishId;
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
