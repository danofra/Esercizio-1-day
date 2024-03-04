import java.util.Scanner;
public class esercizio2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Inserisci la prima stringa:");
            String string1 = scanner.nextLine();

            System.out.println("Inserisci la seconda stringa:");
            String string2 = scanner.nextLine();

            System.out.println("Inserisci la terza stringa:");
            String string3 = scanner.nextLine();

            String concatenazioneOrdineInserimento = string1 +" "+ string2 +" "+ string3;
            System.out.println("Concatenazione in ordine di inserimento: " + concatenazioneOrdineInserimento);

            String concatenazioneOrdineInserimentoInverso = string3 +" "+ string2 +" "+ string1;
            System.out.println("Concatenazione in ordine di inserimento inverso: " + concatenazioneOrdineInserimentoInverso);

            scanner.close();
        }
    }
