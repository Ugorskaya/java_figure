package van;

public class square extends figure {
	double l;
	square(int x_, int y_, double l_)
	{
		super(x_,y_);
		l = l_;
	}
	public double area()
	{
		//Math.PI;
		return l*l;
	}
	public double perimeter()
	{
		return 4*l;
	}
}
