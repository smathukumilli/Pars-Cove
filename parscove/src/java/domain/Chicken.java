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

@Entity
@Table
@NamedQueries({@NamedQuery(name="Chicken.getAll", query="Select c from Chicken c")})
public class Chicken implements Serializable {
    @Id
    @Column
    private String chickenID;
    @Column
    private String name;
    @Column
    private String price;

    public String getChickenID() {
        return chickenID;
    }
    public Chicken(){}
   

    public void setChickenID(String chickenID) {
        this.chickenID = chickenID;
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
       public Chicken(String chickenID, String name, String price) {
        this.chickenID = chickenID;
        this.name = name;
        this.price = price;
    }

  
}
