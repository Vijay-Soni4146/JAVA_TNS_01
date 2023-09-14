package student_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentOperations_Data {

	public static void main(String[] args) {
		
		EntityManagerFactory e1 = Persistence.createEntityManagerFactory("studentinfo");
		EntityManager em = e1.createEntityManager();
		
		em.getTransaction().begin();
		
		Student s1 = new Student();
		s1.setId(2);
		s1.setName("Vijay");
		
		em.persist(s1);
		
		System.out.println("Data Saved!!!!");
		
		em.getTransaction().commit();
		
	}

}
