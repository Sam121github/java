import java.util.*;




class testDetails{
	
float marks[][]=new float [25][7];
	
void storeMarks(float m[][]){
		
int row=m.length,col=0;
		
		
for(int i=0;i<row;++i){
			
col=m[i].length;
			
for (int j=0;j<col ;++j ) {
				
marks[i][j]=m[i][j];
			
}
		
}
	
}

	
void displayMarks(){
		
int row=marks.length,col=0;
		
for(int i=0;i<row;++i){
			
col=marks[i].length;
			
System.out.println("\nStudent Id : "+(i+1) );
			
for (int j=0;j<col ;++j ) {
				
if(marks[i][j]== -1.0f)
					
break;
				
System.out.println("Marks of test "+ (j+1) +" : "  + marks[i][j]);
			
}
		
}
	
}


}

class NoticePeriod extends testDetails{
	
int temp1=0,temp2=0;
	
	
void show(){
		
System.out.println("\nStudents having less than three exam ");
		
for (int i=0; i<25; ++i){
			
for (int j=0;j<=2 ; ++j){
				
if(marks[i][j]== -1.0f ){
					
System.out.println("Student Id : "+(1+i)+ " gives "+( j)+" exams.");
					break;
				
}
			
}
		
}


		
System.out.println("\nStudents having less than 50 marks exam in at least 3 exam ");
		
for (int i=0; i<25; ++i){
			
temp1=temp2=0;
				
for (int j=0;j<7 ; ++j){
					
if(marks[i][j]== -1.0f ) 
						
break;
					
					if(temp1>=3)	
						
break;

					
if(marks[i][j] > 50  ) 	
						
++temp1;
				
}

			
if(!(temp1>=3))
				
System.out.println("Student Id : "+(1+i)+ " has not scored more than 50 marks in at least 3 exams.");
			
}
	
}

}




class cs1q9{
	
public static void main(String arg[]){
		
NoticePeriod obj=new NoticePeriod();
		
Scanner s=new Scanner(System.in);
		
int  col=0;
		
float smarks[][]=new float[25][7];

		
for(int i=0;i<smarks.length;++i){
			
System.out.print("Enter Details of student : "+(i+1)+"\nTotal exams : ");
			col=s.nextInt();
			
if(col==0){
				
smarks[i][col] = -1.0f;
				
continue;
			
}
			
for (int j=0;;++j ) {
				
System.out.print("Marks of exam "+(1+j)+" : " );
				
smarks[i][j]=s.nextFloat();
				
if(j==(col-1)){
					
smarks[i][col] = -1.0f;
					
break;
				
}
			
}
		
}
		
		
obj.storeMarks(smarks);
		
obj.displayMarks();
		
obj.show();
	
}

}