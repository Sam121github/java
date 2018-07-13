import java.io.*;

class MPL1{
int std,nos;int m=0;
  int []marks=new int[10];
int first;
 int mark[]=new int[5];
 int max=0; int c=0;
 int avg=0; int in=0;

MPL1(int s,int num)throws IOException{
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

std=s;int count=0,loop;
nos=num;
System.out.println("Enter the marks of each student");
for(int i=0;i<num;i++){
marks[i]=Integer.parseInt(br.readLine());
if(marks[i]>max){
max=marks[i];
}

avg+=marks[i];
}
for(loop=0;loop<4;loop++){
mark[loop]=findbestCase(max);
}
for(loop=0;loop<4;loop++){
  if(mark[loop]>mark[loop+1]){
int maxx=mark[loop];
++c;}
}

avg=avg/num;
System.out.println("AVERAGE::"+avg);
System.out.println("First marks among the class::"+max);
System.out.println("Standard with highest marks is::"+c);

}

 int findbestCase(int ac1){
int fmax=0;

if(fmax<ac1){
fmax=ac1;

}
return fmax;
}



public static void main(String args[])throws IOException{
int top=0,pos=0;
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
MPL1[] m=new MPL1[4];
for(int i=0;i<4;i++){
System.out.println("Enter std");
int ss=Integer.parseInt(br.readLine());
System.out.println("Enter number of student");
int noss=Integer.parseInt(br.readLine());
m[i]=new MPL1(ss,noss);
}
}
}
