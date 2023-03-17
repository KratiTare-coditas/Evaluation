package Evaluation6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

import static java.lang.System.*;

public class Operations {
    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
BufferedReader sc=new BufferedReader((new InputStreamReader(System.in)));
public void retrive() throws ClassNotFoundException, SQLException, IOException {
    Class.forName("com.mysql.jdbc.Driver");
    con= DriverManager.getConnection("jdbc:mysql://localhost:3306/eltp_jan_23","root","Jaishreeram@05");
    boolean flag=true;
    while(true)
    {
        out.println("0 for exit");
        System.out.println("Choose 1 for Student:");
        System.out.println("Choose 2 for Teacher");
        System.out.println("Enter ur choice:");
        int ch1 = Integer.parseInt(sc.readLine());
        switch (ch1)
        {
            case 0:
                flag=false;
                System.exit(0);
                break;
            case 1:
                ps=con.prepareStatement("select * from student1");
                rs=ps.executeQuery();
                if(rs.next())
                {
                    out.println("ID:------"+rs.getInt(1));
                    out.println("SUBJECT-----"+rs.getString(2));
                    out.println("NAME------"+rs.getString(3));
                    out.println("CITY------"+rs.getString(4));
                    out.println("Marks-------"+rs.getInt(5));
                }
            case 2:
                ps=con.prepareStatement("select * from teacher1");
                rs=ps.executeQuery();
                out.println("TID:------"+rs.getInt(1));
                out.println("TSUBJECT-----"+rs.getString(2));
                out.println("TNAME------"+rs.getString(3));
                out.println("TCITY------"+rs.getString(4));
                out.println("salary-------"+rs.getInt(5));
                out.println("EXP------"+rs.getInt(6));
        }
    }

    /*String sql="select * from student1";
    System.out.println("Enter id");
    int id=Integer.parseInt(sc.readLine());
   rs=ps.executeQuery();*/

}
    public void insert() throws SQLException, ClassNotFoundException, IOException {
        Class.forName("com.mysql.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/eltp_jan_23","root","Jaishreeram@05");
  boolean flag1=true;
  while(true) {
      out.println("0 to exit");
      System.out.println("Choose 1 for Student:");
      System.out.println("Choose 2 for Teacher");
      System.out.println("Enter ur choice:");

      int ch1 = Integer.parseInt(sc.readLine());
      switch (ch1) {
          case 0:
              System.exit(0);
          case 1:
          System.out.println("Enter name:");
          int id = Integer.parseInt(sc.readLine());
          ps = con.prepareStatement("insert into student1 values(?,?,?,?,?)");
          System.out.println("Enter subject:");
          String subject = sc.readLine();
          System.out.println("Enter name:");
          String name = sc.readLine();
          System.out.println("Enter city");
          String city = sc.readLine();
          System.out.println("Enter marks:");
          int marks = Integer.parseInt(sc.readLine());

          ps.setInt(1, id);
          ps.setString(2, subject);
          ps.setString(3, name);
          ps.setString(4, city);
          ps.setInt(5, marks);
          ps.executeUpdate();
        break;
          case 2:
              System.out.println("Enter tid:");
              int tid=Integer.parseInt(sc.readLine());
              out.println("Enter subject");
              String tsubject=sc.readLine();
              out.println("Enter name:");
              String tname=sc.readLine();
              out.println("Enter city");
              String tcity=sc.readLine();
              out.println("Enter salary");
              int salary=Integer.parseInt(sc.readLine());
              out.println("Enter exp");
              int exp=Integer.parseInt(sc.readLine());
              out.println("Enter sid:");
              int sid=Integer.parseInt(sc.readLine());
              ps.setInt(1, tid);
              ps.setString(2, tsubject);
              ps.setString(3, tname);
              ps.setString(4, tcity);
              ps.setInt(5, salary);
              ps.setInt(6,exp);
              ps.setInt(7,sid);
              ps.executeUpdate();


      }
  }
    }
    public void update() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/eltp_jan_23","root","Jaishreeram@05");
      ps=con.prepareStatement("update student1 set marks=99 where id=1");
      ps.executeUpdate();

    }
    public void findstu() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/eltp_jan_23","root","Jaishreeram@05");
        ps=con.prepareStatement("select name from student1 where name like 'z%'");
        rs=ps.executeQuery();

        out.println("NAME------"+rs.getString(3));

    }
   public void findteacher() throws ClassNotFoundException, SQLException {
       Class.forName("com.mysql.jdbc.Driver");
       con= DriverManager.getConnection("jdbc:mysql://localhost:3306/eltp_jan_23","root","Jaishreeram@05");
       ps=con.prepareStatement("select tname from teacher1 where exp>=5");
       ps.execute();


   }

}
