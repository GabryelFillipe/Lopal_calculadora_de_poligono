package br.com.engsenai;

import java.time.LocalDate;

import br.com.engsenai.model.Quadrado;
import br.com.engsenai.model.Retangulo;
import br.com.engsenai.model.Trapezio;
import br.com.engsenai.model.Triangulo;

public class Engsenai {

	public static void main(String[] args) {
		System.out.println("Calculando a área:");
		System.out.println();

		Quadrado q1 = new Quadrado();
		q1 .setNome("Teste Quadrado");
		q1 .setLado(5);
		q1.mostrarDados();
		
		Retangulo r1 = new Retangulo();
		r1 .setNome("Teste Retangulo");
		r1 .setAltura(10);
		r1 .setBase(5);
		r1 .mostrarDados();
		
		Triangulo t1 = new Triangulo();
		t1 .setNome("Teste triangulo");
		t1 .setLado(50);
		t1 .setLado2(20);
		t1 .setLado3(15.5);
		t1 .mostrarDados();
		
		Trapezio tra1 = new Trapezio();
		tra1 .setNome("Teste trapézio");
		
	}
}