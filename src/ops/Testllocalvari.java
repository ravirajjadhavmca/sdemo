package ops;

public class Testllocalvari {
	
	Testllocalvari(){
		int a=10;
		System.out.println(a);
	}
	Testllocalvari(int b){
		System.out.println(b);
	}
public static void main(String[] args) {
	Testllocalvari test=new Testllocalvari();
	Testllocalvari test1=new Testllocalvari(20);
	System.out.println(test);
			System.out.println(test1);
	
	}
}
	
