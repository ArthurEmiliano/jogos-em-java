package Xadrez;

public class ChessBoard {
    public static void main(String[] args) {
        String whiteSquare = "\u2B1C";
        String blackSquare = "\u2B1B";

        System.out.print("  ");
        for (int i = 0; i < 8; i++) {
            System.out.print((char)('a' + i) + " ");
        }
        System.out.println();

        for (int i = 8; i > 0; i--) {
            System.out.print(i + " ");
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(whiteSquare + " ");
                } else {
                    System.out.print(blackSquare + " ");
                }
            }
            System.out.println();
        }
        System.out.print("  ");
        for (int i = 0; i < 8; i++) {
            System.out.print((char)('a' + i) + " ");
        }
        System.out.println();

        System.out.println("\nPeças:");
        System.out.println("\u265B = Rei");
        System.out.println("\u265A = Rainha");
        System.out.println("\u265C = Bispo");
        System.out.println("\u265E = Cavalo");
        System.out.println("\u265D = Torre");
        System.out.println("\u265F = Peão");
    }
}