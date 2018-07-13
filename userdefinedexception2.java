import java.util.*;

class arrayException extends Exception{
arrayException(String s){
super(s);}}
class arraytest {
static void check(int n)throws arrayException{

if(n==0)
throw new arrayException("EMPTY ARRAY");
else if(n==10)
throw new arrayException("FULL ");
else
System.out.println("ENTER MORE");
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

int n,i;
System.out.println("Enter the vaue of n");
n=sc.nextInt();
int arr[]=new int[n];
try{
check(arr.length);}catch(Exception e){System.out.println(e);}
}
}