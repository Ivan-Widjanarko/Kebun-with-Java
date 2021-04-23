package TugasIndividu;

/**
 * Abstract Class for Tumbuhan
 *
 * @author Ivan Widjanarko
 * @version 22-04-2021
 */

abstract class Tumbuhan {
	
	/**
	 * The variable of height
	 */
	public double height;

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
		height += 0.25 * height;
	}
}
