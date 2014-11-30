package fr.jju.iamwebproject.servlets;

import java.io.IOException;
import java.io.PipedOutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Output
 */
@WebServlet("/Output")
public class Output extends HttpServlet {
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
	    PrintWriter out = response.getWriter();
	    out.println("<h1>OH HAI</h1>");
	    
	    List<String>contactList = new ArrayList<String>();
	    
	    try {
			
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			
			Connection connection = DriverManager.getConnection("jdbc:derby:/Users/Suiz/Documents/Java/workspace/IAMWebProject/IAMWebFresh;create=true");
			
			PreparedStatement pstmt = connection.prepareStatement("select * from IDENTITIES");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String firstname = rs.getString(2);
				String lastname = rs.getString(3);
				
				contactList.add(lastname + ", " + firstname);
				
			}
			request.getSession().setAttribute("contactList", contactList);
			getServletConfig().getServletContext().getRequestDispatcher("/contacts.jsp").forward(request,response);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();

		    out.println("<h1>YEAH no...</h1>");
		}
	    

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
