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
 * @date May 13, 2020 @time 6:38:28 PM
 */
public class CRUD_Client_4_delete {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setEmployeeId(5);
		employee.setEmployeeFirstName("aadhya");
		employee.setEmployeeLastName("Parihar");
		employee.setEmployeeEmail("aadhya@gmail.com");
		employee.setEmployeePhone("0000000000");

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		session.delete(employee);

		Transaction transaction = session.getTransaction();
		transaction.commit();

		session.close();

		System.out.println("Successfully Deleted!!");

	}

}
