package ops;

public class SIDemo {
	
	int a=10;
	int b=20;
	static int c=30;
	static int d=40;
	void m1(){
	System.out.println(a);
	System.out.println(b);
	//System.out.println(SIDemo.c);
//	System.out.println(SIDemo.d);
	SIDemo si =new SIDemo();
	System.out.println(si.c);
		System.out.println(si.d);
	}
	static void m2(){
		SIDemo si=new SIDemo();
		System.out.println(si.a);
		System.out.println(si.b);
		System.out.println(SIDemo.c);
		System.out.println(SIDemo.d);
		
	}

	public static void main(String[] args) {
		SIDemo ti=new SIDemo();
		ti.m1();
		SIDemo.m2();
		
	}

}
