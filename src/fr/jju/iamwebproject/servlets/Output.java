package fr.jju.iamwebproject.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.jju.iamwebproject.Classes.Identity;

/**
 * Servlet implementation class Output
 */
@WebServlet("/Output")
public class Output extends ServletSpringFramework {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Output() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
        
		// Actual logic goes here.
	    //PrintWriter out = response.getWriter();
	    
	    List<Identity>contactList = new ArrayList<Identity>();
			
		contactList = identityDAO.displayAllRecords();
		
		request.getSession().setAttribute("contactList", contactList);
		getServletConfig().getServletContext().getRequestDispatcher("/contacts.jsp").forward(request,response);
		
	    

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
