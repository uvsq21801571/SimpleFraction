public class Fraction {
    private int numerator;
    private int enumerator;
    public Fraction(int numerator, int enumerator) {
        this.numerator = numerator;
        this.enumerator = enumerator;
    }
    public Fraction() {
        numerator = enumerator = 0;
    }
    @Override
    public String toString() {
        return numerator + "/" + enumerator;
    }
}
