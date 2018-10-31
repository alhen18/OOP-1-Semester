package Modul15.Liang;

public class Triangle {

    public final double side1, side2, side3;


    public Triangle() {

        this.side1 = this.side2 = this.side3 = 1.0;
    }

    public Triangle(final double side1, final double side2, final double side3) throws IllegalAccessException {

        if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
            throw new IllegalAccessException();
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        final double semiPerimiter = getPerimeter() * 0.5;
        return Math.sqrt(semiPerimiter * (semiPerimiter - this.side1) * (semiPerimiter - this.side2) *
                (semiPerimiter - this.side3));
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        return "Triangle: side1 = 2 " + this.side1 + " side2 = " + this.side2 + " side3 = " + this.side3;
    }
}
