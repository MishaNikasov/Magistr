public class Tg extends Unar {

    public Tg(double value) {
        super(value);
    }

    @Override
    public double calculate() {
        return Math.tan(value);
    }

    @Override
    public double differentiate() {
        return Math.pow(Math.cos(value),2);
    }

    @Override
    public String toString() {
        return "Tg(" + value + ")";
    }
}