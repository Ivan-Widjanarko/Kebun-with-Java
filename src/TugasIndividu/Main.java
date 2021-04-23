package TugasIndividu;

/**
 * Class for Main
 *
 * @author Ivan Widjanarko
 * @version 22-04-2021
 */

public class Main {
	
	/**
     * method for entry point (main method)
     * @param  args  Command Line Arguments (String)
     */
	public static void main(String[] args) {
		int duration = 0;
		if (args.length > 0) {
		    try {
		    	duration = Integer.parseInt(args[0]);
		    } catch (NumberFormatException e) {
		        System.err.println("Argument" + args[0] + " harus berupa integer");
		        System.exit(1);
		    }
		}
		
		if(args.length != 1) {
			System.out.println("Input yang Dimasukkan Tidak Tepat");
			System.exit(1);
		}
		
		if(duration <= 0) {
			System.out.println("Durasi yang Dimasukkan Terlalu Kecil");
			System.exit(1);
		}
		
		PohonApel pohonApel = new PohonApel();
		PohonJambu pohonJambu = new PohonJambu();
		
		pohonApel.dailyRoutine(duration);
		pohonJambu.dailyRoutine(duration);
	}
}
