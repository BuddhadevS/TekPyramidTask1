package Controller;

import java.util.Arrays;

import Dao.StudentDao;
import Dto.Student;

public class StudentController {
	public static void main(String[] args) {
		Student student2 = new Student();
		student2.setId(11);
		student2.setName("Sita");
		student2.setDomain("Medial");
		student2.setPhno(834567);

		Student student3 = new Student();
		student3.setId(12);
		student3.setName("Arabinda");
		student3.setDomain("Student");
		student3.setPhno(7004567);

		Student student4 = new Student();
		student4.setId(13);
		student4.setName("Arnab");
		student4.setDomain("Hr");
		student4.setPhno(9523467);

		Student student5 = new Student();
		student5.setId(14);
		student5.setName("Kalu");
		student5.setDomain("Management");
		student5.setPhno(834567);
		
		
		Student student = new Student();
		student.setId(16);
		student.setName("Rahul");
		student.setDomain("Management");
		student.setPhno(834567);
		
		

		StudentDao dao = new StudentDao();
		
		dao.save(student);
		
		
		
		
//        dao.saveAll(Arrays.asList(student2, student3, student4,student5));

//for the update element
		
		
		
//		Student s = new Student();
//		s.setId(13);
//
//		s.setName("Indrajit sahu");
//		s.setDomain("Navy");
//		s.setPhno(95563467);

		//dao.update(s);
		
		
		
		//for delete by id
		//dao.DeleteById(12);

		
		
		//for feth by id
		//dao.fethById(13);
	}

}
