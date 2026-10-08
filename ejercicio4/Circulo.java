
package dtisoy.ejercicio4;

/**
 *
 * @author dtisoy
 */
public class Circulo extends GeometricShapes {
    int radius;

    public Circulo(int radius) {
        this.radius = radius;
    }
        
    @Override
    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
    
    @Override
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }
}
