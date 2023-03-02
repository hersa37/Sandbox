package loop;

/**
 * Loop yang akan terus berjalan selama kondisi dalam loop bernilai true
 */
public class WhileLoop {

	public void whileBasic() {
		int i = 0;
		while(i < 10) { //Loop akan jalan selama i < 10
			System.out.println(i);
			i++; //Operasi yang dapat mengubah nilai agar loop suatu saat bisa berhenti
		}
	}

	public void whileBoolean() {
		boolean truth = true;
		while(truth) { //Kondisi while bisa langsung diganti dengan sebuah nilai boolean ketimbang operasi boolean
			System.out.println(truth);
			truth = !truth; //
		}
	}
}
