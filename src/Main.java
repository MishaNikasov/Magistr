public class Main {
    public static void main(String[] args) {
        Minus minus = new Minus(10,5);
        System.out.println(minus.toString());

        Cos cos = new Cos(35);
        System.out.println(cos.toString());
        System.out.println(cos.calculate());
        System.out.println(cos.differentiate());
    }
}
