/**
 * 
 */
package com.vinayparihar.hibernatexmlconfig.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vinayparihar.hibernatexmlconfig.model.Employee;

/**
 * @author VinayParihar
 * @date May 13, 2020 @time 6:08:59 PM
 */
public class CRUD_Client_3_persist {

	public static void main(String[] args) {
		Employee employee = new Employee();
		// employee.setEmployeeId(1);
		employee.setEmployeeFirstName("aadhya");
		employee.setEmployeeLastName("Parihar");
		employee.setEmployeeEmail("vinay@gmail.com");
		employee.setEmployeePhone("0000000000");

		Configuration configuration = new Configuration();
		SessionFactory sessionFactory = configuration.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.persist(employee);

		Transaction transaction = session.getTransaction();
		transaction.commit();

		session.close();
		sessionFactory.close();
		System.out.println("Employee record inserted Successfully!!!");

	}

}
