//Esta es mi aplicacion para circulos
package aplicacionCirculo;
import java.util.Scanner;
//Este es el programa principal
public class Programa {
//Este es el constructor de la clase
	public Programa() {
		// TODO Auto-generated constructor stub
	}
//Este es el punto de entrada del programa
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		Circulo miCirculo=new Circulo();
		System.out.println("ingrese el radio del circulo");
		miCirculo.setRadio(teclado.nextDouble());
		
		System.out.println(miCirculo.getArea());
		System.out.println(miCirculo);
		
		

	}

}
