package service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import domain.Chicken;
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
public class ChickenDAO {
       @PersistenceContext private EntityManager em;
       
          public void addChicken(Chicken chicken) {
        em.persist(chicken);
    }
    public void editChicken(Chicken chicken){
        em.merge(chicken);
    }
    public void deleteChicken(String id){
        Chicken chicken = em.find(Chicken.class, id);
        em.remove(chicken);
    }
    public Chicken getChicken(String id){
        return em.find(Chicken.class, id);
    }
    public List getAllChickens(){
        return em.createNamedQuery("Chicken.getAll").getResultList();
    }
}
