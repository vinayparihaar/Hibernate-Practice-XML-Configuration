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
 * @date May 13, 2020 @time 7:29:04 PM
 */
public class CRUD_Client_5_update {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Employee employee = session.find(Employee.class, 2);

		employee.setEmployeeFirstName("Swetha");
		employee.setEmployeeLastName("Parihar");
		employee.setEmployeeEmail("swetha@gmail.com");
		employee.setEmployeePhone("7777777777");

		session.update(employee);

		Transaction transaction = session.getTransaction();
		transaction.commit();

		session.close();

		System.out.println("Employee with ID : " + employee.getEmployeeId() + " successfully Updated!!");

	}

}
