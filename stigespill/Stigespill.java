import java.lang.reflect.Array;
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

//    public void spill(){
//        for(int runde = 0; runde < 20; runde++){
//            for(Spiller spiller : spillere){
//                spiller.spillTrekk(Terning);
//            }
//        }
//    }

}
