/**
 * 
 */
package com.vinayparihar.hibernatexmlconfig.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.vinayparihar.hibernatexmlconfig.model.Employee;

/**
 * @author VinayParihar
 * @date May 13, 2020 @time 6:38:28 PM
 */
public class CRUD_Client_4_delete {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setEmployeeId(1);
		employee.setEmployeeFirstName("Babu");
		employee.setEmployeeLastName("Parihar");
		employee.setEmployeeEmail("babu@gmail.com");
		employee.setEmployeePhone("0000000000");

		// Configuration configuration= new Configuration();
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		SessionFactory sessionFactory = configuration.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.delete(employee);

		Transaction transaction = session.getTransaction();
		transaction.commit();

		session.close();
		sessionFactory.close();

		System.out.println("Successfully Deleted!!");

	}

}
