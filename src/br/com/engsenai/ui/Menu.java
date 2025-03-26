package br.com.engsenai.ui;

import java.util.Scanner;

import br.com.engsenai.dao.CircunferenciaDao;
import br.com.engsenai.dao.QuadradoDao;
import br.com.engsenai.dao.RetanguloDao;
import br.com.engsenai.dao.TrapezioDao;
import br.com.engsenai.dao.TrianguloDao;
import br.com.engsenai.model.Triangulo;

public class Menu {

	public static void mostrarMenu() {

		System.out.println("----------------------");
		System.out.println("CALCULADORA DE POLÍGONOS");
		System.out.println("----------------------");
		System.out.println("1 - Quadrado");
		System.out.println("2 - Retângulo");
		System.out.println("3 - Trapézio");
		System.out.println("4 - Circunferencia");
		System.out.println("5 - Triângulo");
		System.out.println("----------------------");
		System.out.print("Escolha uma opção (1 - 5):");

		Scanner leitor = new Scanner(System.in);

		int opcao = leitor.nextInt();

		if (opcao == 1) {
			QuadradoDao.criarQuadrado();
		} else if (opcao == 2) {
			RetanguloDao.criarRetangulo();
		} else if (opcao == 3) {
			TrapezioDao.criarTrapezio();
		}

		else if (opcao == 4) {
			CircunferenciaDao.criarCircunferencia();
		}

		else if (opcao == 5) {
			TrianguloDao.criarTriangulo();
		} else {
			System.out.println("Esta opção ainda não foi implementada, ou o número digitado não é válido.");
		}
	}

	public static void continuar(Scanner leitor, String nome) {

		
		String resposta = "";

		while(!resposta.equals("s")|| !resposta.equals("n")) {
			System.out.print(nome + ", digite S para continuar ou N para sair...");
			resposta =leitor.next();
		}
			
		if (resposta.equalsIgnoreCase("S")) {
			Menu.mostrarMenu();
		}

	}
}
