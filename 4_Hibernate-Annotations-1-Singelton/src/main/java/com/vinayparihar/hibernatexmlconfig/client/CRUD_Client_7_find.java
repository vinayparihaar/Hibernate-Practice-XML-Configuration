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
 * @date May 13, 2020 @time 7:34:55 PM
 */
public class CRUD_Client_7_find {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Employee employee = session.find(Employee.class, 4);

		System.out.println("Id : " + employee.getEmployeeId());
		System.out.println("FirstName : " + employee.getEmployeeFirstName());
		System.out.println("LastName : " + employee.getEmployeeLastName());
		System.out.println("Email : " + employee.getEmployeeEmail());
		System.out.println("Phone : " + employee.getEmployeePhone());

		Transaction transaction = session.getTransaction();
		transaction.commit();

		session.close();
		HibernateUtil.shutDown();

	}

}
