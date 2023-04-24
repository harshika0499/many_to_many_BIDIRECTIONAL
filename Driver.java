package manytomany_CONTROLLER;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import manytomany_DAO.DAO;
import manytomany_DTO.Doctor;
import manytomany_DTO.Patients;

public class Driver 
{
		public static void main(String[] args) 
		{
			Patients p1 = new Patients();
			p1.setId(1);
			p1.setName("Riya");
			p1.setMobno(52112412);
			p1.setAddress("pune");
			
			Patients p2 = new Patients();
			p2.setId(2);
			p2.setName("mahi");
			p2.setMobno(98542248);
			p2.setAddress("mumbai");
			

			Doctor d1 = new Doctor();
			d1.setId(1);
			d1.setName("rishi");
			d1.setPhoneno(65554654);
			

			Doctor d2 = new Doctor();
			d2.setId(2);
			d2.setName("anmol");
			d2.setPhoneno(65478554);
			
			
			List<Patients> p = new ArrayList<Patients>();
			p.add(p1);
			p.add(p2);

			
			DAO  d3 = new DAO();
			
			d3.insert(d1);
			d3.insert(d2);
			d3.fetch(1);
			d3.delete(1);
			d3.update(1,d1);
			
			
		}


}
