package studio7;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction(int initn, int initd) {
		numerator = initn;
		denominator = initd;
	}
	
	public Fraction() { //assigns these values if you don't give it anything
		numerator = 1;
		denominator = 2;
	}
	
	public String createFraction() {
		return numerator + "/" + denominator;
	}
	
	public static String addFraction(int n1, int d1, int n2, int d2) {
		if (d1==d2) {
			return (n1+n2) + "/" + d1;
		}
		else {
		int commond = d1*d2;	
		
		return (n1*d2)+(n2*d1) + "/" + commond;
		}
	}
	
	public static String multiplyFraction(int n1, int d1, int n2, int d2) {
		return (n1*n2) + "/" + (d1*d2);
	}
	
	public static String reciprocal(int n, int d) {
		return d + "/" + n;
	}
	
	public static String simplify(int n, int d) {
		if (d%n == 0) {
			int newd = d/n;
			int newn = 1;
			return newn + "/" + newd;
		}
		else {
			return n + "/" + d;
		}
	}
	
	public static void main(String[] args) {
		Fraction jeff = new Fraction(2,4);
		System.out.println("Jeff: " + jeff.createFraction());
		System.out.println("NegaJeff: " + reciprocal(jeff.numerator, jeff.denominator));
		System.out.println("BetterJeff: " + simplify(jeff.numerator,jeff.denominator));
		Fraction craig = new Fraction();
		System.out.println("Craig: " + craig.createFraction());
		System.out.println("NegaCraig: " + reciprocal(craig.numerator, craig.denominator));
		
		System.out.println("Jeff + Craig = " + addFraction(jeff.numerator, jeff.denominator, craig.numerator, craig.denominator));
		System.out.println("Jeff * Craig = " + multiplyFraction(jeff.numerator, jeff.denominator, craig.numerator, craig.denominator));
	}
	

}
