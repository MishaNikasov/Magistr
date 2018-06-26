public class Const extends Function{

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