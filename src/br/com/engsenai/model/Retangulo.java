package br.com.engsenai.model;

public class Retangulo {
	private String nome;
	public double base;
	public double altura;
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
		System.out.println("Nome: " + nome);
		System.out.println("Base: " + base);
		System.out.println("Altura: " + altura);
		System.out.println("Área: " + calcularArea());
		System.out.println("Perimetro: " + calcularPerimetro());

	}
}