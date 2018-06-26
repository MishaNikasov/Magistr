public class Const extends Unar {

    public Const(double value) {
        super(value);
    }

    @Override
    public double calculate() {
        return value;
    }

    @Override
    public double differentiate() {
        return 0;
    }

    @Override
    public String toString() {
        return "Const(" + value + ")";
    }
}