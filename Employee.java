import java.util.Scanner;
class emp
{
	String name;
	int age;
	String phon;
	String address;
	double salary;
	emp(String n,int a,String p,String ad,double s)
	{
		name=n;
		age=a;
		phon=p;
		address=ad;
		salary=s;
	}
	void print_salary()
	{
		System.out.println("Salary of '"+name+"' is '"+salary+"'.");
	}
}
class Officer extends emp
{
String specialization;
Officer(String n,int a,String p,String ad,double s,String spec)
{
	super(n,a,p,ad,s);
	specialization=spec;
}
void displayOfficer()
{
	System.out.println("\nOfficer Name:"+name+"\nAge:"+age+"\nPhone:"+phon+"\nAddress:"+address+"\nSpecialization:"+specialization);
	print_salary();
}
}
class Manager extends emp
{
String department;
Manager(String n,int a,String p,String ad,double s,String dep)
{
	super(n,a,p,ad,s);
	department=dep;
}
void displayManager()
{
	System.out.println("\nManager Name:"+name+"\nAge:"+age+"\nPhone:"+phon+"\nAddress:"+address+"\nDepartment:"+department);
	print_salary();
}
}
public class Employee
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Manager Name : ");
		String n=sc.next();
		System.out.println("Enter the Manager Age : ");
		int a=sc.nextInt();
		System.out.println("Enter the Manager Phone Number : ");
		String p=sc.next();
		System.out.println("Enter the Manager Address : ");
		String ad=sc.next();
		System.out.println("Enter the Manager salary : ");
		double s=sc.nextDouble();
		System.out.println("Enter the Manager Department : ");
        String dep=sc.next();
        System.out.println("___________________________________________");
        System.out.println("\n");
		System.out.println("\nEnter the Officer Name : ");
		String n2=sc.next();
		System.out.println("Enter the Officer Age : ");
		int a2=sc.nextInt();
		System.out.println("Enter the Officer Phone Number : ");
		String p2=sc.next();
		System.out.println("Enter the Officer Address : ");
		String ad2=sc.next();
		System.out.println("Enter the Officer salary : ");
		double s2=sc.nextDouble();
		System.out.println("Enter the Officer specialization : ");
		String spec=sc.next();
		Manager M=new Manager(n,a,p,ad,s,dep);
		M.displayManager();
		Officer O=new Officer(n2,a2,p2,ad2,s2,spec);
		O.displayOfficer();
	}
}