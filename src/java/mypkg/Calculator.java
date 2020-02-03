package mypkg;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet {
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //read-data-coming-with-request
            String s1=request.getParameter("amt");
            String s2=request.getParameter("tm");
        //process-data
            int amount=Integer.parseInt(s1);
            int time=Integer.parseInt(s2);
            int interest=(amount*time*10)/100;
            int net=amount+interest;
        //provide-proccessed-data-back-to-client(response)
            //PrintWriter is a stream used for sending text
            PrintWriter out=response.getWriter();
            //any thing we write on print writer goes to 
            //browser
            out.println("<html>");
            out.println("<body bgcolor=\"pink\">");
            out.println("<h3>Interest Details</h3>");
            out.println("<hr>");
            out.println("<table border=1>");
            out.println("<tr>");
            out.println("<td>Amount</td>");
            out.println("<td>"+amount+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Time</td>");
            out.println("<td>"+time+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Interest</td>");
            out.println("<td>"+interest+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>NetAmount</td>");
            out.println("<td>"+net+"</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("<hr>");
            out.println("<a href=index.jsp>Home</a>");
            out.println("<marquee>Attractive Interest Rates</marquee>");
            out.println("</body>");
            out.println("</html>");
            out.close();
    }
            
}
