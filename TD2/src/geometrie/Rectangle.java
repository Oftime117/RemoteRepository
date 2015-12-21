package geometrie;

import java.awt.Color;
import java.awt.Point;

public class Rectangle extends FormeBasique
{

	private int largeur;
	private int hauteur;
	public Rectangle()
	{
		largeur = 0;
		hauteur = 0;
	}
	public Rectangle(Point gravité, Color couleur, int largeur, int hauteur)
	{
		super(gravité, couleur);
		this.largeur = largeur;
		this.hauteur = hauteur;
	}
	public int getLargeur()
	{
		return largeur;
	}
	public void setLargeur(int largeur)
	{
		this.largeur = largeur;
	}
	public int getHauteur()
	{
		return hauteur;
	}
	public void setHauteur(int hauteur)
	{
		this.hauteur = hauteur;
	}
	
	@Override
	public String toString()
	{
		return "[Rectangle \n\t[largeur = " + largeur + ", hauteur = " + hauteur + "]\n\t[Centre de Gravité: x = " + getGravité().getX() + ", y = " + getGravité().getY() + "] \n\t[Couleur: "
				+ " r = " + getCouleur().getRed() +", g = " + getCouleur().getGreen() + ", b = " 
				+ getCouleur().getBlue() + "]"+ "\n]\n";
	}
	
	public void homothetie(int ratio)
	{
		setLargeur(this.largeur * ratio);
		setHauteur(this.hauteur * ratio);
	}
}
