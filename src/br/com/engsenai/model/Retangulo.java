package br.com.engsenai.model;

public class Retangulo {
	
	private double base;
	private double altura;

	

	public void setBase(double base) {
		this.base = base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calcularArea() {
		double area = base * altura;
		return area;
	}

	public double calcularPerimetro() {
		double perimetro = base + altura * 2;
		return perimetro;
	}

	public void mostrarDados() {
		System.out.println("======================");
		System.out.println("DADOS DO Retângulo");
		System.out.println("======================");
		System.out.println("Base: " + base);
		System.out.println("Altura: " + altura);
		System.out.println("Área: " + calcularArea());
		System.out.println("Perimetro: " + calcularPerimetro());
		System.out.println("======================");
	}
}