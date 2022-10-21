package com.maven.junit.hibernatejpa;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//public class JPADemo {
//	private static final EntityManagerFactory emFactoryObj;
//    private static final String PERSISTENCE_UNIT_NAME = "JPADemo";  
// 
//    static {
//        emFactoryObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
//    }
// 
//    // This Method Is Used To Retrieve The 'EntityManager' Object
//    public static EntityManager getEntityManager() {
//        return emFactoryObj.createEntityManager();
//    }
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("student details");
//		
//		EntityManager entityMgr = getEntityManager();
//		
//		
//        entityMgr.getTransaction().begin();
//  Student s=new Student();
//  
// 
//  s.setId(1);
//  s.setName("Priyanka");
//  s.setId(2);
//  s.setName("sanika");
//
// 
//  entityMgr.persist(s);
//  
//  entityMgr.getTransaction().commit();
//  
//  entityMgr.clear();
//  System.out.println("Record Successfully Inserted In The Database");
//  
//
//	}
//
//}
//****************************************************************************************************



public class JPADemo {

	 public static void main(String args[]){
	    	JPACrudOpearation jp = new JPACrudOpearation();
	    //	jp.insertRecord();
	    //	jp.findEntity();
	    	//jp.deleteRecord();
	    	jp.updateRecord();
	    	
	    }
}
