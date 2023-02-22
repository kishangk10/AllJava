package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Patientdao;

@WebServlet ("/update")
public class Update extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		String s1 = req.getParameter("pid");
		int id = Integer.parseInt(s1);
		String s2 = req.getParameter("phnum");
		long ph=Long.parseLong(s2);
		
		Patientdao patientdao=new Patientdao();
		patientdao.update(id, ph);
		resp.getWriter().print("<h1>The phone number is update </h1>");
	}
}
