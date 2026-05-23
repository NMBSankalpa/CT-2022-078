import java.util.Scanner;

class Circle{

    double radius;

    final double PI = 3.14;

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double computeArea(double radius){

       return PI * radius * radius;
    }

    public double computeCircumference(double radius){
        return  2 * PI * radius;
    }
}

public class Q3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the outer circle radius: ");
        double ro = scanner.nextDouble();
        System.out.println("Enter the inner circle radius: ");
        double ri = scanner.nextDouble();

        Circle outer_circle = new Circle();
        Circle inner_circle = new Circle();

        double area_outer_circle = outer_circle.computeArea(ro);
        double area_inner_circle = inner_circle.computeArea(ri);

        System.out.println("Area of shaded circle part: " + (area_outer_circle - area_inner_circle));

        double outer_circumference = outer_circle.computeCircumference(ro);
        double inner_circumference = inner_circle.computeCircumference(ri);

        System.out.println("circumference is : "+ (outer_circumference - inner_circumference));
    }
}
