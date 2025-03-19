package br.com.engsenai.model;

public class Trapezio {

	private double baseMenor;
	private double baseMaior;
	private double altura;

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calcularArea() {
		double area = (baseMenor + baseMaior) * altura / 2;
		return area;
	}

	public void mostrarDados() {
		System.out.println("======================");
		System.out.println("DADOS DO Trapézio");
		System.out.println("======================");
		System.out.println("Base Menor: " + baseMenor);
		System.out.println("Base Maior: " + baseMaior);
		System.out.println("Altura: " + altura);
		System.out.println("Área: " + calcularArea());
	}
}