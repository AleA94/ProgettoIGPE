package it.mat.unical.ProgettoIGPE.core;

public interface StaticObject {
	int getRay();
	int getX();
	int getY();
	boolean intersect(StaticObject other);
	
}
