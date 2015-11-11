package van;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Fraction a=new Fraction();
			Fraction b=new Fraction();
			
			a.n=1; a.d=5;
			b.n=2; b.d=3;
			System.out.println(a);
			System.out.println(b);
			System.out.println("a>a? "+a.equals(a));
			System.out.println("a>b? "+a.equals(b));
			System.out.println("b>a? "+b.equals(a));
			System.out.println(a+" + "+b+"="+a.plus(b));
			System.out.println(a+" - "+b+"="+a.minus(b));
			System.out.println(a+" / "+b+"="+a.del(b));
			System.out.println(a+" * "+b+"="+a.umn(b));
			

	}

}
