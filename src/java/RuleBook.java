/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SSILABIST
 */
public class RuleBook extends HttpServlet {
 @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //we are setting a response header
        resp.setContentType("application/pdf");
        
        //read an excel file
        FileInputStream fis=new FileInputStream("E:\\bankdata\\checklist.pdf");
        int size=fis.available();
        byte b[]=new byte[size];
        fis.read(b);
        fis.close();
        //send the contents to client in response
        ServletOutputStream out=resp.getOutputStream();
        out.write(b);
        out.close();
    }

}
