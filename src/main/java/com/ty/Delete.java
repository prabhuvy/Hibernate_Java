package com.ty;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {
	public static void main(String[] args) {
		System.out.println("Welcome to Deletion 😉😉");
		while(true)
		{


			Scanner s=new Scanner(System.in);
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction=entityManager.getTransaction();
			System.out.println("Enter the Id to be Deleted");
			Employee e=entityManager.find(Employee.class,s.nextInt());
			if(e!=null)
			{

				entityTransaction.begin();
				entityManager.remove(e);
				entityTransaction.commit();
			}
			else
			{
				System.out.println("Already Data Deleted");
			}

			System.out.println("data Deleted Sucessfully");
		}
	}

}
