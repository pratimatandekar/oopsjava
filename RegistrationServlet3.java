import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet3 extends HttpServlet {
   private Connection conn;
   private PreparedStatement ps;

   public void init() throws ServletException {
      ServletContext var1 = super.getServletContext();
      ServletConfig var2 = super.getServletConfig();
      String var3 = var1.getInitParameter("url");
      String var4 = var1.getInitParameter("dbuser");
      String var5 = var1.getInitParameter("dbpassword");
      String var6 = var2.getInitParameter("qry");

      try {
         this.conn = DriverManager.getConnection(var3, var4, var5);
         System.out.println("Conencted to the data base!");
         this.ps = this.conn.prepareStatement(var6);
         System.out.println("Query set succesfully!");
      } catch (SQLException var9) {
         ServletException var8 = new ServletException(var9.getMessage());
         throw var8;
      }
   }

   protected void doPost(HttpServletRequest var1, HttpServletResponse var2) throws ServletException, IOException {
      String var3 = var1.getParameter("userid");
      String var4 = var1.getParameter("password");
      String var5 = var1.getParameter("username");
      PrintWriter var6 = var2.getWriter();
      var2.setContentType("text/html");
      var6.println("<html><head><title>Registration Response</title></head>");
      var6.println("<body>");

      try {
         this.ps.setString(1, var3);
         this.ps.setString(2, var4);
         this.ps.setString(3, var5);
         int var7 = this.ps.executeUpdate();
         if (var7 == 1) {
            var6.println("<p> Thank u  <strong>" + var5 + "</strong> <br> for Registting with Us </p>");
            var6.println("<p><a href='signin.html'> You can now login</a> </p>");
         } else {
            var6.println("<p> Registration Faild Try Again </p> ");
            var6.println("<a href='signup.html'> Try Again");
         }
      } catch (SQLException var11) {
         var6.println("<p>Server is experencing heavy trafic . Please try Again </p> ");
         System.out.println("Exception in doPos" + var11);
      } finally {
         var6.println("</body>");
         var6.println("</html>");
      }

   }

   public void destroy() {
      try {
         this.conn.close();
      } catch (SQLException var2) {
         System.out.println("Exception indestroy" + var2);
      }

   }
}
