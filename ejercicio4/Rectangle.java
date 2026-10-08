package dtisoy.ejercicio4;

/**
 *
 * @author dtisoy
 */
public class Rectangle extends GeometricShapes {

    int base;
    int height;

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.base * this.height;
    }

    @Override
    public double getPerimeter() {
        return this.base * 2 + this.height * 2;
    }

}
