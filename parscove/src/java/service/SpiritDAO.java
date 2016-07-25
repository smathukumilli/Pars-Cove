/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.Spirits;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author shanmukh
 */
@Stateless
@LocalBean
public class SpiritDAO {
    @PersistenceContext private EntityManager em;
    
     public void addSpirit(Spirits spirit) {
        em.persist(spirit);
    }
    public void editSpirit(Spirits spirit){
        em.merge(spirit);
    }
    public void deleteSpirit(String id){
        Spirits spirit = em.find(Spirits.class, id);
        em.remove(spirit);
    }
    public Spirits getSpirit(String id){
        return em.find(Spirits.class, id);
    }
    public List getAllSpirits(){
        return em.createNamedQuery("Spirits.getAll").getResultList();
    }
    
}
