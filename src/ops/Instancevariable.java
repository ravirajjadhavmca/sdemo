package ops;

public class Instancevariable { 
	String name="priyanka";
	int id=1;
	int age=27;
	int a=10;
	int b=20;
	
	public static void main(String[] args) {
		Instancevariable test=new Instancevariable();
		System.out.println(test.name);
		System.out.println(test.id);
		System.out.println(test.age);
		test.m1();
		test.m2();
	}
		void m1(){
			System.out.println(a);
		}
		
		void m2(){
			System.out.println(b);
		}
		
	}
