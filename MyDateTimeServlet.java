import java.io.*;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.ServletException;
public class MyDateTimeServlet extends HttpServlet
{
 protected void doGetq(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
 {
 resp.setContentType("text/html");
 PrintWriter pw = resp.getWriter();
 pw.println("<html>");
 pw.println("<head><title>Date Time Display</title>");
 pw.println("<style>h2 { color: red; }</style></head>");
 pw.println("<body>");
 pw.println("<p>Current date and time:</p>");
 Date today = new Date();
 pw.println("<h2>" + today + "</h2>");
 pw.println("</body>");
 pw.println("</html>");
 }
}
