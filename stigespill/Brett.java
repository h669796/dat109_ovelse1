import java.util.ArrayList;
import java.util.List;

/**
 * Representerer et stigespill brett
 *
 * @author Mats Øinas
 */

public class Brett {

    private List<Rute> ruter = new ArrayList<Rute>(100);

    /**
     * Oppretter brettet via konstruktør
     */

public Brett(){
    ruter.add(new Rute("Start"));
    for(int i = 0; i < 100; i++){
        ruter.add(new Rute("Rute " + i));
    }
}
public Rute getStartRute(){
    return ruter.get(0);
}
public List<Rute> getRuter(){
    return ruter;
}


}
