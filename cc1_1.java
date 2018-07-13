//cc1

import java.io.*;
import java.util.*;


 class stddetails{


String name,rno,prgname,scname,proname;
float cgpa;

void accept(){
Scanner br=new Scanner(System.in);

System.out.println("enter your name");
name=br.nextLine();
br.nextLine();
System.out.println("enter your REgistration number");
rno=br.nextLine();
br.nextLine();
System.out.println("enter your programme name");
prgname=br.nextLine();
br.nextLine();
System.out.println("enter your school name");
scname=br.nextLine();
br.nextLine();
System.out.println("enter your proctor  name");
proname=br.nextLine();
br.nextLine();
System.out.println("enter your CGPA");
cgpa=Float.parseFloat(br.nextLine());
br.nextLine();
}

void display(){
System.out.println("NAme"+name);
System.out.println(" your REgistration number"+rno);

System.out.println("your programme name"+prgname);
System.out.println("your school name"+scname);
System.out.println(" your programme name"+proname);
System.out.println(" your CGPA"+cgpa);
}

}




class studis{


public static void main(String args[]) {
//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Scanner br=new Scanner (System.in);
System.out.println("HOW MANY STUDENT YOU WANT?");
int n=br.nextInt();



  stddetails[] ob= new stddetails[100];

for(int i=0;i<n;i++)
{
ob[i]=new stddetails();
ob[i].accept();

}
for(int j=0;j<n;j++){
ob[j].display();
}
}
}
