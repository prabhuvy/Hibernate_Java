package com.ty;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetTheData {

	public static void main(String[] args) {
		System.out.println("Welcome for  getting data 😉😉");
		while(true)
		{


			Scanner s=new Scanner(System.in);
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			System.out.println("Get the Data Please enter the Id");
			Employee e=entityManager.find(Employee.class,s.nextInt());
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getAge());
			System.out.println("-------------------------");
			System.out.println("Enter the Id for Getting Companys Details");
			Company c=entityManager.find(Company.class,s.nextInt());
			System.out.println(c.getId());
			System.out.println(c.getCname());
			System.out.println(c.getLocation());
			System.out.println("data Got  Sucessfully");
			System.out.println("=====================================");
		}
	}

}
