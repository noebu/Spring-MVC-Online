package demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPU");
		EntityManager em=emf.createEntityManager();
		
		
		
		/*EntityTransaction tx=em.getTransaction();
		
		Person person1=new Person("Min Aung", 35, "3804670114");
		
		tx.begin();
		
		em.persist(person1);
		
		tx.commit();
		
		
		
		
		em.close();
		emf.close();
		*/

		PersonDTO obj = new PersonDTO(em);
//		obj.createPerson("May thazin", 26, "888888888");
//		obj.createPerson("Myo Nyein", 33, "333333333");
//		obj.createPerson("Wutyi", 30, "4444444444");
		
//		Person person = obj.findById(4);
//		System.out.println("Name:" + person.getName());
//		System.out.println("Age:" + person.getAge());
//		System.out.println("Phone Number:" + person.getPhNumber());
		
//		obj.removePersonById(4);
		
		obj.updateName(1, "Noebu");
		
		
		
		
		
	}

}
