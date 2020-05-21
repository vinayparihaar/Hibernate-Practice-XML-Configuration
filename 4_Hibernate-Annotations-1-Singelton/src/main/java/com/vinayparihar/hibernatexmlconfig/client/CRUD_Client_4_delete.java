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

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Employee employee = session.find(Employee.class, 1);
		session.delete(employee);

		Transaction transaction = session.getTransaction();
		transaction.commit();

		session.close();
		HibernateUtil.shutDown();

		System.out.println("Employee with ID : " + employee.getEmployeeId() + " successfully deleted!!");

	}

}
