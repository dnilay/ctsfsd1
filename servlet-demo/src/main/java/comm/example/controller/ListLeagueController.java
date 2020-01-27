package comm.example.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListLeagueController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StringBuffer data;
	
   
	@Override
	public void init() throws ServletException {
		
		super.init();
		data=new StringBuffer();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		data.append(request.getParameter("title").toString());
		data.append(request.getParameter("season").toString());
		data.append(request.getParameter("year").toString());
		out.println(data);
		
	}

}
