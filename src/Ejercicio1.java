import javax.swing.JOptionPane;

public class Ejercicio1 {
	
	public static void main (String args[]) {
		
		int numMenor = 5;
		int numMayor = 7;
		
		if (numMayor > numMenor) {
			System.out.println("La variable numMayor es mayor a numMenor");
		}
		else if (numMayor < numMenor) {
			System.out.println("La variable numMenor es menor a numMayor");
		}
		else {
			System.out.println("Las variables son iguales");
		}
	}
}
