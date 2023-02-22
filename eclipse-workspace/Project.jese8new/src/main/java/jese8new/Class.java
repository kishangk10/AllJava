package jese8new;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import dao.EmployeeDao;
import dto.Employee;

public class Class extends GenericServlet {
//	deploment descripter
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String s1 = req.getParameter("empId");
		int empId = Integer.parseInt(s1);
		String empName = req.getParameter("empName");

		Employee employee = new Employee();
		employee.setEmpId(empId);
		employee.setEmpName(empName);

		EmployeeDao employeeDao = new EmployeeDao();
		employeeDao.insert(employee);
	}

}
