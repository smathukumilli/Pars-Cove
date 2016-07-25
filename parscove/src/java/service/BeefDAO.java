/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.Beef;
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
public class BeefDAO {
     @PersistenceContext private EntityManager em;
       public void addBeef(Beef beef) {
        em.persist(beef);
    }
    public void editBeef(Beef beef){
        em.merge(beef);
    }
    public void deleteBeef(String id){
        Beef beef = em.find(Beef.class, id);
        em.remove(beef);
    }
    public Beef getBeef(String id){
        return em.find(Beef.class, id);
    }
    public List getAllBeefs(){
        return em.createNamedQuery("Beef.getAll").getResultList();
    }
    
}
