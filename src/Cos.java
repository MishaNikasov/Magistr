public class Cos extends Function{

    public Cos(double value) {
        super(value);
    }

    @Override
    public double calculate() {
        return Math.cos(value);
    }

    @Override
    public double differentiate() {
        return Math.sin(value)*(-1);
    }

    @Override
    public String toString() {
        return "Cos(" + value + ")";
    }
}
