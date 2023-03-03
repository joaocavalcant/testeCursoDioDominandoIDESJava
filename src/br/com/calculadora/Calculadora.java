package br.com.calculadora;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Qual o valor de A? ");
		a = scan.nextInt();
		System.out.println("Qual o valor de B? ");
		b = scan.nextInt();
		
		double soma = soma(a, b);
		double subtraca = subtracao(a, b);
		double multiplicacao = multiplicacao(a, b);
		double divisao = divisao(a, b);
		
		System.out.println("");
		System.out.println(soma);
		System.out.println(subtraca);
		System.out.println(multiplicacao);
		System.out.println(divisao);
	}	
	
	public static double soma(double a, double b) {
		return a + b;
	}

	public static double subtracao(double a, double b) {
		return a - b;
	}

	public static double multiplicacao(double a, double b) {
		return a * b;
	}
	
	public static double divisao(double a, double b) {
		return a / b;
	}
	
}



