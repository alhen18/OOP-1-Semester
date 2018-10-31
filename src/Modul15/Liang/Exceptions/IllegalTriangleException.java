package Modul15.Liang.Exceptions;

public class IllegalTriangleException extends Exception {

    public IllegalTriangleException() {
        super("Illegal Triangle. In a triangle, the sum of any two sides is greater than the other side!");
    }

}
