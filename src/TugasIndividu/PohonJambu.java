package TugasIndividu;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

/**
 * Class for PohonJambu
 *
 * @author Ivan Widjanarko
 * @version 22-04-2021
 */

public class PohonJambu extends Tumbuhan implements Penghijauan, Komoditas {
	private int MIN_GAS = 5;
	private int MAX_GAS = 10;
	private int MIN_LEAVES = 1;
	private int MAX_LEAVES = 10;
	private Random randomNumber = new Random();
	private int countMuda = 0;
	private int countMasak = 0;
	private int countTua = 0;
	private int countBusuk = 0;
	private int gasO2;
	private int gasCO2;
	private int totalLeaves = 5;
	private int price = 0;
	private ArrayList<BuahJambu> fruits = new ArrayList<BuahJambu>();
	
	public PohonJambu() {
		type ="Jambu";
		height = 15;
		price = 0;
	}
	
	@Override
	public void fotosintesis() {
		gasO2 = randomNumber.nextInt((MAX_GAS - MIN_GAS) + 1) + MIN_GAS;
		gasCO2 = randomNumber.nextInt((MAX_GAS - MIN_GAS) + 1) + MIN_GAS;
	}
	
	@Override
	public void tumbuhDaun() {
		totalLeaves += randomNumber.nextInt((MAX_LEAVES - MIN_LEAVES) + 1);
	}
	
	@Override
	public void rontokDaun() {
		totalLeaves -= randomNumber.nextInt((MAX_LEAVES - MIN_LEAVES) + 1);
		if(totalLeaves < 0) {
			totalLeaves = 0;
		}
	}
	
	// eksekusi jika udah umurnya, dan buahnya dimasukkan ke Collection (ArrayList)
	public void berbuah(int age) {
		for(int day = 0; day < age; day ++) {
			fruits.add(new BuahJambu(age));
		}
	}
	
	@Override
	public void setHarga(int price) {
		this.price = price;
	}
	
	@Override
	public int getHarga() {
		return price;
	}
	
	public void dailyRoutine(int age) {
		for (int day = 0; day < age; day += 3) {
			fotosintesis();
			tumbuhDaun();
			rontokDaun();
			tumbuh();
		}
		berbuah(age);
		
		fruits.forEach(buah -> {
            if (buah.age == "Muda") {
                countMuda++;
            }
            else if (buah.age == "Masak") {
                countMasak++;
            }
            else if (buah.age == "Tua") {
                countTua++;
            }
            else if (buah.age == "Busuk") {
                countBusuk++;
            }
        });
		
		DecimalFormat formatValue = new DecimalFormat("####0.00");
        System.out.println("Hari Ke = " + age + "\n" +
        "Pohon = " + type + "\n" +
        "Jumlah Daun = " + totalLeaves + " helai\n" +
        "Tinggi Batang Pokok = " + formatValue.format(height) + " cm\n" +
        "Jumlah Buah :\n" +
        "\tMuda = " + countMuda + " buah\n" +
        "\tMasak = " + countMasak + " buah\n" +
        "\tTua = " + countTua + " buah\n" +
        "\tBusuk = " + countBusuk + " buah\n" +
        "CO2 yang Diserap = " + gasCO2 + " partikel\n" +
        "O2 yang Dihasilkan = " + gasO2 + " partikel\n" );

        countMuda = 0;
        countMasak = 0;
        countTua = 0;
        countBusuk = 0;
	}

}
