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

nail1.brand[2]="pp";/*y dont we access it by direct index value(nail1.brand[2])by 
 not assigning value to array */
nail1.price=30.0f;
 nail1.length=16.0f;
 nail1.noofblades=3;
nail1.size=Size.SMALL;
nail1.cutting();

String[] pp={"xyz","abc"};
  NailCutter ref=new NailCutter();
  ref.getname(pp);//how to access above array in this instance
  System.out.println(ref.brand[1]);
  System.out.println(ref.price=50.08f);
  //System.out.println(pp[0]);
}

}