/**
 * 
 */
package com.vinayparihar.hibernatexmlconfig.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vinayparihar.hibernatexmlconfig.model.Employee;
import com.vinayparihar.hibernatexmlconfig.util.HibernateUtil;

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
		employee.setEmployeeEmail("aadhya@gmail.com");
		employee.setEmployeePhone("0000000000");

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		session.persist(employee);

		Transaction transaction = session.getTransaction();
		transaction.commit();

		session.close();
		HibernateUtil.shutdown();
		System.out.println("Employee record inserted Successfully!!!");

	}

}
