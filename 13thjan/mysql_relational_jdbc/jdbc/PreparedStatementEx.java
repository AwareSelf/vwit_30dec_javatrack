package jdbc;
import java.sql.*;
import java.util.Scanner;

public class  PreparedStatementEx
{


	public static void main(String[] args) 
	{
		Connection con=null;
		Statement stat=null;
		String s;
		try
		{
		// Class.forName("oracle.jdbc.driver.OracleDriver");
		
	     // con=DriverManager.getConnection("jdbc:oracle:oci8:@oracle9i","scott","tiger");

		//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@saraswati:1521:oracle9i","scott","tiger");
		
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mydb1?useSSL=false","root","namrata");
		
	
		System.out.println("The connection is successful.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		


        try
		{
		 stat=con.createStatement();
		 s="create table student1(Rollno int,Name varchar(50),serName varchar(50))";
         stat.executeUpdate(s);
		}
		catch(SQLException e)
		{   
			e.printStackTrace();
		}
		

         try
		{
 		 s="insert into student1 values(?,?,?)";	
		 PreparedStatement stat1=con.prepareStatement(s);
         stat1.setInt(1,1);
		 stat1.setString(2,"Namrata");
		 stat1.setString(3,"Marathe");
         int no=stat1.executeUpdate();
		 System.out.println("no of rows inserted:"+no);
		 stat1.setInt(1,2);
		 stat1.setString(2,"Rahul");
		 stat1.setString(3,"Marathe");
         no=stat1.executeUpdate();
		 System.out.println("no of rows inserted:"+no);


		}
		catch(SQLException e)
		{   
			e.printStackTrace();
		}
		


        try
		{
		  stat.close();
		}
		catch(SQLException e)
		{
		  e.printStackTrace();
		}

		System.out.println("create is successful:");

		try
		{

			String str = "update student1 set name=? where rollno=?";
		    PreparedStatement pst = con.prepareStatement(str);
            Scanner sc = new Scanner(System.in);

		   System.out.println("Enter rollno:");
			int rollno = sc.nextInt();

			System.out.println("Enter name:");
			String name = sc.next();

			pst.setString(1,name);
			pst.setInt(2,rollno);

            int count = pst.executeUpdate();
           System.out.println("no of rows updated.."+count);

		}
		catch(Exception e) {
			e.printStackTrace();
		}





        try
		{
		 stat=con.createStatement();
         s= "select * from student1";
		ResultSet rset=stat.executeQuery(s);
		
		while(rset.next())
			System.out.println(rset.getInt(1)+" "+rset.getString(2)+"    "+rset.getString(3));
		}
		catch(SQLException e)
		{   
			e.printStackTrace();
		}
		
        try
		{
		  stat.close();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}


	}
}
