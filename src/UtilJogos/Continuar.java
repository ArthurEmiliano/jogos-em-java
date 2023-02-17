package UtilJogos;

import java.util.Scanner;

public class Continuar {
    private static final Scanner scanner = new Scanner(System.in);

    public static boolean perguntar() {
        System.out.print("Deseja continuar? [S/N] ");
        String continuar = scanner.nextLine();
        continuar = continuar.trim().toUpperCase();

        while (!continuar.equals("S") && !continuar.equals("N")) {
            System.out.print("Opção inválida. Digite 'S' para continuar ou 'N' para sair: ");
            continuar = scanner.nextLine().trim().toUpperCase();
        }

        if (continuar.equals("S")) {
            return true;
        } else {
            return false;
        }
    }

    public static void close() {
        scanner.close();
    }
}