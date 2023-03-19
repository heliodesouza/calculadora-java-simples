package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double valor1, valor2;
		System.out.println("Digite o primeiro valor: ");
		valor1= scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		valor2 = scan.nextInt();
		
		double soma = soma(valor1,valor2);
		double subtracao = subtracao(valor1,valor2);
		double multiplicacao = multiplicacao(valor1,valor2);
		double divisao = divisao(valor1,valor2);
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);

		scan.close();
				

	}
	
	public static double soma(double valor1, double valor2) {
		return valor1+valor2;
	}
	public static double subtracao(double valor1, double valor2) {
		return valor1-valor2;
	}
	public static double divisao(double valor1, double valor2) {
		return valor1/valor2;
	}
	public static double multiplicacao(double valor1, double valor2) {
		return valor1*valor2;
	}
	
}
