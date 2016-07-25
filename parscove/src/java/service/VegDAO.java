/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.Veg;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author shanmukh
 */
@Stateless
@LocalBean
public class VegDAO {
     @PersistenceContext private EntityManager em;
       public void addVeg(Veg veg) {
        em.persist(veg);
    }
    public void editVeg(Veg veg){
        em.merge(veg);
    }
    public void deleteVeg(String id){
        Veg veg = em.find(Veg.class, id);
        em.remove(veg);
    }
    public Veg getVeg(String id){
        return em.find(Veg.class, id);
    }
    public List getAllVegs(){
        return em.createNamedQuery("Veg.getAll").getResultList();
    }
    
}
