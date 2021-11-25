
public class array {

	public static void main(String[] args) {
		
		int aleatorio = 0;
		
		int [] array = new int[30];
			
		for(int i = 0; i < array.length; i++) {
			
			aleatorio = (int)(Math.random()*10);
			
			array[i] = aleatorio;
			
		}
		
	}

}
