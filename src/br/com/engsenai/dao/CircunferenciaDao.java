package br.com.engsenai.dao;

import java.util.Scanner;

import br.com.engsenai.model.Circunferencia;
import br.com.engsenai.model.Quadrado;

public class CircunferenciaDao {

	public static void criarCircunferencia() {
		Circunferencia circunferencia = new Circunferencia();
		
		System.out.println();
		System.out.println("Criando um objeto circunferencia...");
		System.out.print("Qual o raio da sua circunferencia? ");
		
		//Criar um objeto pro scanner
		Scanner leitor = new Scanner(System.in);
		
		circunferencia.setRaio(leitor.nextDouble());
		
		circunferencia.mostrarDados();
		
		// Fechar o objeto scanner, remover da memória
		leitor.close();
	}

}
