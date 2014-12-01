package fr.jju.iamwebproject.servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import fr.jju.iamwebproject.DAO.IdentityDAO;

/**
 * Servlet implementation class ServletSpringFramework
 */
@WebServlet("/ServletSpringFramework")
public class ServletSpringFramework extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private WebApplicationContext springContext;
	
	@Autowired
	protected
	IdentityDAO identityDAO;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSpringFramework() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		springContext = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
	       final AutowireCapableBeanFactory beanFactory = springContext.getAutowireCapableBeanFactory();
	       beanFactory.autowireBean(this);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
    

}
