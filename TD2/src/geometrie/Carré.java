package geometrie;

import java.awt.Color;
import java.awt.Point;

public final class Carré extends Rectangle
{

	public Carré()
	{
		// TODO Auto-generated constructor stub
	}

	public Carré(Point gravité, Color couleur, int cote)
	{
		super(gravité, couleur, cote, cote);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString()
	{
		return "[Carré \n\t[cote = "+ super.getLargeur()+ "]\n\t[Centre de Gravité: x = " + getGravité().getX() + ", y = " + getGravité().getY() + "] \n\t[Couleur: "
				+ " r = " + getCouleur().getRed() +", g = " + getCouleur().getGreen() + ", b = " 
				+ getCouleur().getBlue() + "]" + "\n]\n";
	}

}
