package br.com.engsenai.dao;

import java.util.Scanner;

import br.com.engsenai.model.Retangulo;
import br.com.engsenai.model.Triangulo;
import br.com.engsenai.ui.Menu;

public class TrianguloDao {

	public static void criarTriangulo() {
		Triangulo triangulo = new Triangulo();

		Scanner leitor = new Scanner(System.in);

		System.out.println();
		System.out.println("Criando um objeto triangulo...");
		System.out.println("Qual a altura do seu triangulo? ");
		triangulo.setAltura(leitor.nextDouble());
		System.out.println("Qual a base do seu triangulo? ");
		triangulo.setBase(leitor.nextDouble());

		triangulo.mostrarDados();

		Menu.continuar(leitor, "Gabryel");

	}
}
