package comm.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.model.League;

public class ListLeagueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<League> listLeague = null;

	@Override
	public void init() throws ServletException {
		listLeague = new ArrayList<League>();
		super.init();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		listLeague.add(new League(UUID.randomUUID().toString(), "Women's Cricket", "2020", "Spring"));
		listLeague.add(new League(UUID.randomUUID().toString(), "Base Ball", "2021", "Winter"));
		listLeague.add(new League(UUID.randomUUID().toString(), "Swimming", "2020", "Autumn"));
		listLeague.add(new League(UUID.randomUUID().toString(), "Beach Volley", "2020", "Summer"));
		listLeague.add(new League(UUID.randomUUID().toString(), "Rugby", "2020", "Summer"));
		out.println("<html><head><title>list league</title></head><body>");
		out.println("<table border='1'><tr><td>League ID</td><td>League Name</td><td>League Season</td><td>League Year</td></tr>");
		
		listLeague.forEach(league->{
			out.println("<tr><td>"+league.getLeagueId()+"</td><td>"+league.getLeagueName()
			+"</td><td>"+league.getLeagueSeason()+"</td><td>"+league.getLeagueYear()+"</td></tr>");
		});
		
		out.println("</table><body></html>");
		
		
	}

}
