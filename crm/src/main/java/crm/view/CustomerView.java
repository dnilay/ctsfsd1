package crm.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crm.model.Customer;

public class CustomerView extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Customer c=(Customer)request.getAttribute("SUCCESS");
		out.println("<table border='1'><tr><td>Customer ID</td><td>First Name</td><td>Last Name</td><td>Email</td></tr>");
		out.println("<tr><td>"+c.getUId()+"</td><td>"+c.getFirstName()+"</td><td>"+c.getLastName()+"</td><td>"+c.getEmail()+"</td></tr></table>");
	}

}
