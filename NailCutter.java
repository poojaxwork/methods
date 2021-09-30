class NailCutter
{
String[] brand={"Kaiv","GUBB","BELL"};
float price;
float length;
int noofblades;
Size size;

void cutting()
{
System.out.println("invoked cutting");
		System.out.println("NailCutter Details are:");
		System.out.println(brand[1]);
		System.out.println(price);
		System.out.println(length);
		System.out.println(noofblades);
		System.out.println(size);
		


}
  void nailart()

{  
System.out.println(brand[2]);
		System.out.println(price);
		System.out.println(length);
		System.out.println(noofblades);
		System.out.println(size);

}
  String getname(String[] brand)
  { 
  
	 //String[] pp;
	  return brand[1];
	  
  }
}