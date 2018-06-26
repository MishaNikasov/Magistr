public class Multi extends Binar {

    public Multi(double firstValue, double secondValue) {
        super(firstValue, secondValue);
    }

    @Override
    public double calculate() {
        return firstValue * secondValue;
    }

    @Override
    public double differentiate() {
        return 0;
    }

    @Override
    public String toString() {
        return "" + firstValue + " * " + secondValue;
    }
}