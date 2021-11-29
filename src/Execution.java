import java.util.ArrayList;
import java.util.List;

public class Execution {
    private List<Citizen> arraested = new ArrayList<Citizen>();

    public void addArrested(Citizen citizen) {
            arraested.add(citizen);
    }

    public void executeArrested() {
        for(Citizen c : arraested) {
            System.out.println(c.toString() + " отправляется на казнь\nказнь успешно состоялась\n");
        }
    }
}
