import java.io.*;



class vector{
float x,y,z;



void vector(){
this(1,1,1);
}
vector(float a,float b){
x=a;
y=b;
z=1.0f;


}

 vector()throws IOException
{
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the value for x");
this.x=Float.parseFloat(br.readLine());
System.out.println("Enter the value for y");
this.y=Float.parseFloat(br.readLine());
System.out.println("Enter the value for z");
this.z=Float.parseFloat(br.readLine());

}

public static void main(String args[])throws IOException{




}
}