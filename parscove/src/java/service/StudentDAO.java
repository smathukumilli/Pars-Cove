package service;

import domain.Student;
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
public class StudentDAO {

    @PersistenceContext private EntityManager em;
    
    public void addStudent(Student student) {
        em.persist(student);
    }
    public void editStudent(Student student){
        em.merge(student);
    }
    public void deleteStudent(String id){
        Student student = em.find(Student.class, id);
        em.remove(student);
    }
    public Student getStudent(String id){
        return em.find(Student.class, id);
    }
    public List getAllStudents(){
        return em.createNamedQuery("Student.getAll").getResultList();
    }
}
