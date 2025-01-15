package paquete;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        String[] lista = {"casa", "perro", "animal"};
        Random rng = new Random();
        int indiceAleatorio = rng.nextInt(lista.length);
        String palabra = lista[indiceAleatorio];
        
        StringBuilder barra = new StringBuilder();
        for (int i = 0; i < palabra.length(); i++) {
            barra.append("_");
            if (i < palabra.length() - 1) {
                barra.append(" ");
            }
        }
        
        Scanner sc = new Scanner(System.in);
        
        int e = 0;
        
        while (barra.toString().contains("_")) {
            System.out.println("\nPalabra: " + barra);
            System.out.print("Dime una letra: ");
            char letra = sc.next().charAt(0);
            
            boolean hayLetra = false; 
            
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    barra.setCharAt(i * 2, letra);
                    hayLetra = true;
                }
            }
            
            if (!hayLetra) {
            	e++;
            	switch (e) {
					case 1:
						System.out.println("  +---+\r\n"
								+ "  |   |\r\n"
								+ "      |\r\n"
								+ "      |\r\n"
								+ "      |\r\n"
								+ "      |\r\n"
								+ "=========");
						break;
					case 2:
						System.out.println("  +---+\r\n"
								+ "  |   |\r\n"
								+ "  O   |\r\n"
								+ "      |\r\n"
								+ "      |\r\n"
								+ "      |\r\n"
								+ "=========");
						break;
					case 3:
						System.out.println("  +---+\r\n"
								+ "  |   |\r\n"
								+ "  O   |\r\n"
								+ "  |   |\r\n"
								+ "      |\r\n"
								+ "      |\r\n"
								+ "=========");
						break;
					case 4:
						System.out.println("  +---+\r\n"
								+ "  |   |\r\n"
								+ "  O   |\r\n"
								+ " /|   |\r\n"
								+ "      |\r\n"
								+ "      |\r\n"
								+ "=========");
						break;
					case 5:
						System.out.println("  +---+\r\n"
								+ "  |   |\r\n"
								+ "  O   |\r\n"
								+ " /|\\  |\r\n"
								+ "      |\r\n"
								+ "      |\r\n"
								+ "=========");
						break;
					case 6:
						System.out.println("  +---+\r\n"
								+ "  |   |\r\n"
								+ "  O   |\r\n"
								+ " /|\\  |\r\n"
								+ " /    |\r\n"
								+ "      |\r\n"
								+ "=========");
						break;
					case 7:
						System.out.println("  +---+\r\n"
								+ "  |   |\r\n"
								+ "  O   |\r\n"
								+ " /|\\  |\r\n"
								+ " / \\  |\r\n"
								+ "      |\r\n"
								+ "=========\r\n"
								+ "PERDISTE");
						break;
            	}				
			}
        }
        
        System.out.println("\n¡Felicidades! Has adivinado la palabra: " + palabra);
        sc.close();
    }
}