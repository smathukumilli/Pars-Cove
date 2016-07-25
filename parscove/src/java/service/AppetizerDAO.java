/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.Appetizers;
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
public class AppetizerDAO {
     @PersistenceContext private EntityManager em;
     
      public void addAppetizer(Appetizers appetizer) {
        em.persist(appetizer);
    }
    public void editAppetizer(Appetizers appetizer){
        em.merge(appetizer);
    }
    public void deleteAppetizer(String id){
        Appetizers appetizer = em.find(Appetizers.class, id);
        em.remove(appetizer);
    }
    public Appetizers getAppetizer(String id){
        return em.find(Appetizers.class, id);
    }
    public List getAllAppetizers(){
        return em.createNamedQuery("Appetizers.getAll").getResultList();
    }
}
