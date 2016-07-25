/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author shanmukh
 */


import domain.Specials;
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
public class SpecialsDAO {
     @PersistenceContext private EntityManager em;
       public void addSpecials(Specials specials) {
        em.persist(specials);
    }
    public void editSpecials(Specials specials){
        em.merge(specials);
    }
    public void deleteSpecials(String id){
        Specials specials = em.find(Specials.class, id);
        em.remove(specials);
    }
    public Specials getspecials(String id){
        return em.find(Specials.class, id);
    }
    public List getAllSpecials(){
        return em.createNamedQuery("Specials.findAll").getResultList();
    }
    
}

