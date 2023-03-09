package br.com.fiap.jogo.app;

import java.util.Scanner;

import br.com.fiap.jogo.model.Adivinha;

public class Main {
	
	public static void main(String[] args) {
		
		String resp = "";
		
		Scanner in = new Scanner(System.in);
		
		Adivinha adv = new Adivinha();
		
		System.out.println("----> Que comecem as tentativas <----");
		
		while(!resp.equals("GANHOU")) {
			
			System.out.println("Digite um numero de 1 a 100:");
			int chute = in.nextInt();
			
			resp = adv.chute(chute);
			
			if(resp.equals("MAIOR")) {
				System.out.println("Seu chute foi maior");
				System.out.println("-------------------");
			}
			else if(resp.equals("MENOR")) {
				System.out.println("Seu chute foi menor");
				System.out.println("-------------------");
			}
			
		}
		System.out.printf("VOCE GANHOUU!! Voce precisou de %d", adv.getTentativas());
		
		in.close();
		
		
		
	}

}
