package br.com.engsenai.dao;

import java.util.Scanner;

import br.com.engsenai.model.Circunferencia;
import br.com.engsenai.model.Retangulo;

public class RetanguloDao {

	public static void criarRetangulo() {
		Retangulo retangulo = new Retangulo();

	
		Scanner leitor = new Scanner(System.in);

		System.out.println();
		System.out.println("Criando um objeto retângulo...");
		System.out.println("Qual a altura do seu retângulo? ");
		retangulo.setAltura(leitor.nextDouble());
		System.out.println("Qual a base do seu retângulo? ");
		retangulo.setBase(leitor.nextDouble());

		retangulo.mostrarDados();

		leitor.close();
	}
}
