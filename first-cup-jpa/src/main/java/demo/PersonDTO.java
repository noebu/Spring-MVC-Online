package demo;

import javax.persistence.EntityManager;

public class PersonDTO {
	
	private EntityManager em;

	public PersonDTO(EntityManager em) {
		super();
		this.em = em;
	}
	
	public void createPerson(String name, int age, String phoneNumber) {
		Person person = new Person(name, age, phoneNumber);
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
	}
	
	public Person findById(int id) {
		return em.find(Person.class, id);
	}
	
	public void removePersonById(int id) {
		em.getTransaction().begin();
		em.remove(findById(id));
		em.getTransaction().commit();
	}
	
	public void updateName(int id,String name) {
		em.getTransaction().begin();
		Person oldPerson = findById(id);
		
		oldPerson.setName(name);
		em.getTransaction().commit();
	}
}
