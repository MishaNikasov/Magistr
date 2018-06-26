import java.util.List;

public class Polynomial {

    private final List<Double> coefficients;

    public Polynomial(List<Double> coefficients) {
        this.coefficients = coefficients;
    }

    public double getCoefficient(int power) {
        if (power >= coefficients.size()) {
            return 0;
        }
        return coefficients.get(power);
    }

    @Override
    public String toString() {
        return "Polynomial{" +
                "coefficients=" + coefficients +
                '}';
    }
}

