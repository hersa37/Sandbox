package loop;

public class ForLoop {

	public void forBasic() {
		int end = 10;
		for(int i = 0; i < end;i++){
			System.out.println(i);
		}
	}

	public void forFloat() {
		int end = 10;
		for(double i = 0.1; i < end; i = i + 0.1){ //
			System.out.println(i);
		}
	}
}
