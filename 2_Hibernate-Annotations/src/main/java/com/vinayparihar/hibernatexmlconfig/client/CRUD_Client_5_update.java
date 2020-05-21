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
 * @date May 13, 2020 @time 7:29:04 PM
 */
public class CRUD_Client_5_update {

	public static void main(String[] args) {

		// Configuration configuration= new Configuration();
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		SessionFactory sessionFactory = configuration.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Employee employee = (Employee) session.get(Employee.class, 3);
		employee.setEmployeeFirstName("Swetha");
		employee.setEmployeeLastName("Parihar");
		employee.setEmployeeEmail("swetha@gmail.com");
		employee.setEmployeePhone("0000000000");

		session.update(employee);

		Transaction transaction = session.getTransaction();
		transaction.commit();

		session.close();
		sessionFactory.close();

		System.out.println("Employee with ID : " + employee.getEmployeeId() + " successfully Updated!!");

	}

}
