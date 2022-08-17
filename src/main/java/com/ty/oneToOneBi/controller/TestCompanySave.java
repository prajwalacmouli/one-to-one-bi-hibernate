package com.ty.oneToOneBi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.oneToOneBi.dto.Company;
import com.ty.oneToOneBi.dto.Gst;

public class TestCompanySave {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Company company = new Company();
		company.setName("Capgemini");
		company.setPhone(765443444);

		Gst gst = new Gst();
		gst.setGstNumber(987645686);
		gst.setStatus("Updated");
		
		company.setGst(gst);
		gst.setCompany(company);
		
		transaction.begin();
		manager.persist(company);
		manager.persist(gst);
		transaction.commit();
		System.out.println("--------------data stored------------------");

	}

}
