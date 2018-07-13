import java.util.*;



class cs1q1{

String regno,name,prgname,sname,pname;
float cgpa=0.0f;



void accept(){
Scanner sc=new Scanner(System.in);
System.out.println("ENTER REGISTRATIN NUMBER");
regno=sc.nextLine();
sc.nextLine();


System.out.println("ENTER NAME OF THE STUDENTS");
name=sc.nextLine();
sc.nextLine();

System.out.println("ENTER CGPA");
cgpa=sc.nextFloat();
sc.nextLine();

System.out.println("ENTER PROGRAMME NAME");
prgname=sc.nextLine();
sc.nextLine();

System.out.println("ENTER SCHOOL NAME");
sname=sc.nextLine();
sc.nextLine();

System.out.println("ENTER PROCTOR NAME");
pname=sc.nextLine();
sc.nextLine();

}

void display(){
System.out.println(" REGISTRATIN NUMBER::"+regno);
System.out.println(" STUDENT NAME::"+name);
System.out.println(" CGPA::"+cgpa);
System.out.println(" PROGRAMME NAME"+prgname);
System.out.println(" SCHOOL NAME"+sname);
System.out.println(" PROCTOR NAME"+pname);

}

public static void main(String args[]){
int i;
Scanner ss =new Scanner(System.in);
System.out.println("Enter the number of students");
int n=ss.nextInt();

cs1q1 [] obj=new cs1q1[n];
for( i=0;i<n;i++){
obj[i]=new cs1q1();

}

for(i=0;i<n;i++){
obj[i].accept();

}
System.out.println("FINAL DEtails");
for(i=0;i<n;i++){
//obj[i].accept();

obj[i].display();
System.out.println("\n");
}
}}



