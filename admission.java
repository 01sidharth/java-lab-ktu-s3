import java.sql.*; 
import java.util.Scanner;
public class admission {
	public static void main(String args[]) {
		Connection conn = null;
		Statement stmt = null; 		
		String name,branch,phone;
		int Ad_no; float mark;
		Scanner sc = new Scanner(System.in);
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connecting to database..."); 
			conn = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=root");
			System.out.println("Creating database..."); 
			stmt = conn.createStatement(); 
			String s = "CREATE DATABASE Admission"; 
			stmt.executeUpdate(s);
			System.out.println("Creating Table");
			s = "USE Admission";
			stmt.executeUpdate(s);
			s="CREATE TABLE Students (Name VARCHAR(20) ,Ad_No INTEGER not NULL , Branch VARCHAR(5), Phone VARCHAR(10), Percentage FLOAT not NULL, PRIMARY KEY (Ad_no))"; 
			stmt.executeUpdate(s);
			System.out.println("Insert records into the table...");
			for(int i=0;i<5;i++)
            {
				System.out.print("Student name: "); name=sc.next();
				System.out.print("Admmision number : "); Ad_no=sc.nextInt();
                System.out.print("Branch : "); branch=sc.next();
                System.out.print("Ph num : "); phone=sc.next();
                System.out.print("Mark % : "); mark=sc.nextFloat();
                s="insert into Students values(\'"+name+"\',"+Ad_no+",\'"+branch+"\',\'"+phone+"\',"+mark+")";
                stmt.executeUpdate(s);
            }
			System.out.println("Selecting records with mark > 80%");
			s= "SELECT * FROM Students WHERE Percentage>80";
			ResultSet r = stmt.executeQuery(s);
			while(r.next()) {
				name = r.getString("Name"); 
				Ad_no= r.getInt("Ad_no");
				branch = r.getString("Branch");
				phone = r.getString("Phone");
				mark = r.getFloat("Percentage");
				System.out.println("Name: " + name + "| Admission number: " + Ad_no + "| Branch: " + branch + "| Phone number : " + phone + "| Mark % : " + mark);
				}
			System.out.println("Selecting record with branch is cse");
			s = "SELECT * FROM Students WHERE Branch = 'CSE' "; 
			stmt.executeQuery(s);
			r = stmt.executeQuery(s);
			while(r.next()) {
				name = r.getString("Name"); 
				Ad_no= r.getInt("Ad_no");
				branch = r.getString("Branch");
				phone = r.getString("Phone");
				mark = r.getFloat("Percentage");
				System.out.println("Name: " + name + "| Admission number: " + Ad_no + "| Branch: " + branch + "| Phone number : " + phone + "| Mark % : " + mark);
				} 

			System.out.println("Deleting records with mark < 40%");
			s="DELETE FROM Students WHERE Percentage<40"; 
			stmt.executeUpdate(s);
			s= "SELECT * FROM Students"; 
			r = stmt.executeQuery(s);
			while(r.next()) {
				name = r.getString("Name"); 
				Ad_no= r.getInt("Ad_no");
				branch = r.getString("Branch");
				phone = r.getString("Phone");
				mark = r.getFloat("Percentage");
				System.out.println("Name: " + name + "| Admission number: " + Ad_no + "| Branch: " + branch + "| Phone number : " + phone + "| Mark % : " + mark);
				} 
			}
		catch (ClassNotFoundException e) { 
			System.out.println("Driver not found!"); 
			e.printStackTrace( );
			return; 
			}
		catch (SQLException e) { 
			System.out.println("Connection Failed!");
			e.printStackTrace(); 
			return;
		}
	}
}