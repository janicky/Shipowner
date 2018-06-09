import java.util.ArrayList;
import java.util.List;

public class Shipowner implements Collection<Vessel> {

    private List<Vessel> vessels = new ArrayList<Vessel>();

    public boolean add(Vessel element) {
        return vessels.add(element);
    }

    public boolean delete(Vessel element) {
        return vessels.remove(element);
    }

    public List<Vessel> getAll() {
        return vessels;
    }

    public Vessel getShip(int index) {
        return vessels.get(index);
    }
}
