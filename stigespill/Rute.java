/** Representerer en rute på stigespill brettet
 *
 * @Author Mats Øinas
 */

public class Rute {
    private String navn;


    /**
     * Oppretter en ny rute
     *
     * @param navn
     */

    public Rute(String navn){
        this.navn = navn;
    }

    public String getNavn(){
        return navn;
    }

    /**
     * Finner rute en brikke skal flyttes til
     *
     * @param sum hvor langt en brikke skal flyttes
     */
    public void flytt(Integer sum){

    }
}
