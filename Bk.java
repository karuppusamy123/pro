package org.isbn.bk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Bk {

	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("NAME:");
		String name = bf.readLine();
		System.out.print("AUTHOR:");
		String author = bf.readLine();
		System.out.print("PUBLISHER:");
		String publisher = bf.readLine();
		System.out.print("PRICE:");
		double price = Double.valueOf(bf.readLine());
		System.out.print("PUBLISHED:");
		Date published = new Date(bf.readLine());
		System.out.print("ISBN:");
		String isbnNumber = bf.readLine();

		Book book = new Book(name,publisher,author,price,published,isbnNumber );
		System.out.print("ID:" + " " + book.getId());
		System.out.print("NAME:" + " " + book.getName());
		System.out.print("AUTHOR:" + " " + book.getAuthor());
		System.out.print("PUBLISHER:" + " " + book.getPublisher());
		System.out.print("PUBLISHED:" + " " + book.getPublished());
		System.out.print("PRICE:" + " " + book.getPrice());
		System.out.print("ISBN:" + " " + book.getIsbnNumber());
		session.save(book);
		session.getTransaction().commit();

		session.close();

	}

}
