package br.com.engsenai.model;

public class Triangulo {
	private String nome;
	public double lado1;
	public double lado2;
	public double lado3;
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

	public void setLado(double lado1) {
		this.lado1 = lado1;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	public double calcularArea() {
		double area = lado1 + lado2 + lado3;
		return area;

	}

	public void mostrarDados() {
		System.out.println("======================");
		System.out.println("DADOS DO Triangulo");
		System.out.println("======================");
		System.out.println("Lado1: " + lado1);
		System.out.println("lado2: " + lado2);
		System.out.println("lado3: " + lado3);
		System.out.println("Área: " + calcularArea());
	}
}
