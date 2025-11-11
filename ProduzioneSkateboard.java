import  java.util.*;

/**
 * Classe ProduzioneSkateboard(Main) avvia i thread e aspetta che terminino per poi "assemblare" i pezzi
 * @author Tommaso
 */

public class ProduzioneSkateboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserire il numero di skateboard da assemblare");
        int num_pezzi = scanner.nextInt();
        Ruote ruote = new Ruote(num_pezzi);
        Tavola tavola = new Tavola(num_pezzi);

        ruote.start();
        tavola.start();

        try {
            ruote.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            tavola.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("-Fase 3: assemblaggio delle ruote con tavola-");
        System.out.println("-Produzione completata-");

    }
}