package org.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Emp {

	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("NAME:");
		String name = bf.readLine();
		System.out.println("EMAIL:");
		String emailId = bf.readLine();
		System.out.println("PHONE:");
		long phone = Long.valueOf(bf.readLine());
		
		Employee employee = new Employee( name, emailId, phone);
		System.out.println("ID:" + " " + employee.getId());
		System.out.println("NAME:" + " " + employee.getName());
		System.out.println("EMAILID:" + " " + employee.getEmailId());
		System.out.println("PHONE:" + " " + employee.getPhone());
		
		session.save(employee);
		session.getTransaction().commit();
		
		session.close();

	}

}
