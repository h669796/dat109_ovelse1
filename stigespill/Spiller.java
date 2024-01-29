/**
 * Representerer en spiller i stigespillet
 *
 * @author Mats Øinas
 */
public class Spiller {//test
    private String navn;
    Brikke brikke = new Brikke();
    private Brett brett;
    private int consecutiveSixes;
    private boolean trengerSekser;


    /**
     * Oppretter en ny spiller
     *
     * @param navn Navn på spiller
     * @param brett brettet spilleren tilhører
     * @param consecutiveSixes er for å holde orden på antall seksere i en runde
     * @param trengerSekser variabel som sier om han har rullet 3 seksere på rad eller ikke
     */
    public Spiller(String navn, Brett brett){
        this.navn = navn;
        this.brett = brett;
        this.brikke.setRute(brett.getRuter().get(0));
    }

    public String getNavn(){
        return navn;
    }
    public boolean trengerSekser(){
        return trengerSekser;
    }
    public void setTrengerSekser(boolean flag){
        trengerSekser = flag;
    }



    public int rollDice(Terning terning) {
        int totalRoll = 0;
        int roll;
        int consecutiveSixes = 0;

        do {
            terning.trill();
            roll = terning.getVerdi();
            totalRoll += roll;

            if (roll == 6) {
                consecutiveSixes++;
            } else {
                consecutiveSixes = 0;
            }

            if (consecutiveSixes == 3) {
                setTrengerSekser(true);
                brikke.setRute(brett.getRuter().get(0));
                return 18;
            }
        } while (roll == 6);

        return totalRoll;
    }

    public void movePlayer(int totalRoll) {
        if (trengerSekser()) {
            if (totalRoll == 6) {
                setTrengerSekser(false);
                brikke.setRute(brett.getRuter().get(6));
            }
            return;
        }

        int currentRuteIndex = brett.getRuter().indexOf(brikke.getRute());
        System.out.println("Current Position: " + currentRuteIndex + ", Roll: " + totalRoll);

        int newRuteIndex = currentRuteIndex + totalRoll;

        // Check if there are ladders or snakes at the new position
        newRuteIndex = brett.checkSquare(newRuteIndex);
        System.out.println("New Position After checkSquare: " + newRuteIndex);

        brikke.setRute(brett.getRuter().get(newRuteIndex));
    }

    public void spillTrekk(Terning terning){
        int totalRoll = rollDice(terning);
        System.out.println(navn + " triller: " + totalRoll);

        if(consecutiveSixes == 3){
            System.out.println(navn + " triller tre seksere og går tilbake til start");
            setTrengerSekser(true);
            brikke.setRute(brett.getRuter().get(0));
            consecutiveSixes = 0;
        } else {
            movePlayer(totalRoll);
            System.out.println(navn + " beveger seg til rute " + brikke.getRute().getIndex());
        }
    }

    public boolean harVunnet(){
        return brikke.getRute().getIndex() >= 99;
    }

}




