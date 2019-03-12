
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;



public class MyFilter implements Filter{
    @Override
    public void init(FilterConfig fc) throws ServletException{
        
    }
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException{
        PrintWriter out = res.getWriter();
        
        String password = req.getParameter("psw");
        
        if(password.equals("admin")){
            chain.doFilter(req,res);
        }
        else{
            out.println("username or password error!!");
            RequestDispatcher rd = req.getRequestDispatcher("/index.html");
            rd.include(req,res);
        }
    }


    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
