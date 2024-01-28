/** Representerer en rute på stigespill brettet
 *
 * @Author Mats Øinas
 */

public class Rute {
    private String navn;
    private int index;


    /**
     * Oppretter en ny rute
     *
     * @param navn
     */

    public Rute(String navn, int index){
        this.index = index;
        this.navn = navn;
    }

    public String getNavn(){
        return navn;
    }
    public int getIndex(){
        return index;
    }

    /**
     * Finner rute en brikke skal flyttes til
     *
     * @param sum hvor langt en brikke skal flyttes
     */

}
