package van;

import java.util.Scanner;
class Fraction {
	int n,d;
	
	
	public String toString()
	{
		return n+"/"+d;	
	}
	public boolean equals(Fraction b)
	{
		if(n>b.n && d<b.d){
		return true;}
		return false;
	}
	public String plus(Fraction b)
	{
		int k1=n*b.d;
		int k2=b.n*d;
		int l=b.d*d; 
		k1+=k2;
		return k1+"/"+l;
	}	
}

public class zz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Fraction a=new Fraction();
		Fraction b=new Fraction();
		
		a.n=sc.nextInt(); a.d=sc.nextInt();
		b.n=sc.nextInt(); b.d=sc.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+" + "+b+"="+a.plus(b));

	}

}
