package geometrie;

import java.awt.Color;
import java.awt.Point;

public abstract class FormeBasique
{
	private Point gravit�;
	private Color couleur;
	
	public FormeBasique()
	{
		gravit� = new Point();
		couleur = new Color(0,0,0);
	}
	
	public FormeBasique(Point gravit�, Color couleur)
	{
		this.gravit� = new Point(gravit�);
		this.couleur = new Color(couleur.getRGB());
	}
	
	public Point getGravit�()
	{
		return gravit�;
	}

	public void setGravit�(Point gravit�)
	{
		this.gravit� = (Point) gravit�.clone();
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
		setGravit�(new Point(dx, dy));
	}
	public abstract void homothetie(int ratio);
	
}
