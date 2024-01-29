import java.util.ArrayList;

/**
 * Representerer stigespill spillet
 */
public class Stigespill {
    private ArrayList<Spiller> spillere = new ArrayList<>();
    private Terning terning = new Terning();
    private Brett brett = new Brett();

    /**
     * Oppretter spillet
     *
     * @param antallSpillere
     */
    public Stigespill(final Integer antallSpillere){
        for(int i = 0; i < antallSpillere; i++){
            spillere.add(new Spiller("Spiller " + i, brett));
        }
    }

    /**
     * Starter spillet, og bruker en flag variabel til å avslutte det
     *
     */
    public void spill(){
        boolean spillSlutt = false;

    while(!spillSlutt)
        for(Spiller spiller : spillere){
            spiller.spillTrekk(terning);

            if(spiller.harVunnet()){
                System.out.println(spiller.getNavn() + " har vunnet stigespillet!");
                spillSlutt = true;
                break;
            }
        }
    }


    public int getAntallSpillere() {
        return spillere.size();
    }

    public ArrayList<Spiller> getSpillere() {
        return spillere;
    }

}
