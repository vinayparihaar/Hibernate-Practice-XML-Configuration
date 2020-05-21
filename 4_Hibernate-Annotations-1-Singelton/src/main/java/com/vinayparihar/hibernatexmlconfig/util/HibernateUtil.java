/**
 * 
 */
package com.vinayparihar.hibernatexmlconfig.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author VinayParihar
 * @date May 14, 2020 @time 9:47:20 PM
 */
public class HibernateUtil {

	private final static SessionFactory SESSION_FACTORY = getSessionFactory();

	public static SessionFactory getSessionFactory() {
		if (SESSION_FACTORY == null) {
			Configuration configuration = new Configuration();
			return configuration.configure().buildSessionFactory();
		}
		return SESSION_FACTORY;
	}

	public static void shutDown() {
		if (SESSION_FACTORY != null) {
			SESSION_FACTORY.close();

		}
	}

}
