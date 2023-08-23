package ejercicioGatoPkg;

public class EjercicioGato {
	
	public static void main(String[]args) {
		Gato miGato=new Gato();
		miGato.setNombre("bola de nieve");
		
		miGato.maullar(null);
		miGato.dormir(2);
		miGato.comer("carne");
		miGato.correr("pasto");
		miGato.respirar();
		
		System.out.println("el nombre de mi gato es "+miGato.getNombre());
		
	}
	

}
