public class Ctg extends Unar {

    public Ctg(double value) {
        super(value);
    }

    @Override
    public double calculate() {
        return 1.0 / Math.tan(value);
    }

    @Override
    public double differentiate() {
        return Math.pow(Math.sin(value),2)*(-1);
    }

    @Override
    public String toString() {
        return "Ctg(" + value + ")";
    }
}