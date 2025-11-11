public class Ruote extends Thread{

    private int num_pezzi;

    /**
     * Costruttore della classe ruote.
     * Num_pezzi indica quanti pezzi (sostegno + ruote) l'utente vuole creare.
     */

    public Ruote(int num_pezzi){
        this.num_pezzi = num_pezzi;
    }

    /**
     * Fase 1 costruzione del sostegno per le ruote
     * Fase 2 assemblaggio delle ruote
     */
    //

    @Override
    public void run(){
        for(int i=0; i<num_pezzi; i++) {
            System.out.println("-Assemblaggio ruote iniziato!-");
            System.out.println("-Fase 1: costruzione sostegno ruote-");
            try {
                Thread.sleep(100);
            }catch(Exception e){
                throw new RuntimeException();
            }
            for (int j = 0; j < 4; j++) {
                System.out.println("-Fase 2: inserimento della ruota" + ++j +" al sostegno-");
                j--;
            }
        }
    }
}
