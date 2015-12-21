package td2Pack;

import java . awt . Point ;
/* *
* Un cercle defini par son centre et son rayon
*/
public class Exercice1 
{
	private Point centre ;
	private double rayon ;
	/* *
	* Construit un Cercle .
	* @param c le centre de ce cercle
	* @param r le rayon de ce cercle
	*/
	public Exercice1 ( Point c , double r) 
	{
		centre = new Point (c );
		rayon = r;
	}
	/* *
	* Translate un cercle par le vecteur ( dx , dy )
	* @param dx la translation en abscisse
	* @param dy la translation en ordonn´ee
	*/
	public void deplacer ( int dx , int dy ) 
	{
		centre . setLocation ( centre . getX () + dx , centre . getY () + dy );
	}
	/* *
	* Renvoie le centre de ce cercle .
	* @return le centre du cercle .
	*/
	public Point getCentre () 
	{
		return (Point) centre.clone() ;
	}
	/* *
	* Change le centre du cercle .
	* @param centre le nouveau centre
	*/
	public void setCentre ( Point centre ) 
	{
		this . centre = (Point) centre.clone() ;
	}
	/* *
	* Renvoie le rayon de ce cercle .
	* @return le rayon de ce cercle .
	*/
	public double getRayon () 
	{
		return rayon ;
	}
	/* *
	* Change le rayon de ce cercle .
	* @param rayon le nouveau rayon
	*/
	public void setRayon ( double rayon ) 
	{
		this . rayon = rayon ;
	}
	/* *
	* Une description textuelle de ce cercle .
	* @return une chaine de caractere decrivant ce cercle .
	*/
	public String toString () 
	{
		return (" Cercle de centre " + centre + " et de rayon " + rayon );
	}
}
