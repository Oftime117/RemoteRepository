package td2Pack;

import java.awt.Point;

public class MainTd2 
{

	public static void main(String[] args) 
	{
		Point p = new Point (0 , 0);
		Exercice1 c= new Exercice1 (p , 20);
		System . out . println (" Cercle c avant d´eplacement : " + c );
		c. deplacer (5 , 5);
		System . out . println (" Cercle c apr`es d´eplacement : " + c );

	}

}
