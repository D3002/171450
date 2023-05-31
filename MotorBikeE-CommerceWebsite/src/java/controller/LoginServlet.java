import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;	

	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	// From login.jsp, as a post method only the credentials are passed
	// Hence the parameters should match both in jsp and servlet and
	// then only values are retrieved properly
        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String emailId = request.getParameter("emailId");
		String password = request.getParameter("password");
		
		System.out.println("emailId.." + emailId);
		System.out.println("password.." + password);
		if (emailId != null && emailId.equalsIgnoreCase("admin@gmail.com") && password != null && password.equalsIgnoreCase("admin")) {
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("emailId", emailId);
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}else{
                     response.sendRedirect("loginHTML.html");
                }
	}
}
