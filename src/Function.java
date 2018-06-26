public abstract class Function {

    protected double value;

    public Function(double value) {
        this.value = value;
    }


    public abstract double calculate();
    public abstract double differentiate();
}
