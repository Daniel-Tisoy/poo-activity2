
package dtisoy.ejercicio4;

/**
 *
 * @author dtisoy
 */

public class Trapezoid extends GeometricShapes {
    public double majorBase;
    public double minorBase;
    public double side1;
    public double side2;
    public double height;

    public Trapezoid(double majorBase, double minorBase, double side1, double side2, double height) {
        this.majorBase = majorBase;
        this.minorBase = minorBase;
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }


    @Override
    public double getArea() {
        return ((this.majorBase + this.minorBase) * this.height) / 2;
    }

    @Override
    public double getPerimeter() {
        return this.majorBase + this.minorBase + this.side1 + this.side2;
    }
}
