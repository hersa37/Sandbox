package larik;

public class Larik {

	/**
	 * Deklarasi method cetak
	 * @param array adalah parameter yang digunakan dalam method. Berjenis array integer
	 * Modifier public = dapat diakses dari luar class
	 * Modifier static = dapat diakses tanpa membuat objek
	 * Jenis return void = tidak memiliki return
	 *
	 */
	public static void cetak(int[] array) {
		for (int i = 0; i < array.length; i++) { //Lakukan perulangan mulai dari i = 0, tambah nilai i sebesar 1 tiap iterasi, lakukan perulangan selama i < panjang array
			System.out.print(array[i] + " ");
		}
	}
}
