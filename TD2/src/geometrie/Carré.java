package geometrie;

import java.awt.Color;
import java.awt.Point;

public final class Carr� extends Rectangle
{

	public Carr�()
	{
		// TODO Auto-generated constructor stub
	}

	public Carr�(Point gravit�, Color couleur, int cote)
	{
		super(gravit�, couleur, cote, cote);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString()
	{
		return "[Carr� \n\t[cote = "+ super.getLargeur()+ "]\n\t[Centre de Gravit�: x = " + getGravit�().getX() + ", y = " + getGravit�().getY() + "] \n\t[Couleur: "
				+ " r = " + getCouleur().getRed() +", g = " + getCouleur().getGreen() + ", b = " 
				+ getCouleur().getBlue() + "]" + "\n]\n";
	}

}
