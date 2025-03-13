package paquete;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int df;
        
        while (true) {
            System.out.println("Selecciona dificultad:");
            System.out.println(" 1 Normal");
            System.out.println(" 2 Dificil");
            System.out.println(" 3 Imposible");
            
            df = sc.nextInt();
            
            if (df == 1 || df == 2 || df == 3) {
                break;
            } else {
                System.out.println("Opcion no valida. Por favor, selecciona 1, 2 o 3.");
            }
        }
        
        String[] lista;
        
        if (df == 1) {
            lista = new String[] {
                "casa", "perro", "animal", "arbol", "ciudad", "montana", "rio", "cielo", "estrella", "planeta", "universo", "galaxia", "cometa", "asteroide", "meteorito", "constelacion", "satelite", "nave", "astronauta", "telescopio", "microscopio", "bacteria", "virus", "celula", "tejido", "organo", "sistema", "organismo", "especie", "ecosistema", "bioma", "biosfera", "atmosfera", "hidrosfera", "litosfera", "geosfera", "nucleo", "manto", "corteza", "roca", "mineral", "fosil", "volcan", "terremoto", "tsunami", "huracan", "tornado", "ciclon", "tormenta", "relampago", "trueno", "lluvia", "nieve", "granizo", "escarcha", "hielo", "glaciar", "desierto", "selva", "bosque", "pradera", "sabana", "pantano", "laguna", "lago", "mar", "oceano", "playa", "costa", "acantilado", "bahia", "golfo", "peninsula", "isla", "archipielago", "continente", "hemisferio", "ecuador", "tropico", "meridiano", "paralelo", "latitud", "longitud", "altitud", "profundidad", "gravedad", "fuerza", "energia", "potencia", "trabajo", "calor", "temperatura", "presion", "volumen", "densidad", "masa", "peso", "aceleracion", "velocidad", "desplazamiento", "trayectoria", "orbita", "satelite", "planeta", "estrella", "galaxia", "universo", "cosmos"
            };
        } else if (df == 2) {
            lista = new String[] {
                "abstruso", "acendrado", "acrimonia", "admonicion", "advenedizo", "altruismo", "anacoluto", "anodino", "antitesis", "apocrifo", "apodictico", "apologia", "apoteosis", "arquetipo", "ascetico", "asercion", "atavismo", "augurio", "autoctono", "avieso", "axioma", "baladi", "bisono", "caliginoso", "catarsis", "categorico", "cavilacion", "cerciorar", "circunspecto", "coetaneo", "colofon", "concomitante", "conjetura", "connivencia", "contumaz", "corolario", "deletereo", "detrimento", "diafano", "diletante", "dirimir", "disension", "dislate", "disquisicion", "dubitativo", "efimero", "egregio", "elucidar", "emolumento", "empirico", "encomio", "endemico", "enervar", "epitome", "esoterico", "espurio", "estolido", "etereo", "exabrupto", "exangue", "eximio", "exogeno", "exordio", "expiacion", "exultante", "falaz", "fatuo", "felonia", "futil", "garbo", "hedonismo", "hermetico", "histrionico", "ignoto", "impavido", "impenitente", "inane", "incolume", "indomito", "inefable", "inexorable", "inextricable", "inmarcesible", "insigne", "insipiente", "insolito", "inteligible", "intrinseco", "inverosimil", "irascible", "lascivo", "lenidad", "lugubre", "macula", "misantropo", "nitido", "obcecado", "obstinado"
            };
        } else {
            lista = new String[] {
                "aberrante", "abigarrado", "abjurar", "abnegacion", "abrogar", "acicate", "acrisolar", "adusto", "alegoria", "algarabia", "altruista", "amalgama", "amanuense", "amodorrado", "anacronismo", "anatematizar", "anodino", "antipoda", "apocrifo", "apodictico", "apologia", "apoteosis", "arquetipo", "ascetico", "asercion", "atavismo", "augurio", "autoctono", "avieso", "axioma", "baladi", "bisono", "caliginoso", "catarsis", "categorico", "cavilacion", "cerciorar", "circunspecto", "coetaneo", "colofon", "concomitante", "conjetura", "connivencia", "contumaz", "corolario", "deletereo", "detrimento", "diafano", "diletante", "dirimir", "disension", "dislate", "disquisicion", "dubitativo", "efimero", "egregio", "elucidar", "emolumento", "empirico", "encomio", "endemico", "enervar", "epitome", "esoterico", "espurio", "estolido", "etereo", "exabrupto", "exangue", "eximio", "exogeno", "exordio", "expiacion", "exultante", "falaz", "fatuo", "felonia", "futil", "garbo", "hedonismo", "hermetico", "histrionico", "ignoto", "impavido", "impenitente", "inane", "incolume", "indomito", "inefable", "inexorable", "inextricable", "inmarcesible", "insigne", "insipiente", "insolito", "inteligible", "intrinseco", "inverosimil", "irascible", "lascivo", "lenidad", "lugubre", "macula", "misantropo", "nitido", "obcecado", "obstinado"
            };
        }
        
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
        }
        
        System.out.println("\n¡Felicidades! Has adivinado la palabra: " + palabra);
        sc.close();
    }
}
