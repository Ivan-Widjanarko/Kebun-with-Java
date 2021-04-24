package TugasIndividu;

import java.util.Random;

/**
 * Abstract Class for Tumbuhan
 *
 * @author Ivan Widjanarko
 * @version 23-04-2021
 */

abstract class Tumbuhan {
	
	/**
	 * The variable of randomHeight
	 */
	private Random randomHeight = new Random();
	
	/**
	 * The variable of height
	 */
	public double height;
	

	private int MIN_HEIGHT = 25;
	private int MAX_HEIGHT = 50;

	/**
	 * The variable of type
	 */
	public String type;
	
	/**
     * Constructor for objects of class Tumbuhan
     */
	public Tumbuhan() {
		
	}
	
	/**
     * method for tumbuh
     */
	public void tumbuh() {
		height += randomHeight.nextInt((MAX_HEIGHT - MIN_HEIGHT)) * height / 150;
	}
}
