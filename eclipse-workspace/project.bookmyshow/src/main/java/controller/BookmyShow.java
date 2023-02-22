package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Booking_dto;

@WebServlet ("/data")
public class BookmyShow extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		String cname = req.getParameter("cname");
		String mname = req.getParameter("mname");
		String seats=req.getParameter("seats");
		String s3 = req.getParameter("tickets");
		int tickets=Integer.parseInt(s3);
		
		
		Booking_dto dto =new Booking_dto();
		dto.setcName(cname);
		dto.setmName(mname);
		dto.setSeatNo(seats);
		dto.setNo_of_Tickets(tickets);
		dto.setAmount(tickets*250);
		
	}
}
