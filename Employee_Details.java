import java.util.Scanner;
class Employee
{
 String Name;
 int Id;
 int Age;
 double Basic_Salary;
 int Year;

 Employee( String Name,int Age,int Id,double Basic_Salary,int Year)
 {
   this.Name=Name;
   this.Id=Id;
   this.Age=Age;
   this.Basic_Salary=Basic_Salary;
   this.Year=Year;
}
Employee(Employee e)
{  this.Name=e.Name;
   this.Id=e.Id;
   this.Age=e.Age;
   this.Basic_Salary=e.Basic_Salary;
   this.Year=e.Year;
}


void Show_details()
{
Double Bonus,Net_Salary;
if(Basic_Salary>35000 && Year>5)
{
Bonus = (0.45*Basic_Salary);
}
else
{
Bonus = (0.25*Basic_Salary);
}
System.out.println("Name:"+Name);
System.out.println("Id:"+Id);
System.out.println("Age:"+Age);
System.out.println("Basic salary:"+Basic_Salary);
System.out.println("Year:"+Year);


System.out.println("Bonus:"+Bonus);
Net_Salary=(Bonus+Basic_Salary);
System.out.println("Netsalary:"+Net_Salary);
}
}
class Employee_Details
{
public static void main(String args[])
    { 
     Scanner sc =new Scanner (System.in);
        System.out.println("Enter the name of Employee:");
        String Name=sc.nextLine();
        System.out.println("Employee id:");
        int Id=sc.nextInt();
        System.out.println("Enter your age:");
        int Age=sc.nextInt();
        System.out.println("Basic Salary:");
        double Basic_Salary=sc.nextDouble();
        System.out.println("Year of service:");
        int Year=sc.nextInt();

        Employee Emp = new Employee(Name, Id, Age, Basic_Salary, Year);

        Emp.Show_details();

        Employee e = new Employee(Emp);

        

}
}

