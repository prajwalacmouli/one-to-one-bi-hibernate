package com.ty.oneToOneBi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.oneToOneBi.dto.Pan;
import com.ty.oneToOneBi.dto.Person;

public class TestPersonSave {
	public static void main(String[] args) {
		
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
	EntityManager manager =factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	Person person = new Person();
	person.setName("Priya");
	person.setAge(21);
	
	Pan pan = new Pan();
	pan.setPanNumber("ASDF23453");
	pan.setFatherName("Anil");
	
	person.setPan(pan);
	
	transaction.begin();
	manager.persist(person);
	manager.persist(pan);
	transaction.commit();
	System.out.println("--------------data stored------------------");
	

}
}