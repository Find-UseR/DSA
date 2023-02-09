import java.sql.*;
import java.util.Scanner;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;


public class DBManager {

	Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
	
	
	
	
	Connection con;
	Statement stmt;
	
	public DBManager() throws SQLException{
		
		//REGISTER DRIVERS
		DriverManager.registerDriver(new SQLServerDriver());
	
		String url="jdbc:sqlserver://127.0.0.1;instanceName=SQLEXPRESS;databaseName=javajdbc;encrypt=true;trustServerCertificate=true;";
		con=DriverManager.getConnection(url,"sa","12345");
		stmt=con.createStatement();
		//System.out.println("Connected to SQL Server:");
	
}
public void insertUpdateDelete(String query) throws SQLException{
	
		stmt.execute(query);
	
}
public ResultSet select(String query) throws SQLException{
	
		ResultSet rs= stmt.executeQuery(query);
		return rs;
	
}

public void print() throws SQLException{
	String query="select * from TEST";
	boolean chk=false;
	
	stmt.executeQuery(query);
	ResultSet rs=stmt.executeQuery(query);
	
	while(rs.next())
	{
		String id=rs.getString(1);
		String name=rs.getString(2);
		String age=rs.getString(3);
		String section=rs.getString(4);
		if(id==null && name==null && age==null && section==null)
		{
			System.out.println("NO Data is Exist");
		}
		else
		{
System.out.println("***********************************************************************************************************");

System.out.println("ID: "+id+" NAME: "+name+" AGE: "+age+" SECTION: "+section);
		}
//System.out.println("***********************************************************************************************************");

		
		
		
	}
	
}

public void inputData()
{
	
	System.out.println("Enter ID: ");
	int id=sc.nextInt();
	
	System.out.println("Enter NAME: ");
	String name=sc1.nextLine();
	
	System.out.println("Enter AGE: ");
	int age=sc.nextInt();
	
	System.out.println("Enter SECTION: ");
	String section=sc1.nextLine();

	boolean chk=false;
	DBManager obj;
	try {
		String query="select * from student";
		stmt.executeQuery(query);
		ResultSet rs=stmt.executeQuery(query);
		
		while(rs.next())
		{
			String id2=rs.getString(1);
			int g= Integer.valueOf(id2);
			if(g==id)
			{
				chk=true;
				
			}
			}
		if(chk==true)
		{
			System.out.println("This ID is Already Exist!... Please Try Again To Enter Unique ID......");
		}
		else {
		obj = new DBManager();
		obj.insertUpdateDelete("insert into student(id,name,age,section) values ('"+id+"','"+name+"',19,'"+section+"')");
		System.out.println("ADD STUDENT SUCESSFULLY......");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}


public void update()
{
	try {
	boolean chk=false;
	String query="select * from student";
	
	System.out.println("Enter ID: ");
	int cid=sc.nextInt();
	
	
	
	
	stmt.executeQuery(query);
	ResultSet rs=stmt.executeQuery(query);
	
	while(rs.next())
	{
		String id=rs.getString(1);
		int g= Integer.valueOf(id);
		if(g==cid)
		{
			chk=true;
			
		}
		}
	
	if(chk==false)
	{
		
		System.out.println("This ID Not Exist In Data....");
	}
	else
	{
		System.out.println("Enter ID: ");
		int id=sc.nextInt();
		
		System.out.println("Enter NAME: ");
		String n=sc1.nextLine();
		
		System.out.println("Enter AGE: ");
		int age=sc.nextInt();
		
		System.out.println("Enter SECTION: ");
		String section=sc1.nextLine();
		
		DBManager obj = new DBManager();
		obj.insertUpdateDelete("Update student set id='"+id+"',name='"+n+"',age='"+age+"',section='"+section+"'");
		System.out.println("UPDATED STUDENT SUCESSFULLY......");
	}
		
	
	
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

public void delete()
{
	try {
		boolean chk=false;
		String query="select * from student";
		
		System.out.println("Enter ID: ");
		int cid=sc.nextInt();
		
		
		
		stmt.executeQuery(query);
		ResultSet rs=stmt.executeQuery(query);
		
		while(rs.next())
		{
			String id=rs.getString(1);
			int g= Integer.valueOf(id);
			if(g==cid)
			{
				chk=true;
				
			}
			}
		
		if(chk==false)
		{
			
			System.out.println("This ID Not Exist In Data....");
		}
		else
		{
			
			
			DBManager obj=new DBManager();
			obj.insertUpdateDelete("DELETE FROM student WHERE id='"+cid+"'");
			System.out.println("DELETED STUDENT SUCESSFULLY......");
		}
		
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


public void Menu()
{
	int opt=0;
	do {
	
	
System.out.println("Press 1 for Add Student Data: ");
System.out.println("Press 2 for Update Student Data: ");
System.out.println("Press 3 for Delete Student Data: ");
System.out.println("Press 4 for Display Student Data: ");
System.out.println("Press 5 for Exist: ");
opt=sc.nextInt();

if(opt==1)
{
	inputData();
}

else if(opt==2)
{
	update();
}

else if(opt==3)
{
delete();
}

else if(opt==4)
{
try {
	print();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}

else if(opt==5)
{

	System.out.println("Thanks For Using....");
	break;

}

else 
{
System.out.println("Wrong Input Was Entered Please TryAgain....");
}
	}while(opt!=5);

}

public static void main(String[] args) {

	DBManager obj;
	try {
		obj = new DBManager();
		obj.Menu();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	
	
	
}
	
	
	
	
}
