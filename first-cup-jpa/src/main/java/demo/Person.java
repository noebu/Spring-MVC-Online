package demo;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Person
 *
 */
@Entity

public class Person implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private int age;
	private String phNumber;
	private static final long serialVersionUID = 1L;

	public Person() {
		super();
	}
	
	
	public Person(String name, int age, String phNumber) {
		super();
		this.name = name;
		this.age = age;
		this.phNumber = phNumber;
	}


	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}   
	public String getPhNumber() {
		return this.phNumber;
	}

	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}
   
}
