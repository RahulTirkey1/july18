package staticcase;

public class Inheritance {

	public static void main(String[] args)
	{
		CClass ob=new CClass();
		ob.a=12;
		ob.b=13;
		ob.c=14;
		ob.m1();
		ob.m2();
		ob.m3();
//		{		
//		System.out.println("PClass as reference");
//		PClass ob1=new CClass();
//		ob1.a=15;
//		ob1.b=16; this will show error
//		ob1.c=17;
//		ob1.m1();
//		ob1.m2(); this will show error
//		ob1.m3();		
//		}		
	}

}
