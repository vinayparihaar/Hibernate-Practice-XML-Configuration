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
 * @date May 13, 2020 @time 5:59:33 PM
 */
public class CRUD_Client_2_saveOrUpdate {

	public static void main(String[] args) {

		Employee employee = new Employee();
		// employee.setEmployeeId(1);
		employee.setEmployeeFirstName("Digamber");
		employee.setEmployeeLastName("Parihar");
		employee.setEmployeeEmail("digamber@gmail.com");
		employee.setEmployeePhone("999999999");

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		/*
		 * To make this work set it to "update" in hibernate.cfg.xml
		 *  <property name="hbm2ddl.auto">update</property>
		 */

		session.saveOrUpdate(employee);

		Transaction transaction = session.getTransaction();
		transaction.commit();

		session.close();
		HibernateUtil.shutDown();

		System.out.println("Record Inserted Successfully from CRUD_Client_SaveorUpdate Class");

	}

}
