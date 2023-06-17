package com.ty;

import java.util.Scanner;
import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllTheData {
	public static void main(String[] args) {
		System.out.println("Welcome to data getting(All) 😉😉");

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();

		Query query=entityManager.createQuery("select s from Employee s");
		Query query1=entityManager.createQuery("select s from Company s");

		List<Employee> list =query.getResultList();
		for(Employee l:list)
		{
			System.out.println(l.getId());
			System.out.println(l.getName());
			System.out.println(l.getAge());
		}
		System.out.println("--------------------------");
		List<Company> list1 =query1.getResultList();
		for(Company c:list1)
		{
			System.out.println(c.getId());
			System.out.println(c.getCname());
			System.out.println(c.getLocation());
		}

		System.out.println("All Data Got Sucessfully");



	}
}