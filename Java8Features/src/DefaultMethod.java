interface ShapeMethods {
    void area();
    default void defaultDraw() {
        System.out.println("Drawing a shape");
    }
}

class Circle implements ShapeMethods {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public void area() {
        System.out.println("Area of this circle is: " + Math.PI * radius * radius);
    }

    public void defaultDraw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle implements ShapeMethods {
    double width;
    double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public void area() {
        System.out.println("Area of this rectangle is: " + width*height);
    }
}

public class DefaultMethod {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        c.area();
        c.defaultDraw();
        Rectangle r = new Rectangle(2,5);
        r.area();
        r.defaultDraw();
    }
}
