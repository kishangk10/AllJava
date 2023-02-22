package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import dao.Undao;
import dto.UserName;

public class MClass extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String uN=req.getParameter("username");
		String pwd=req.getParameter("password");
		String pH=req.getParameter("phonenumber");
		long phNumber=Long.parseLong(pH);
		String email=req.getParameter("email");
		
		UserName userName=new UserName();
		userName.setUsername(uN);
		userName.setPassword(pwd);
		userName.setPhonenumber(phNumber);
		userName.setEmail(email);
		
		Undao undao=new Undao();
		undao.insert(userName);
	}

}
