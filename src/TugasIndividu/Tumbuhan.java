package TugasIndividu;

/**
 * Abstract Class for Tumbuhan
 *
 * @author Ivan Widjanarko
 * @version 22-04-2021
 */

public abstract class Tumbuhan {
	public double height;
	public String type;
	public void tumbuh() {
		height += 0.25 * height;
	}
}
