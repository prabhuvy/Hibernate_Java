package com.ty;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateData {
	public static void main(String[] args) {
		System.out.println("Welcome to Updation 😉😉");
		while(true)
		{


			Scanner s=new Scanner(System.in);
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction=entityManager.getTransaction();
			System.out.println("Enter the Id to be Updated");
			Employee e=entityManager.find(Employee.class,s.nextInt());
			e.setName("Dom");
			e.setAge(50);
			entityTransaction.begin();
			entityManager.merge(e);
			entityTransaction.commit();

			System.out.println("data Updated Sucessfully");
		}
	}
}