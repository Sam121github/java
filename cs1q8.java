import java.util.*;

class mpl
{
	
int standard,first_mark,noStudent;
	
int mark[];
	
Scanner s =new Scanner(System.in);
	
mpl(int stnd,int noStd){
		
standard=stnd;
		
noStudent=noStd;
		
first_mark=0;
		
mark=new int[noStd];
		
for (int i=0;i<noStd ;++i ){
			
System.out.print("Enter student "+(i+1)+" marks ");
			
mark[i]=s.nextInt();
			
if(mark[i]>first_mark) 
				
first_mark=mark[i];
		
}
	
}

	
void findBestClass(mpl obj[]){
		
int len=obj.length ,big=0 ,Bclass=0;
		
for (int i=0;i<len ;++i ) {
			
if(obj[i].first_mark>big){
				
big=obj[i].first_mark;
				
Bclass=obj[i].standard;
			
}
		 
		
}
	
System.out.println("Class "+Bclass+" has highest marks of "+big);
	
}

	
void findBestClass(mpl obj[],int len){
		
int avg=0,sum=0,gavg=0,alen=0,clas=0 ,bclas=0;
		
for (int i=0;i<len ;++i ) {
			
alen=obj[i].mark.length;
		 	
clas=obj[i].standard;
		 	
for (int j=0;j<alen ;++j )
		 		
sum=obj[i].mark[j];
		 	
		 	
avg=sum/alen;
		 	
if(avg>gavg){
		 		
gavg=avg;
		 		
bclas=clas;
		 	
}
		
}
		
System.out.println("Class "+ bclas +" has highest average of "+gavg);

	
}

	

}

class cs1q8{
		
public static void main(String arg[]){
		
Scanner s =new Scanner(System.in);
		
mpl obj[]=new mpl[4];
		
		
for (int i=0;i<4 ;++i ) {
			
			
System.out.print("\nEnter class Standard ");
			
int std=s.nextInt();
			
System.out.print("Enter class strength ");
			
int cls=s.nextInt();
			
obj[i]=new mpl(std,cls);
			
		
}

		
obj[0].findBestClass(obj);
		
obj[0].findBestClass(obj,4);



		


	
}

}