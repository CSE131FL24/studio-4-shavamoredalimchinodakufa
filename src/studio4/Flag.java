package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.5, 0.3, .35, .2);
		
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(0.5, 0.3, .1);
		
		 double[] x = {0.5, 0.52, 0.58, 0.53, 0.55, 0.5, 0.45, 0.47, 0.42, 0.48};
	        double[] y = {0.37, 0.33, 0.33, 0.29, 0.23, 0.27, 0.23, 0.29, 0.33, 0.33};

	        // Draw the star
	        StdDraw.setPenColor(Color.YELLOW);
	        StdDraw.filledPolygon(x, y);
	    
	}
}