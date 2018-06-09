public class Tanker extends Vessel {
    public Tanker(String name, double tonnage, double length, int crew, double value, double range) {
        super(name, tonnage, length, crew, value, range);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tanker, ");
        sb.append(super.toString());
        return sb.toString();
    }
}
