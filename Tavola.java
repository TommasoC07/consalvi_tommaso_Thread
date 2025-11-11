public class Tavola extends Thread{

    private int num_pezzi;

    /**
     * Costruttore della classe tavola.
     * Num_pezzi indica quanti pezzi l'utente vuole creare.
     */

    public Tavola(int num_pezzi){
        this.num_pezzi = num_pezzi;
    }

    /**
     * Fase 1 lavorazione del legno
     * Fase 2 verniciatura del legno
     */

    @Override
    public void run(){

        for(int i=0; i<num_pezzi; i++) {
            System.out.println("-Costruzione tavola-");
            System.out.println("-Fase 1: lavorazione del legno-");
            try {
                Thread.sleep(100);
            }catch(Exception e){
                throw new RuntimeException();
            }
            System.out.println("-Fase 2: verniciatura della tavola-");
            try {
                Thread.sleep(100);
            }catch(Exception e){
                throw new RuntimeException();
            }

        }
    }
}
