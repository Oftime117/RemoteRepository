package geometrie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;

public class FormesList extends ArrayList<FormeBasique>
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FormesList()
	{
		// TODO Auto-generated constructor stub
	}

	public FormesList(int initialCapacity)
	{
		super(initialCapacity);
		// TODO Auto-generated constructor stub
	}

	public FormesList(Collection<FormeBasique> c)
	{
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	public void translations(int dx, int dy)
	{
		Iterator<FormeBasique> listIt = this.iterator();
		
		while(listIt.hasNext())
			listIt.next().translation(dx, dy);
	}

	public void homotheties(int ratio)
	{
		Iterator<FormeBasique> listIt = this.iterator();
		
		while(listIt.hasNext())
			listIt.next().homothetie(ratio);
	}

	@Override
	public String toString()
	{
		String print = "";
		
		Iterator<FormeBasique> listIt = this.iterator();
		print += "Il y a " + this.size() + " formes dans la liste: \n\n";
		while(listIt.hasNext())
			print += listIt.next().toString();
		return print;
	}
	
	
	
}
