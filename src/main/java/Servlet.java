import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", urlPatterns = "/linkday123")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pr = response.getWriter();
        String username = request.getParameter("use");
        int password = Integer.parseInt(request.getParameter("pass"));
        if(username.equals("admin")&&password==12345){
            RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
            rd.forward(request,response);
        }else {
            RequestDispatcher rd=request.getRequestDispatcher("baitap.jsp");
            rd.forward(request,response);
//           điều hướng đến link cần chuyển đến
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
