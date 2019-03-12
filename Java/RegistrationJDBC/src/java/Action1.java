import java.sql.*;

public class Action1 {

    public  static boolean method1(String em,String p,String pr) {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/16it152","16it152","root");
            String sql="INSERT INTO MYFORM (`email`, `password`, `Reapet_password`) VALUES (?,?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
//            Statement s = cn.createStatement();
            //int i = s.executeUpdate("INSERT INTO EMP VALUES (10, 'PAL')");
//            int i;
//            i = s.executeUpdate("INSERT INTO MYFORM (`email`, `password`, `Reapet_password`) VALUES (em,p,pr)");
            ps.setString(1, em);
            ps.setString(2,p);
            ps.setString(3,pr);
            int i = ps.executeUpdate();
            ps.close();
            cn.close();
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
        
    }
    
}
