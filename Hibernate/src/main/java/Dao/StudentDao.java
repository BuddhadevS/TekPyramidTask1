package Dao;

import java.util.List;

import Dto.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentDao {
	public void save(Student student) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		entityManager.detach(student);
		student.setName("abc");
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
		System.out.println("Data insert succesfully");
	}

//	public void saveAll(List<Student> students) {
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
//	        EntityManager em = factory.createEntityManager();
//	        EntityTransaction tx = em.getTransaction();
//
//	        tx.begin();
//	        for (Student s : students) {
//	            em.persist(s);
//	        }
//	        tx.commit();
//	        System.out.println("All students inserted successfully");
//	    }
	

//	public void update(Student student) {
//	    EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
//	    EntityManager entityManager = factory.createEntityManager();
//	    EntityTransaction transaction = entityManager.getTransaction();
//
//	    transaction.begin();
//	    entityManager.merge(student);  // merge will update if the student already exists
//	    transaction.commit();
//
//	    System.out.println("Data updated successfully");
//	}
	
//	public void DeleteById(int id) {
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
//	    EntityManager entityManager = factory.createEntityManager();
//	    EntityTransaction transaction = entityManager.getTransaction();
//	    
//	    Student student = entityManager.find(Student.class, id);
//	    transaction.begin();
//	    entityManager.remove(student);
//	    transaction.commit();
//	    System.out.println("Data removed ");
//	    
//	}
	//fethById
	
//	public void fethById(int id) {
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
//	    EntityManager entityManager = factory.createEntityManager();
//	    EntityTransaction transaction = entityManager.getTransaction();
//	    
//	    Student student = entityManager.find(Student.class, id);
//	    System.out.println("sid "+student.getId()+" sname = "+ student.getName()+" sDomain = "+student.getDomain()+" phNo = "+student.getPhno());
//	    
//	    
//	}
	
	
	

}
