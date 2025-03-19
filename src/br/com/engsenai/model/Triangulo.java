package br.com.engsenai.model;

public class Triangulo {

	private double base;
	private double altura;

	public void setBase(double base) {
		this.base = base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calcularArea() {
		double area = base * altura / 2;
		return area;

	}

	public void mostrarDados() {
		System.out.println("======================");
		System.out.println("DADOS DO Triangulo");
		System.out.println("======================");
		System.out.println("Base: : " + base);
		System.out.println("Altura: " + altura);
		System.out.println("Área: " + calcularArea());
		System.out.println("======================");
	}
}
