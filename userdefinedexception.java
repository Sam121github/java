import java.util.*;

class VoterightException extends Exception{
VoterightException(String age){
super(age);}
}

class userdefinedexception {
static void check( int a) throws VoterightException{
if(a<18)
throw new VoterightException("Cannot vote");
else
System.out.println("YOU CAN VOTE");

}
public static void main(String args[]){
int n;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the value of n");
n=sc.nextInt();
try{
check(n);
}catch(Exception e){System.out.println(e);}
}
}








