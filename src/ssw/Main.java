package ssw;

public class Main {

    public static void main(String[] args) {
        Ellipse ellipse = new Ellipse();
        Ellipse ellipse1 = new Ellipse();

        ellipse.setA(78);
        System.out.println(ellipse.getA());

        System.out.println(ellipse1.getA());

        System.out.println(ellipse1.Area());
        System.out.println(ellipse1.Perimeter());
    }
}
