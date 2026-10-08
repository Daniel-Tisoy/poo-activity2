
package dtisoy.ejercicio4;

/**
 *
 * @author dtisoy
 */
public class Square extends GeometricShapes {

    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(this.side, 2);
    }

    @Override
    public double getPerimeter() {
        return this.side * 4;
    }

}
