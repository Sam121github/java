import java.io.*;
import java.util.*;



class Employee{
int emp_code,phno;
String Emp_name,address;
 float da=0.10f;
 float hra=0.20f;
Scanner sc=new Scanner(System.in);


void accept(){
System.out.println("Enter the employee code");
emp_code=sc.nextInt();
System.out.println("Enter the phone number");
phno=sc.nextInt();
sc.nextLine();
System.out.println("Enter the employee name");
Emp_name=sc.nextLine();
sc.nextLine();
System.out.println("ADDRESS");
address=sc.nextLine();
}
void display(){
System.out.println("the employee code:"+emp_code);
System.out.println(" the phone number"+phno);

System.out.println("the employee name"+Emp_name);

System.out.println("ADDRESS"+address);

}
}

class manager extends Employee  {
float bp=0.0f;
Scanner sc=new Scanner(System.in);
void mdet(){


System.out.println("ENTER YOUR BASIC PAY");
bp=sc.nextFloat();
accept();
}

void dis(){
System.out.println(" manager details");
display();
System.out.println("BASIC PAY:"+bp);
System.out.println("DA:"+(bp*.10));
System.out.println("HRA:"+(bp*.20));


}
}

/*class officers extends Employee{
float bp=0.0f;
System.out.println("Enter the no.of officers");
int b=sc.nextInt();
System.out.println("Enter the basic pay of officer");
bp=sc.nextFloat();
}

class typist extends Employee{
float bp=0.0f;
System.out.println("Enter the no.of typist");
int b=sc.nextInt();
System.out.println("Enter the basic pay of typist");
bp=sc.nextFloat();
}
*/

class finale{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i,j;
manager[] obj1=new manager[100];
System.out.println("Enter the no.of MANAGER be specific");
int a=sc.nextInt();

for(i=0;i<a;i++)
{
obj1[i]=new manager();
obj1[i].mdet();
}
for(j=0;j<a;j++)
{
obj1[j].dis();
}
}
}