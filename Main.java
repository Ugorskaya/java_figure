package van;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
			//для дробей
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
			
			//для фигур
			System.out.println();
			System.out.println("Введите радиус круга: ");
			figure c= new circle(0, 0, sc.nextInt());
			System.out.println("Площадь = "+c.area()+"; Периметр = "+c.perimeter());
			System.out.println();
			
			System.out.println();
			System.out.println("Введите длину сторон прямоугольника: ");
			figure pr= new rect(0, 0, sc.nextInt(), sc.nextInt());
			System.out.println("Площадь = "+pr.area()+"; Периметр = "+pr.perimeter());
			System.out.println();
			
			System.out.println();
			System.out.println("Введите длину стороны квадрата: ");
			figure kv= new square(0, 0, sc.nextInt());
			System.out.println("Площадь = "+kv.area()+"; Периметр = "+kv.perimeter());
			System.out.println();
	}

}
