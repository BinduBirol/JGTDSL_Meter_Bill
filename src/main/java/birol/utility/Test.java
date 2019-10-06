package birol.utility;

import org.hibernate.Session;
import org.hibernate.Transaction;

import birol.dto.Test_b;


import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Test {	

	@Autowired
	private SessionFactory sessionFactory;
	/*public void createEmployee(){
		Session session= null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			int batchSize = 5;
			
			
			for ( int i = 1; i <= 100; i++ ) {
				Test_b t= new Test_b();
				t.setBill_no("bill"+i);
				t.setAmount(10*i);				
				session.persist(t);
				if ( i > 0 && i % batchSize == 0 ) {
					System.out.println("flush and clear the session");
		            //flush a batch of inserts and release memory
		            session.flush();
		            session.clear();
		        }
		    }			
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}*/
	
	public static void main(String[] args) {
		/*
		Session session= null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			int batchSize = 5;
			
			
			for ( int i = 1; i <= 100; i++ ) {
				Test_b t= new Test_b();
				t.setBill_no("bill"+i);
				t.setAmount(10*i);				
				session.persist(t);
				if ( i > 0 && i % batchSize == 0 ) {
					System.out.println("flush and clear the session");
		            //flush a batch of inserts and release memory
		            session.flush();
		            session.clear();
		        }
		    }			
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	}
}





	

