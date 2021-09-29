class Umbrella
{
String brand;
String color;
float price;
//cont is created
Umbrella()
{
System.out.println("no argument const is invoked");

}
//non static is invoked
void protection()
{
System.out.println("instance method is invoked");	
	this.getcolor("Purple");
	
	//System.out.println("static method is invoked by instance method");
	System.out.println(Umbrella.getcolor("Purple"));
	
}

static String getcolor(String col)
{
	System.out.println("Static method is invoked");
	return col;
}

static float getprice(int qunat,float price,float total)
{
	System.out.println(qunat);
	System.out.println(price);
	System.out.println(total);
	System.out.println("Price of umbrella is:");
	
	//float tot=qunat*price;
	//System.out.println(tot);
	return price;
}}

class UmbrellaRunner
{
public static void main(String[] rain)
{

Umbrella obj=new Umbrella();
obj.protection();//inatance method
String color="Black";
System.out.println(Umbrella.getcolor(color));
int qunat=2;
float cost=50.0f;
float tot=qunat*cost;
 float ref=Umbrella.getprice(qunat,cost,tot);
System.out.println(ref);
//System.out.println(total);


}
}

