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
 * @date May 13, 2020 @time 4:02:32 PM
 */
public class CRUD_Client_0_Save {

	public static void main(String[] args) {

		Employee employee = new Employee();
		// employee.setEmployeeId(1);
		employee.setEmployeeFirstName("Laxmi");
		employee.setEmployeeLastName("Parihar");
		employee.setEmployeeEmail("vinay@gmail.com");
		employee.setEmployeePhone("0000000000");

		Configuration configuration = new Configuration();
		SessionFactory sessionFactory = configuration.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(employee);

		Transaction transaction = session.getTransaction();
		transaction.commit();

		session.close();
		sessionFactory.close();

	}

}
