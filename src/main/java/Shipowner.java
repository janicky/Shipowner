import java.util.ArrayList;
import java.util.List;

public class Shipowner implements Collection<Vessel> {

    private List<Vessel> vessels = new ArrayList<Vessel>();

    public boolean add(Vessel element) {
        return false;
    }

    public boolean delete(Vessel element) {
        return false;
    }

    public List<Vessel> getAll() {
        return null;
    }

    public Vessel getShip(int index) {
        return null;
    }
}
