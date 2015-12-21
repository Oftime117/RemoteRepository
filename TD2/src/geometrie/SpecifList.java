package geometrie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SpecifList<T extends FormeBasique> extends ArrayList<T>
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SpecifList()
	{
		// TODO Auto-generated constructor stub
	}

	public SpecifList(int initialCapacity)
	{
		super(initialCapacity);
		// TODO Auto-generated constructor stub
	}

	public SpecifList(Collection<T> c)
	{
		super(c);
		// TODO Auto-generated constructor stub
	}

	public void translations(int dx, int dy)
	{
		Iterator<T> listIt = this.iterator();
		
		while(listIt.hasNext())
			listIt.next().translation(dx, dy);
	}

	public void homotheties(int ratio)
	{
		Iterator<T> listIt = this.iterator();
		
		while(listIt.hasNext())
			listIt.next().homothetie(ratio);
	}

	@Override
	public String toString()
	{
		String print = "";
		
		Iterator<T> listIt = this.iterator();
		print += "Il y a " + this.size() + " formes dans la liste spécifique: \n\n";
		while(listIt.hasNext())
			print += listIt.next().toString();
		return print;
	}
}
