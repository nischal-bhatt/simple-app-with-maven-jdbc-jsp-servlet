package com.telusko.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.telusko.web.dao.AlienDao;
import com.telusko.web.model.Alien;

public class GetAlienController extends HttpServlet{

	 protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	 {
		 String aid = req.getParameter("aid");
		 int aid1 = Integer.parseInt(aid);
		 
		
		 
		 
		 
		 AlienDao dao = new AlienDao();
		 
		 Alien a1 = dao.getAlien(aid1);
		 
		 HttpSession session = req.getSession();
		 
		 session.setAttribute("alien", a1);
		 
		 //req.setAttribute("alien", a1);
		 //RequestDispatcher rd = req.getRequestDispatcher("showAlien.jsp");
		 res.sendRedirect("showAlien.jsp");
		 
	 }
}
