package van;


public class circle extends figure {
	double r;
	circle(int x_, int y_, double r_)
	{
		super(x_,y_);
		r = r_;
	}
	public double area()
	{
		//Math.PI;
		return 3.14*r*r;
	}
	public double perimeter()
	{
		return 2*3.14*r;
	}

}
