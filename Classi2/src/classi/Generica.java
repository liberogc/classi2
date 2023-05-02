package classi;

public class Generica {
	 private int a;
	 private int b;
	
	public void somma() {
		b=10;
		a=100;
		System.out.println("somma "+(a+b));
	}
	
	public void somma2() {
		int b= 100;
		System.out.println("somma2 "+(a+b));
	}
	
	public void somma3() {
		somma2();
		a=10;
		b=20;
		System.out.println(a+b);
	}
	
}
