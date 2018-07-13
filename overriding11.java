class square
{
int a = 3;
void area()
{
int area = a*a;
System.out.println(area);
}
}
class cube extends square
{
int a = 5;
void area()
{
int area = 6*a*a;
//super.area();
System.out.println(area);
}
} 
class overriding11
{
public static void
main(String ar[])
{
cube c = new
cube();
c.area();
}
} 