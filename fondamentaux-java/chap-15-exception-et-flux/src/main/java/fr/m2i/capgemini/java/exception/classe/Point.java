package fr.m2i.capgemini.java.exception.classe;

import fr.m2i.capgemini.java.exception.PointConstructException;
import fr.m2i.capgemini.java.exception.PointTranslateException;

public class Point {

	private double x;
	private double y;

	public Point(double x, double y) throws PointConstructException {
		if (x < 0 || y < 0) {
			// On genere une exception
			throw new PointConstructException("Attention x && y doivent être positif !!!");
		}
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void translater(double dx, double dy) throws PointTranslateException {
		if ((x + dx) < 0 || (y + dy) < 0) {
			throw new PointTranslateException("Translation hors de la zone autorisé");
		}
		x += dx;
		y += dy;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}