
package dtisoy.ejercicio4;

/**
 *
 * @author dtisoy
 */

public class Trapezoid extends GeometricShapes {
    private double majorBase;
    private double minorBase;
    private double side1;
    private double side2;
    private double height;

    public Trapezoid(double majorBase, double minorBase, double side1, double side2, double height) {
        this.majorBase = majorBase;
        this.minorBase = minorBase;
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }


    @Override
    public double getArea() {
        // Fórmula: ((Base Mayor + Base Menor) * altura) / 2
        return ((this.majorBase + this.minorBase) * this.height) / 2;
    }

    @Override
    public double getPerimeter() {
        // Suma de los cuatro lados exteriores
        return this.majorBase + this.minorBase + this.side1 + this.side2;
    }
}
