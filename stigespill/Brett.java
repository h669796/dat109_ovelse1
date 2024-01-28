import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Representerer et stigespill brett
 *
 * @author Mats Øinas
 */

public class Brett {

    private List<Rute> ruter = new ArrayList<Rute>(100);
    private Map<Integer, Integer> ladders;
    private Map<Integer, Integer> snakes;

    /**
     * Oppretter brettet via konstruktør
     */

public Brett(){
    for(int i = 0; i < 100; i++){

        ruter.add(new Rute("Rute " + i, i));
    }
    settSlangerOgStiger();
}
public Rute getStartRute(){
    return ruter.get(0);
}
public List<Rute> getRuter(){
    return ruter;
}

public int checkSquare(int squareNumber){
    if(ladders.containsKey(squareNumber)){
        return ladders.get(squareNumber);
    }
    else if (snakes.containsKey(squareNumber)){
        return snakes.get(squareNumber);
    }

    return squareNumber;
}

private void settSlangerOgStiger(){
    ladders = new HashMap<>();
    snakes = new HashMap<>();

    ladders.put(3, 22);
    ladders.put(10, 28);
    ladders.put(80, 89);
    ladders.put(22, 35);
    ladders.put(40, 53);
    ladders.put(50, 64);
    ladders.put(60, 79);
    ladders.put(70, 88);

    snakes.put(17, 7);  // Snake from square 17 to 7
    snakes.put(90, 76);
    snakes.put(66, 49);  // Snake from square 17 to 7
    snakes.put(16, 2);
    snakes.put(75, 51);  // Snake from square 17 to 7
    snakes.put(33, 18);
    snakes.put(27, 13);  // Snake from square 17 to 7
    snakes.put(46, 32);
}


}
