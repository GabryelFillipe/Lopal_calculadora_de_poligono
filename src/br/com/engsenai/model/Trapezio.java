package br.com.engsenai.model;

public class Trapezio {

	private String nome;
	private double baseMenor;
	private double baseMaior;
	private double altura;
	public double area;

	public void setNome(String nome) {
		if (nome.length() >= 3) {
			// True, caso o nome esteja dentro da regra definida, ter trés caracteres ou
			// mais
			this.nome = nome.toUpperCase();
		} else {
			// False, caso o nome não esteja dentro da regra definide, ter trés caracteres
			// ou mais
			System.out.println("\nO nome " + nome + ", não é válido!\nO nome deve conter pelo menos 3 caracteres!\n");
		}
	}

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
		double area = baseMenor + baseMaior * altura / 2;
		return area;
	}

	public void mostrarDados() {
		System.out.println("======================");
		System.out.println("DADOS DO Trapézio");
		System.out.println("======================");
		System.out.println("Nome: " + nome);
		System.out.println("Base Menor: " + baseMenor);
		System.out.println("Base Maior: " + baseMaior);
		System.out.println("Altura: " + altura);
		System.out.println("Área: " + calcularArea());
	}
}