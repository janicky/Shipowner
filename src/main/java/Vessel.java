public class Vessel implements Comparable<Vessel> {

    private String name;
    private double tonnage;
    private double length;
    private int crew;
    private double value;
    private double range;

    public Vessel(String name, double tonnage, double length, int crew, double value, double range) {
        this.name = name;
        this.tonnage = tonnage;
        this.length = length;
        this.crew = crew;
        this.value = value;
        this.range = range;
    }

    public double getLength() {
        return length;
    }

    public String getName() {
        return name;
    }

    public double getTonnage() {
        return tonnage;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    @Override
    public int compareTo(Vessel other) {
        return Double.compare(length, other.getLength());
    }
}
