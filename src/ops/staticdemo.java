package ops;

public class staticdemo {
 
	static int a=20;
	static int b=30;
	
	public static void main(String[] args) {
		System.out.println(staticdemo.a);
		System.out.println(staticdemo.b);
		staticdemo demo=new staticdemo();
		demo.m1();
	}
	public void m1(){
		System.out.println(staticdemo.a);
		System.out.println(staticdemo.b);
		
		
	}

}
