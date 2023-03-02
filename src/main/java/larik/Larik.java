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

	public static int sequentialSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if(key == array[i]){
				return i;
			}
		}
		return -1;
	}

	public static int binarySearch(int[] sortedArray, int key) {
		int low = 0;
		int high = sortedArray.length - 1;
		while(low < high) {
			int mid = (high + low) / 2;
			if(key == sortedArray[mid]) {
				return mid;
			}
			if(key < sortedArray[mid]) {
				high = mid;
			} else {
				low = mid;
			}
		}
		return -1;
	}

	public static int interpolationSearch(int[] sortedArray, int key) {
		int low = 0;
		int high = sortedArray.length - 1;
		while(low < high) {
			int mid = low + ((key - sortedArray[low]) * (high - low)) / (sortedArray[high] - sortedArray[low]);
			if(key == sortedArray[mid]) {
				return mid;
			}
			if(key < sortedArray[mid]) {
				high = mid;
			} else {
				low = mid;
			}
		}
		return -1;
	}
}
