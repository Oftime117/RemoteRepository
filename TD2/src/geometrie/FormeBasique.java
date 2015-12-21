package geometrie;

import java.awt.Color;
import java.awt.Point;

public abstract class FormeBasique
{
	private Point gravité;
	private Color couleur;
	
	public FormeBasique()
	{
		gravité = new Point();
		couleur = new Color(0,0,0);
	}
	
	public FormeBasique(Point gravité, Color couleur)
	{
		this.gravité = new Point(gravité);
		this.couleur = new Color(couleur.getRGB());
	}
	
	public Point getGravité()
	{
		return gravité;
	}

	public void setGravité(Point gravité)
	{
		this.gravité = (Point) gravité.clone();
	}

	public Color getCouleur()
	{
		return couleur;
	}

	public void setCouleur(Color couleur)
	{
		this.couleur = new Color(couleur.getRGB());
	}
	
	public  void translation(int dx, int dy)
	{
		setGravité(new Point(dx, dy));
	}
	public abstract void homothetie(int ratio);
	
}
