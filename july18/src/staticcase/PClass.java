package staticcase;

public class PClass
{
	int c;
  static int a;
  static void m1()
  {
	  System.out.println("--PClass--");
	  System.out.println("The val a: "+a);
//	  System.out.println("The val c:"+c);
//	  Instance variables cannot be accessed by by static method. 
  }
  void m3()
  {
	  System.out.println("The method m3");
	  System.out.println("The val a:"+a);
	  System.out.println("The val c: "+c);
  }
  static
  {
	  System.out.println("--PClass static block--");
  }
}
