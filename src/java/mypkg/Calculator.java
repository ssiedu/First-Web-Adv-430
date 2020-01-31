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
            out.println("Thanks For Visiting Us. ");
            out.println("Amount : "+amount);
            out.println("Time   : "+time);
            out.println("Interest Amount : "+interest);
            out.println("Net Amount : "+net);
            out.close();
    }
            
}
