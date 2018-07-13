import java.io.*;
import java.util.*;



class marks{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int c,c1;
int t=0;;
int m=0;
int [] total=new int[10];
int[][] stu=new int[10][5];
for(int i=0;i<9;i++)

{


System.out.println("Enter the marks of student no:"+(i+1));
for(int j=0;j<5;j++){

System.out.println("enter the marks for subject no:"+(j+1));
stu[i][j]=sc.nextInt();
t=t+stu[i][j];

}
total[m]=total[m]+t;
m++;
}

for(int n=0;n<=9;n++)
{
System.out.println(" total marks of student:"+(n+1)+total[n]);}
//for(int j=0;j<5;j++){
//System.out.println(" the marks for subject no:"+(j+1));
//System.out.println(stu[i][j]+" ");
//}
//System.out.println(" ");
//}

}}