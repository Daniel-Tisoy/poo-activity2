package dtisoy.ejercicio4;

/**
 *
 * @author dtisoy
 */
public class Rhombus extends GeometricShapes {

    int majorDiagonal;
    int minorDiagonal;
    int side;

    public Rhombus(int majorDiagonal, int minorDiagonal, int side) {
        this.majorDiagonal = majorDiagonal;
        this.minorDiagonal = minorDiagonal;
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.majorDiagonal * this.minorDiagonal / 2.0;
    }

    @Override
    public double getPerimeter() {
        return 4.0 * this.side;
    }
}
