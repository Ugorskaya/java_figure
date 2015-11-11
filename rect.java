package van;

public class rect extends figure {
	double a, b;
	rect(int x_, int y_, double a_, double b_)
	{
		super(x_,y_);
		a = a_;
		b = b_;
	}
	public double area()
	{
		//Math.PI;
		return 2*a*b;
	}
	public double perimeter()
	{
		return 2*(a+b);
	}
}
