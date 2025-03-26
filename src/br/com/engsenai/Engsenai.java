package br.com.engsenai;

import br.com.engsenai.ui.Menu;

public class Engsenai {

	public static void main(String[] args) {

//		double contador = 2;
//		while (contador <= 10) {
//			System.out.println("Senai - " + contador);
//			contador = Math.pow(contador, 3);
//		}

		Menu.mostrarMenu();

		System.out.println("Encerando o programa, Bye!");

	}

	public static void escrever(String nome) {
		System.out.println(nome);

	}

}