package hello;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;
/**
 *
 * @author viter
 */
@WebServlet("/time")
public class HourServlet extends HttpServlet {

/**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {
   String msg = "";
   Calendar c = Calendar.getInstance();
    if (c.get(Calendar.HOUR_OF_DAY)< 13){ 
        String nome = request.getParameter("nome");

    if(nome==null)
        nome = "Fulano";
    
    msg = "Bom dia "+nome+"!";
}else{
    if (c.get(Calendar.HOUR_OF_DAY) > 13 && c.get(Calendar.HOUR_OF_DAY)<18 ){ 
        String nome = request.getParameter("nome");

    if(nome==null)
        nome = "Fulano";
    
    msg = "Boa tarde "+nome+"!";
    }else{
        String nome = request.getParameter("nome");

    if(nome==null)
        nome = "Fulano";
    
    msg = "Boa noite "+nome+"!";
    }
}
   

   response.setContentType("text/html;charset=UTF-8");
   try (PrintWriter out = response.getWriter()) {
       /* TODO output your page here. You may use following sample code. */
       out.println("<!DOCTYPE html>");
       out.println("<html>");
       out.println("<head>");
       out.println("<title>Servlet HelloServlet</title>");            
       out.println("</head>");
       out.println("<body>");
       out.println("<h1>Servlet HelloServlet</h1>");
       out.println("<p>" + msg + "</p>");
       out.println("</body>");
       out.println("</html>");
   }

}

/**
* Returns a short description of the servlet.
*
* @return a String containing servlet description
*/
@Override
public String getServletInfo() {
   return "Short description";
}// </editor-fold>

}