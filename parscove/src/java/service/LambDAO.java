/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.Lamb;
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
public class LambDAO {
     @PersistenceContext private EntityManager em;
     
       public void addLamb(Lamb lamb) {
        em.persist(lamb);
    }
    public void editLamb(Lamb lamb){
        em.merge(lamb);
    }
    public void deleteLamb(String id){
        Lamb lamb = em.find(Lamb.class, id);
        em.remove(lamb);
    }
    public Lamb getLamb(String id){
        return em.find(Lamb.class, id);
    }
    public List getAllLambs(){
        return em.createNamedQuery("Lamb.getAll").getResultList();
    }
    
}
