package geometrie;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;


public class MainGeometrie
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<FormeBasique> formesList = new ArrayList<FormeBasique>();
		
		formesList.add(new Cercle(new Point(4,5), new Color(40,40,40), 5) );
		formesList.add(new Rectangle(new Point(2,6), new Color(20,20,20), 5, 10) );
		formesList.add(new Carré(new Point(8,8), new Color(1,1,1), 4) );
		
		FormesList formes = new FormesList(formesList);
		
		System.out.println(formes.toString());
		
		SpecifList<Rectangle> rectList = new SpecifList<Rectangle>();
		
		rectList.add(new Cercle(new Point(4,5), new Color(40,40,40), 5) );
		rectList.add(new Rectangle(new Point(2,6), new Color(20,20,20), 5, 10) );
		
	}

}
