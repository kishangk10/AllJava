package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import dao.StudentDao;
import dto.Student;

public class MClass extends GenericServlet  {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		String s1 = arg0.getParameter("stdid");
		int id= Integer.parseInt(s1);
		
		String s2 = arg0.getParameter("stdname");
		
		Student student=new Student();
		student.setStdid(id);
		student.setStdname(s2);
		
		
		
		StudentDao dao=new StudentDao();
		dao.insert(student);

	}

}
