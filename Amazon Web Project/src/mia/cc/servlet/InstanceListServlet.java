package mia.cc.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mia.cc.control.CCInstanceSearch;
import mia.cc.models.CCInstance;

/**
 * Servlet implementation class InstanceListServlet
 */
@WebServlet("/InstanceListServlet")
public class InstanceListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InstanceListServlet() { }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CCInstanceSearch instanceSearch = new CCInstanceSearch();
		List<CCInstance> instances = instanceSearch.listInstance();
		
		String nextJSP = "/instance_list.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		
		request.setAttribute("instances", instances);
		dispatcher.forward(request,response);
	}

}
