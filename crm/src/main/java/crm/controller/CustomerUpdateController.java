package crm.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crm.model.Customer;
import crm.service.CustomerService;
import crm.service.CustomerServiceImpl;

public class CustomerUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private CustomerService service;
   
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		service=new CustomerServiceImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		Customer customer=service.findBuyId(Integer.parseInt(request.getParameter("id")));
		customer.setFirstName(request.getParameter("fName"));
		customer.setLastName(request.getParameter("lName"));
		customer.setEmail(request.getParameter("email"));
		service.update(customer);
		RequestDispatcher view=request.getRequestDispatcher("homecontroller.do");
		view.forward(request, response);
	}

}
