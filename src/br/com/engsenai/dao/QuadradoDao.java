package br.com.engsenai.dao;

import java.util.Scanner;

import br.com.engsenai.model.Quadrado;

public class QuadradoDao {

	public static void criarQuadrado() {
		Quadrado quadrado = new Quadrado();
		
		System.out.println();
		System.out.println("Criando um objeto quadrado...");
		System.out.print("Qual o lado do quadrado? ");
		
		//Criar um objeto pro scanner
		Scanner leitor = new Scanner(System.in);
		
		quadrado.setLado(leitor.nextDouble());
		
		quadrado.mostrarDados();
		
		// Fechar o objeto scanner, remover da memória
		leitor.close();
	}
}
