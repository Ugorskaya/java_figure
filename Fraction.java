package van;


public class Fraction {
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
	public String minus(Fraction b)
	{
		int k1=n*b.d;
		int k2=b.n*d;
		int l=b.d*d; 
		k1-=k2;
		return k1+"/"+l;
	}
	public String umn(Fraction b)
	{
		int k=n*b.n;
		int l=d*b.d; 
		return k+"/"+l;
	}
	public String del(Fraction b)
	{
		int k=n*b.d;
		int l=d*b.n;
		return k+"/"+l;
	}

	
}

