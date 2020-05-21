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
public class CRUD_Client_0_Save {

	public static void main(String[] args) {

		Employee employee = new Employee();
		//employee.setEmployeeId(1);
		employee.setEmployeeFirstName("Aaryan");
		employee.setEmployeeLastName("Parihar");
		employee.setEmployeeEmail("aaryan@gmail.com");
		employee.setEmployeePhone("9999999999");

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		session.save(employee);

		Transaction transaction = session.getTransaction();
		transaction.commit();

		//transaction.rollback();
		session.close();
		

	}

}
