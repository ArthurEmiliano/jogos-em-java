package PedraPapelTesoura;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import UtilJogos.Continuar;

public class PedraPapelTesoura {
    public static void main(String[] args) {
    	Random random = new Random();
    	Scanner scanner = new Scanner(System.in);
    	String[] opcao = {"pedra", "papel", "tesoura"};
    	
    	while(true) {
    		String escolhaComputador = opcao[random.nextInt(opcao.length)];
    		System.out.print("Escolha pedra, papel ou tesoura: ");
    		String escolhaPlayer = scanner.nextLine();
    		
    		if (!Arrays.asList(opcao).contains(escolhaPlayer)) {
    			System.out.println("Escolha inválida, tente novamente: ");
    			continue;
    		}
    		
    		String resultado;
    		System.out.println("O computador escolheu... " + escolhaComputador);
    		
    		if (escolhaPlayer.equals(escolhaComputador)) {
    			resultado = "Empate";
    		} else if (escolhaPlayer.equals("pedra") && escolhaComputador.equals("tesoura") || 
    		           escolhaPlayer.equals("tesoura") && escolhaComputador.equals("papel") ||
    		           escolhaPlayer.equals("papel") && escolhaComputador.equals("pedra")) {
    			resultado = "!!!Você ganhou!!!";
    		} else {
    			resultado = "Você perdeu ;/";
    		}
    		
    		System.out.println(resultado);
    		if(!Continuar.perguntar()) {
    			scanner.close();
    			break;
    		}
    	}
    }
}