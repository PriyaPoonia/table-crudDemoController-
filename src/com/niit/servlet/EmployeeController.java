package com.niit.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.niit.dao.EmployeeDAO;


import com.niit.daompl.EmployeeDAOImpl;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet(urlPatterns={"/EmployeeController.do"})  // multiple patterns

public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	EmployeeDAO employeeDAO = EmployeeDAOImpl.getEmployeeDAO();
	
	
	private static final String LIST_VIEW = "listEmployee.jsp"; 
	 	private static final String FORM_VIEW = "formEmployee.jsp";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// get the action
		String action = request.getParameter("action");
		String forward=null;
		if(action.equals("insert")||action.equals("edit"))
		{
		
			forward = FORM_VIEW;
		}
		
		else
			
			
			{
		
			forward =LIST_VIEW;
		}
		
		
		RequestDispatcher view= request.getRequestDispatcher(forward);
		  view.forward(request, response);
		
		response.getWriter().append("Served at: PRIYA").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
