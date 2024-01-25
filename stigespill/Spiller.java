/**
 * Representerer en spiller i stigespillet
 *
 * @author Mats Øinas
 */

public class Spiller {//test
    private String navn;
    private Brikke brikke = new Brikke();
    private Brett brett;
    private int consecutiveSixes;

    /**
     * Oppretter en ny spiller
     *
     * @param navn Navn på spiller
     * @param brett brettet spilleren tilhører
     */
    public Spiller(String navn, Brett brett){
        this.navn = navn;
        this.brett = brett;
    }
    public void spillTrekk(Terning terning){
        terning.trill();
        int roll = terning.getVerdi();

        if(roll == 6){
            consecutiveSixes++;
            if(consecutiveSixes == 3){
                brikke.setRute(brett.getStartRute());
                consecutiveSixes = 0;
            } else {
                spillTrekk(terning);
            }
        } else {

            int currentRuteIndex = brett.getRuter().indexOf(brikke.getRute());
            int newRuteIndex = Math.min(currentRuteIndex + roll, 99);
            brikke.setRute(brett.getRuter().get(newRuteIndex));
            consecutiveSixes = 0;
        }
    }
    public String getNavn(){
        return navn;
    }
}
