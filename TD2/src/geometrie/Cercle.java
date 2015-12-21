package geometrie;

import java.awt.Color;
import java.awt.Point;

public class Cercle extends FormeBasique
{

	private int rayon;
	
	public Cercle()
	{
		rayon = 0;
	}
	
	public Cercle(Point gravit�, Color couleur, int rayon)
	{
		super(gravit�, couleur);
		this.rayon = rayon;
	}
	
	public int getRayon()
	{
		return rayon;
	}
	
	public void setRayon(int rayon)
	{
		this.rayon = rayon;
	}

	@Override
	public String toString()
	{
		return "[Cercle \n\t[rayo = " + getRayon() + "]\n\t[Centre de Gravit�: x = " + getGravit�().getX() + ", y = " + getGravit�().getY() + "] \n\t[Couleur: "
				+ " r = " + getCouleur().getRed() +", g = " + getCouleur().getGreen() + ", b = " 
				+ getCouleur().getBlue() + "]"
				+ "\n]\n";
	}
	
	public void homothetie(int ratio)
	{
		setRayon(this.rayon * ratio);
	}
}
