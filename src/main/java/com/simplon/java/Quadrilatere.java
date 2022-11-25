package com.simplon.java;

public class Quadrilatere implements FormeGeometrique {
	private double corner1;
	private double corner2;
	private double corner3;
	private double corner4;
	
	/**
	 * @return the corner1
	 */
	public double getCorner1() {
		return corner1;
	}


	/**
	 * @param corner1 the corner1 to set
	 */
	public void setCorner1(double corner1) {
		this.corner1 = corner1;
	}


	/**
	 * @return the corner2
	 */
	public double getCorner2() {
		return corner2;
	}


	/**
	 * @param corner2 the corner2 to set
	 */
	public void setCorner2(double corner2) {
		this.corner2 = corner2;
	}


	/**
	 * @return the corner3
	 */
	public double getCorner3() {
		return corner3;
	}


	/**
	 * @param corner3 the corner3 to set
	 */
	public void setCorner3(double corner3) {
		this.corner3 = corner3;
	}


	/**
	 * @return the corner4
	 */
	public double getCorner4() {
		return corner4;
	}


	/**
	 * @param corner4 the corner4 to set
	 */
	public void setCorner4(double corner4) {
		this.corner4 = corner4;
	}


	Quadrilatere(double corner1, double corner2, double corner3, double corner4) {
		this.corner1 = corner1;
		this.corner2 = corner2;
		this.corner3 = corner3;
		this.corner4 = corner4;
	}
	
	public double calc() {
		double result = corner1 + corner2 + corner3 + corner4;
		return result;
	}


	@Override
	public double calculPerimetre() {
		// TODO Auto-generated method stub
		return 0;
	}
}
