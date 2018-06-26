public class Exp extends Unar {

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