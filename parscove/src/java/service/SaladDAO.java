/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.Salads;
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
public class SaladDAO{

    @PersistenceContext private EntityManager em;
    
    public void addSalad(Salads salad) {
        em.persist(salad);
    }
    public void editSalad(Salads salad){
        em.merge(salad);
    }
    public void deleteSalad(String id){
       Salads salad = em.find(Salads.class, id);
        em.remove(salad);
    }
    public Salads getSalad(String id){
        return em.find(Salads.class, id);
    }
    public List getAllSalads(){
        return em.createNamedQuery("Salads.findAll").getResultList();
    }
}