public class Sin extends Unar {

    public Sin(double value) {
        super(value);
    }

    @Override
    public double calculate() {
        return Math.sin(value);
    }

    @Override
    public double differentiate() {
        return Math.cos(value);
    }

    @Override
    public String toString() {
        return "Sin(" + value + ")";
    }
}
