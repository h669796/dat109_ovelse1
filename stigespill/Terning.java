import java.util.Random;

/**
 * Representerer en terning med 6 sider
 *
 * @author Mats Øinas
 */
public class Terning {
    private Integer verdi;
    private Random random;

    /**
     * Oppretter en ny terning
     */
    public Terning() {
        random = new Random();
        trill();
    }

    public Integer getVerdi() {
        return verdi;
    }

    /**
     * Triller terningen
     */
    public void trill() {
        verdi = new Random().nextInt(6) + 1;
    }


    public void setVerdi(int verdi) {
        this.verdi = verdi;
    }
}


