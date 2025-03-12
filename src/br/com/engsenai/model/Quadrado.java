package br.com.engsenai.model;

public class Quadrado {
	private String nome;
	private double lado;
	public double area;
	public double perimetro;

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
	public void setLado(double lado) {
		this.lado = lado;
	}

	public double calcularArea() {
		double area =  Math.pow(lado, 2);
		return area;
	}

	public double calcularPerimetro() {
		double perimetro = lado * 4;
		return perimetro;

	}

	public void mostrarDados() {
		System.out.println("======================");
		System.out.println("DADOS DO quadrado");
		System.out.println("======================");
		System.out.println("Nome: " + nome);
		System.out.println("Lado: "+ lado);
		System.out.println("Área: "+ calcularArea());
		System.out.println("Perimetro: "+ calcularPerimetro());
		

	}
}