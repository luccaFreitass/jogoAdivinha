package br.com.fiap.jogo.model;

import java.util.Random;

public class Adivinha {

	private int tentativas;
	private int sorteio;

	public Adivinha() {
		tentativas = 0;
		Random rand = new Random();
		sorteio = rand.nextInt(100) + 1;
	}

	public String chute(int chute) {
		tentativas = getTentativas() + 1;
		if (chute == sorteio) {
			return "GANHOU";
		} else if (chute > sorteio) {
			return "MAIOR";
		} else
			return "MENOR";

	}

	public int getTentativas() {
		return tentativas;
	}

	

}
