/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.Fish;
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
public class FishDAO {
     @PersistenceContext private EntityManager em;
     
       public void addFish(Fish fish) {
        em.persist(fish);
    }
    public void editFish(Fish fish){
        em.merge(fish);
    }
    public void deleteFish(String id){
        Fish fish = em.find(Fish.class, id);
        em.remove(fish);
    }
    public Fish getFish(String id){
        return em.find(Fish.class, id);
    }
    public List getAllFishs(){
        return em.createNamedQuery("Fish.getAll").getResultList();
    }
    
}
