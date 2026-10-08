package dtisoy.ejercicio4;

/**
 *
 * @author dtisoy
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        // D=8, d=6; a=5
        Rhombus rhombus = new Rhombus(8, 6, 5);

        Circulo circle = new Circulo(5);

        Square square = new Square(4);

        RightTriangle rightTriangle = new RightTriangle(3, 4);
        RightTriangle rightTriangleIso = new RightTriangle(10, 10);

        // base = 6, height = 8
        Rectangle rectangle = new Rectangle(6, 8);

        System.out.println("=== CIRCLE ===");
        System.out.println("AREA: " + circle.getArea());
        System.out.println("PERIMETER: " + circle.getPerimeter());
        System.out.println();

        System.out.println("=== SQUARE ===");
        System.out.println("AREA: " + square.getArea());
        System.out.println("PERIMETER: " + square.getPerimeter());
        System.out.println();

        System.out.println("=== RIGHT TRIANGLE ===");
        System.out.println("AREA: " + rightTriangle.getArea());
        System.out.println("PERIMETER: " + rightTriangle.getPerimeter());
        rightTriangle.determineTriangleType();
        System.out.println();

        System.out.println("======");
        System.out.println("AREA: " + rightTriangleIso.getArea());
        System.out.println("PERIMETER: " + rightTriangleIso.getPerimeter());
        rightTriangleIso.determineTriangleType();
        System.out.println();

        System.out.println("=== RECTANGLE ===");
        System.out.println("AREA: " + rectangle.getArea());
        System.out.println("RECTANGLE: " + rectangle.getPerimeter());
        System.out.println();

        System.out.println("=== RHOMBUS ===");
        System.out.println("AREA: " + rhombus.getArea());
        System.out.println("PERIMETER: " + rhombus.getPerimeter());
    }
}
