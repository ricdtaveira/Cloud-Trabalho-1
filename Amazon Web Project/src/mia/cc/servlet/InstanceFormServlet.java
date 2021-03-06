package mia.cc.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mia.cc.control.CCImageSearch;
import mia.cc.models.CCImage;

/**
 * Servlet para o formulário de instâncias
 * @author Yvens
 *
 */
@WebServlet("/InstanceFormServlet")
public class InstanceFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public InstanceFormServlet() { }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CCImageSearch imageSearch = new CCImageSearch();
		List<CCImage> images = imageSearch.describeImages();
		
		String nextJSP = "/instance_form.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		
		request.setAttribute("images", images);
		dispatcher.forward(request,response);
	}

}
