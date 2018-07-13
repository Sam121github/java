import java.util.*;


class cs1q4{
	
static  String clist[][] = new String[6][6];
	
static  String FList[]=new String[5];
	
	
void inital(){
		
for(int i=0;i<=1;++i)
			
for(int j=0;j<6;j++)
			
clist[i][j]="ITA"+ (i+1) +"00" + (j+1);
	
		
for(int i=2,m=0;i<=3;++i,++m)
			
for(int j=0;j<6;++j)
			
clist[i][j]="ITE"+(m+1)+"00"+(j+1);

		
for(int i=4,m=0;i<=5;++i,m++)
			
for(int j=0;j<6;++j)
			
clist[i][j]="SWE"+(m+1)+"00"+(j+1);
	
}
	
	
		
	
public static void main(String Arg[]){
		
int len=Arg.length,l=0,flg=0;
		
cs1q4 obj = new cs1q4();
		
Random r=new Random();
		
obj.inital();
		
		
for(int i=0;i<=len-1; ++i){
			
for(int j=0 ;j<6;++j ){
				
for(int k=0;k<6;++k){
					
if( Arg[i].equals(obj.clist[j][k])){
						
obj.FList[l++]=Arg[i];
						
flg=1;
					
}
				
}
			
}
		
		
if(flg==0){
			
System.out.println("INVALID COURSE CODE !!!");
			
return ;
			
}
		
}

					
		
		
if(len<5){
			
int temp1 ;
			
for(int i=l;i<5;++i){
				
temp1=r.nextInt(35);
				
obj.FList[i] = obj.clist[temp1/6][temp1%6];
			
}
		
}

		
System.out.println("Avalable list of courses ");
		
for(int i=0;i<6;++i){
			
for(int j=0;j<6;++j)
			
System.out.print( "   "+ clist[i][j] );
		
System.out.println();
		}

		
System.out.println("Selected list of courses ");
		
for(int i=0;i<5;++i){
			
System.out.println(obj.FList[i]);
		
}


	
	
		
	
		
}	
	
	

}
