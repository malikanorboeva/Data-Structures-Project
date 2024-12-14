public class ChemElement implements Comparable<ChemElement> {
    private String name;
    private double density;

    public ChemElement(String name, double density) {
        this.name = name;
        this.density = density;
    }

    @Override
    public int compareTo(ChemElement other) {
        if (other == null) {
            throw new NullPointerException();
        }
        // Compare based on density
        return Double.compare(this.density, other.density);
    }

    @Override
    public String toString() {
        return name + " (" + density + ")";
    }
}
