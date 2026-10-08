package dtisoy.ejercicio4;

/**
 *
 * @author dtisoy
 */
public class RightTriangle extends GeometricShapes {

    int base;
    int height;
    private final double hypotonuse;

    public RightTriangle(int base, int height) {
        this.base = base;
        this.height = height;
        
        this.hypotonuse = this.getHypetonuse();
    }

    @Override
    public double getArea() {
        return this.base * this.height / 2;
    }

    @Override
    public double getPerimeter() {
        return this.base + this.height + this.hypotonuse;
    }

    public double getHypetonuse() {
        double cc = Math.pow(this.base, 2) + Math.pow(this.height, 2);
        return Math.pow(cc, 1 / 2);
    }

    public void determineTriangleType() {
        // it's impossible to get a equilateral right triangle
        if ((this.base != this.height) && (this.base != this.hypotonuse) && (this.height != this.hypotonuse)) {
            System.out.println("It's an scalene triangle'");

        } else {
            System.out.println("It's an isosceles triangle'");

        }
    }
}
