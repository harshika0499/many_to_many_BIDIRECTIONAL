package manytomany_DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytomany_DTO.Doctor;
import manytomany_DTO.Patients;

public class DAO 
{
	
		public void insert(Doctor d) 
		{

			EntityManagerFactory emf=Persistence.createEntityManagerFactory("Bidirectional");
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
		 
			et.begin();
			em.persist(d);
			et.commit();
		}

		
		public void update(int id,Doctor d )
		{
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("Bidirectional");
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			et.begin();
			Doctor d1 = em.find(Doctor.class, id);
			d1.setId(id);
			d1.setName("rishi");
			d1.setP(d1.getP());
			em.merge(d1);
			et.commit();
			
		}
		
		public void fetch(int id) 
		{
			
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("Bidirectional");
			EntityManager em=emf.createEntityManager();
			Doctor d2 =   em.find(Doctor.class, id);
			System.out.println(d2);
			List<Patients> list = d2.getP();
			for (Patients p : list)
			{
				System.out.println(p);
			}
		}
		
		public void delete(int id)
		{
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("Bidirectional");
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			Doctor d3 =  em.find(Doctor.class, id);
			
			if (d3!=null) 
			{
				et.begin();
				em.remove(d3);
				et.commit();
			}
			else {
				System.out.println(" Invalid id ");
			}
			
		}
}


