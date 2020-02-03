import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Rates extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("application/vnd.ms-excel");
        
        //read an excel file
        FileInputStream fis=new FileInputStream("E:\\bankdata\\Rates.xlsx");
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
