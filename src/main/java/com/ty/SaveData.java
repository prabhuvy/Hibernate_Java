package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveData {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();


		Employee e1=new Employee();
		e1.setName("Sam");
		e1.setAge(35);

		Employee e2=new Employee();
		e2.setName("manu");
		e2.setAge(45);

		Company c1=new Company();
		c1.setCname("Wipro");
		c1.setLocation("Hubli");


		Company c2=new Company();
		c2.setCname("infosys");
		c2.setLocation("Mangalore");

		e1.setCompanys(c1);
		e2.setCompanys(c2);


		entityTransaction.begin();
		entityManager.persist(e1);
		entityManager.persist(e2);
		entityManager.persist(c1);
		entityManager.persist(c2);
		entityTransaction.commit();

		System.out.println("Data Added Sucessfully");







	}

}
