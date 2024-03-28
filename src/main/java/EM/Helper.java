package EM;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Helper {

	private static SessionFactory Sessionfectory = getSessionfectory();

	public static SessionFactory getSessionfectory() {
		try {
			Configuration con = new Configuration();
			return con.configure("hibernate.cfg.xml").buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed: " + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSession() {
		return Sessionfectory;
	}

	public static void teacherData(String firstName, String LastName, String Address, String Qualification,
			String Experience, String Age, String Gender, String Subject, String Contact, String Adhar,
			String RigesterationDate) {
		Session s = getSession().openSession();
		Transaction t = s.beginTransaction();
		Teachers T = new Teachers();
		T.setFirstName(firstName.trim());
		T.setLastName(LastName.trim());
		T.setAddress(Address.trim());
		T.setQualification(Qualification.trim());
		T.setExperience(Integer.parseInt(Experience.trim()));
		T.setAge(Integer.parseInt(Age.trim()));
		T.setGender(Gender.trim());
		T.setSubject(Subject.trim());
		T.setContact(Long.parseLong(Contact.trim()));
		T.setAdhar(Long.parseLong(Adhar.trim()));
		T.setRigesterationDate(RigesterationDate.trim());
		s.save(T);
		t.commit();
		s.close();
	}

	public static void studentData(String firstName, String LastName, String Address, String Standard, String Age,
			String Gender, String Contact, String Adhar, String EnrollDate) {

		Session s = getSession().openSession();
		Transaction t = s.beginTransaction();

		Students st = new Students();

		st.setFirstName(firstName.trim());
		st.setLastName(LastName.trim());
		st.setAddress(Address.trim());
		st.setStandard(Integer.parseInt(Standard.trim()));
		st.setAge(Integer.parseInt(Age.trim()));
		st.setGender(Gender.trim());
		st.setContact(Long.parseLong(Contact.trim()));
		st.setAdhar(Long.parseLong(Adhar.trim()));
		st.setEnrollDate(EnrollDate.trim());
		s.save(st);
		t.commit();
		s.close();

	}

	public static void update(String id,String fname, String lname, String add, String cl, String age, String gender,
			String adhar, String ph, String enDate) {
		
		Session s = getSession().openSession();
		Transaction t = s.beginTransaction();
		
		Students st = new Students();
        st.setId(Integer.parseInt(id.trim()));
		st.setFirstName(fname.trim());
		st.setLastName(lname.trim());
		st.setAddress(add.trim());
		st.setStandard(Integer.parseInt(cl.trim()));
		st.setAge(Integer.parseInt(age.trim()));
		st.setGender(gender.trim());
		st.setAdhar(Long.parseLong(adhar.trim()));
		st.setContact(Long.parseLong(ph.trim()));
		st.setEnrollDate(enDate.trim());
		 s.saveOrUpdate(st);
	        t.commit();
	    	s.close();
	}
	
	public static void teacherUpdate(String id ,String firstName, String LastName, String Address, String Qualification,
			String Experience, String Age, String Gender, String Subject, String Contact, String Adhar,
			String RigesterationDate) {
		Session s = getSession().openSession();
		Transaction t = s.beginTransaction();
		
		Teachers T = new Teachers();
		T.setId(Integer.parseInt(id.trim()));
		T.setFirstName(firstName.trim());
		T.setLastName(LastName.trim());
		T.setAddress(Address.trim());
		T.setQualification(Qualification.trim());
		T.setExperience(Integer.parseInt(Experience.trim()));
		T.setAge(Integer.parseInt(Age.trim()));
		T.setGender(Gender.trim());
		T.setSubject(Subject.trim());
		T.setContact(Long.parseLong(Contact.trim()));
		T.setAdhar(Long.parseLong(Adhar.trim()));
		T.setRigesterationDate(RigesterationDate.trim());
		 s.saveOrUpdate(T);
	        t.commit();
	    	s.close();
	}
	
	
	public static void employeeDate( String firstName,String LastName,String Address,String work,String email,String Age,String Gender, String Contact, String Adhar,
			String date) {
		Session s = getSession().openSession();
		Transaction t = s.beginTransaction();
		Employee e = new Employee();
		e.setFirstName(firstName.trim());
		e.setLastName(LastName.trim());
		e.setAddress(Address.trim());
		e.setWork(work.trim());
		e.setAge(Integer.parseInt(Age.trim()));
		e.setGender(Gender.trim());
		e.setEmail(email.trim());
		e.setContact(Long.parseLong(Contact.trim()));
		e.setAdhar(Long.parseLong(Adhar.trim()));
		e.setDate(date.trim());
		 s.save(e);
	        t.commit();
	    	s.close();
		
		
	}
	
	public static void employeeUpdate(String id, String firstName,String LastName,String Address,String work,String email,String Age,String Gender, String Contact, String Adhar,
			String date) {
		Session s = getSession().openSession();
		Transaction t = s.beginTransaction();
		Employee e = new Employee();
		
		e.setId(Integer.parseInt(id.trim()));
		e.setFirstName(firstName.trim());
		e.setLastName(LastName.trim());
		e.setAddress(Address.trim());
		e.setWork(work.trim());
		e.setAge(Integer.parseInt(Age.trim()));
		e.setGender(Gender.trim());
		e.setEmail(email.trim());
		e.setContact(Long.parseLong(Contact.trim()));
		e.setAdhar(Long.parseLong(Adhar.trim()));
		e.setDate(date.trim());
		 s.saveOrUpdate(e);
	        t.commit();
	    	s.close();
		
		
	}
}
