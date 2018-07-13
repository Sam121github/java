import java.util.*; 
class cs1q5{
	
static int reverse(int num){
		
int temp=num%10;
		
num=num/10;
		
String temp1=""+temp;
		
temp1+=num;
		
num=Integer.parseInt(temp1);
		
return num;
	
}

	
int shift(int num){
		
int sum=0,temp=0;
		
while(num!=0){
			
temp=num%100;
			
sum+=temp;
			
num=num/100;
		
}

		
if(sum>99){
			
temp=sum%100;
		
}

		
return temp;
	
}   

	
public static void main(String arg[]){
		
Scanner s = new Scanner(System.in);
		
cs1q5 obj =new cs1q5();
		
System.out.print("Enter data : ");
		
int num = s.nextInt();
		
num=obj.reverse(num);
		
System.out.println("Number after rotaion : " +num);
		
num= obj.shift(num);
		
if(num<10)
			
System.out.println("Number after shift   : 0" +  num  );

else
			
System.out.println("Number after shift   : " +  num  );




}

}