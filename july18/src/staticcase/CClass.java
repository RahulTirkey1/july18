package staticcase;
public class CClass extends PClass 
{
 static int b;
 static void m2()
 {
	 System.out.println("--CClass--");
	 System.out.println("The value of b: "+b);
 }
 static
 {
	 System.out.println("--CClass static block--");
 }
}
