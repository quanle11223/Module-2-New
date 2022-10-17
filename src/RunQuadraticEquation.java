import java.util.Scanner;

public class RunQuadraticEquation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDelta() > 0) {
            System.out.println("Phương trình có 2 nghiệm: " + quadraticEquation.getRoot1() + " và " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDelta() == 0) {
            System.out.println("Phương trình có 1 nghiệm: " + quadraticEquation.getDiscriminant());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
