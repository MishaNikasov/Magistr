public class Ln extends Function{

    public Ln(double value) {
        super(value);
    }

    @Override
    public double calculate() {
        return Math.log(value);
    }

    @Override
    public double differentiate() {
        return 1/value;
    }

    @Override
    public String toString() {
        return "Ln(" + value + ")";
    }
}
