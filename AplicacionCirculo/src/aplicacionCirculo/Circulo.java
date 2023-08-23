package aplicacionCirculo;
import java.util.Scanner;

public class Circulo {
	private double radio;

	public Circulo() {
		radio=1.0;
	}

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getArea() {
		double miArea=Math.PI*Math.pow(this.radio,2);
		return miArea;
	}
	public double getCircunferencia() {
		double circunferencia=2*this.radio;
		return circunferencia;
	
	}

	@Override
	public String toString() {
		return "Circulo radio=" + radio + "thnaks";
	}
	
	
	

}
