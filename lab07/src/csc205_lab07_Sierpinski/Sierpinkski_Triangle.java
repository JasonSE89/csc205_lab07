package csc205_lab07_Sierpinski;

import java.awt.*;
import javax.swing.*;

public class Sierpinkski_Triangle extends JPanel {

	private static int numberLevelsOfRecursion;

	public Sierpinkski_Triangle(int numLevels) {
		numberLevelsOfRecursion = numLevels;
	}

	/**
	 * This is the method that initially calls the recursive drawTriangle
	 * method. You SHOULD NOT alter this code at all
	 */
	public void paintComponent(Graphics computerScreen) {

		super.paintComponent(computerScreen);

		Point top = new Point(250, 50);
		Point left = new Point(50, 450);
		Point right = new Point(450, 450);

		drawTriangle(computerScreen, numberLevelsOfRecursion, top, left, right);
	}

	/**
	 * Draw a Sierpinski triangle 
	 * 
	 * @param screen the surface on which to draw the Sierpinski image
	 * @param levels number of levels of triangles-within-triangles
	 * @param top coordinates of the top point of the triangle
	 * @param left coordinates of the lower-left point of the triangle
	 * @param right coordinates of the lower-right point of the triangle
	 */
	public void drawTriangle ( Graphics screen, int levels,  Point top, Point left, Point right )
	{ 
		int limit=0;
        if(limit==levels)
        {
		Polygon base = new Polygon();
		base.addPoint(top.x, top.y);
		base.addPoint(50, 450);
		base.addPoint(450, 450);
		screen.setColor(Color.RED);
		screen.fillPolygon(base);
		screen.drawPolygon(base);
		 screen.drawString ( "that draws a level " + numberLevelsOfRecursion + 
		            " Sierpinski traingle", 20, 40 );	
        }
		 else
		 {
				Polygon tri = new Polygon();
				tri.addPoint(250/levels, 250/levels);
				tri.addPoint(50/levels, 450/levels);
				tri.addPoint(450/levels, 450/levels);
				screen.setColor(Color.black);
				screen.fillPolygon(tri);
				screen.drawPolygon(tri);
			}
		}
		
		}
		
	
