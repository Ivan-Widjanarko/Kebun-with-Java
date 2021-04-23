package TugasIndividu;

/**
 * Abstract Class for Buah
 *
 * @author Ivan Widjanarko
 * @version 23-04-2021
 */

abstract class Buah {
	

	/**
	 * The variable of taste
	 */
	public String taste;
	
	/**
	 * The variable of age
	 */
	public String age;
	
	/**
     * Constructor for objects of class Buah
     */
	public Buah() {
		
	}
	
	/**
     * method for ubahRasa
     * @param age usia tumbuhan (hari)
     */	
	public void ubahRasa(int age) {
		if(age <= 10) {
			taste = "Belum Muncul Buah";
			this.age = "Belum Muncul Buah";
		}
		
		else if(age > 10 && age <= 20) {
			taste = "Asam";
			this.age = "Muda";
		}
		
		else if(age > 20 && age <= 35) {
			taste = "Manis";
			this.age = "Masak";
		}
		
		else if(age > 35 && age <= 50) {
			taste = "Pahit";
			this.age = "Tua";
		}
		
		else if (age > 50) {
			taste = "Busuk";
			this.age = "Mati";
		}
	}
}
