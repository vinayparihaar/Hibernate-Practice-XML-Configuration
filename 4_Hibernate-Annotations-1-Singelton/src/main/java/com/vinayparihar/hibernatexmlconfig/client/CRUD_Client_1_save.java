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
 * @date May 13, 2020 @time 4:02:32 PM
 */
public class CRUD_Client_1_save {

	public static void main(String[] args) {

		Employee employee = new Employee();
		// employee.setEmployeeId(1);
		employee.setEmployeeFirstName("Laxmi");
		employee.setEmployeeLastName("Parihar");
		employee.setEmployeeEmail("vinay@gmail.com");
		employee.setEmployeePhone("0000000000");

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		int result = (int) session.save(employee);

		Transaction transaction = session.getTransaction();
		transaction.commit();

		session.close();
		HibernateUtil.shutDown();

		System.out.println("Employee " + result + " record inserted Successfully!!!");

	}

}
