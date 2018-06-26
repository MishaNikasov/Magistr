public class Exp extends Function{

    public Exp(double value) {
        super(value);
    }

    @Override
    public double calculate() {
        return Math.exp(value);
    }

    @Override
    public double differentiate() {
        return Math.exp(value);
    }

    @Override
    public String toString() {
        return "Exp(" + value + ")";
    }
}