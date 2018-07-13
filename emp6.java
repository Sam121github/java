class employee
{
float salary =0.0f;
int empid = 0;
String name;
employee(int id,float sal,String nm)
{
empid =id;
salary=sal;
name = nm;
}
employee(employee e)
{
salary = e.salary;
empid = e.empid;
name= e.name;
}
 
void putdata()
{
System.out.println(empid);
System.out.println(name);
System.out.println(salary);
}
}
class employee6
{
public static void main(String ar[])
{
employee e1= new
employee(1002,34.5f, "fghj");
employee e2 = new employee(e1);
e1.putdata();
e2.putdata();
}
} 