package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/controllerlink")
public class LoginController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int qty=Integer.parseInt(req.getParameter("qty"));
		double price=Double.parseDouble(req.getParameter("price"));
		String membership=req.getParameter("membership");
		
	    Service s1=new Service();
	    
	    double originalAmt=s1.originalAmt(qty, price);
	    double finalAmt=s1.billCalculate(qty, price, membership);
	    
	    if(finalAmt>0) {
	    	req.setAttribute("originalAmt",originalAmt);
	    	req.setAttribute("finalAmt",finalAmt);
	    	req.setAttribute("membership",membership);
	    	RequestDispatcher rd=req.getRequestDispatcher("View.jsp");
	    	rd.forward(req, resp);
			
		}else {
			
			resp.sendRedirect("index.html");
		}
	}
}


