import java.util.Comparator;

public class VesselComparator implements Comparator<Vessel> {
    @Override
    public int compare(Vessel o1, Vessel o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getName(), o2.getName());
    }
}
