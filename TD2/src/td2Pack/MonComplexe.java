package td2Pack;

import complexe.Complexe;

public class MonComplexe extends Complexe
{
	
	public MonComplexe()
	{
		super();
	}
	
	public MonComplexe(double re, double im)
	{
		super(re, im);
	}
	
	public double getModule()
	{
		return ( Math.sqrt(getRe()*getRe() + getIm() * getIm() ));
	}
	
	public void setModule( double module)
	{
		double arg = getArg();
		
		setRe(module * Math.cos(arg));
	}
	
	public double getArg()
	{
		return Math.acos( getRe() / getModule() );
	}

	public void setArg(double arg)
	{
		double module = getModule();
		
		setIm(module * Math.sin(arg));
	}
	@Override
	public String toString()
	{
		return "MonComplexe [Module=" + getModule() + ", Arg="
				+ getArg() + ", nombre complexe=" + super.toString() + "]";
	}
	
	
}
