class NailCutterRunner
{
public static void main(String[] args)
{
NailCutter nail=new NailCutter();

nail.brand[2]="oo";
nail.price=60.0f;
 nail.length=8.0f;
 nail.noofblades=2;
nail.size=Size.SMALL;
nail.cutting();

NailCutter nail1=new NailCutter();

String index2=nail1.brand[1];
System.out.println(index2);
nail1.price=30.0f;
 nail1.length=16.0f;
 nail1.noofblades=3;
nail1.size=Size.MEDIUM;
nail1.cutting();


  NailCutter ref=new NailCutter();
  //ref.getname(pp);
  System.out.println(ref.brand[1]);
  System.out.println(ref.price=50.08f);
  
}

}