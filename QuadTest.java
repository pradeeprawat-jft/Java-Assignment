class Quadrilateral {
    int length, breadth;
    Quadrilateral(int l, int b) {
        length = l;
        breadth = b;
    }
    void display() {
        System.out.println("length is " + length);
        System.out.println("breadth is " + breadth);
    }
}
class Rectangle extends Quadrilateral {
    Rectangle(int l, int b) {
        super(l, b);
    }
    int area() {

        return length * breadth;
    }
    int perimeter() {
        return 2 * (length + breadth);
    }
}
class Cuboid extends Quadrilateral {
    int height;

    Cuboid(int height, int length, int breadth) {
        super(length, breadth);
        this.height = height;
    }

    int volume() {
        return height * length * breadth;
    }

    void display() {
        System.out.println("height of Cuboid is " + this.height);
        System.out.println("length of Cuboid is " + length);
        System.out.println("breadth of Cuboid is " + breadth);
    }
}

public class QuadTest {
    public static void main(String[] args) {
        //Quadrilateral obj = new Quadrilateral(12,20);
        Rectangle R1 = new Rectangle(12, 2);
        Rectangle R2 = new Rectangle(23, 45);
        Cuboid C1 = new Cuboid(12, 20, 30);
        Cuboid C2 = new Cuboid(12, 40, 10);

        System.out.println("_________________________________________________________");

        System.out.println("Area of Rectangle " + R1.area());
        System.out.println("perimeter of Rectangle " + R1.perimeter());
        R1.display();

        System.out.println("_________________________________________________________");

        System.out.println("Area of Rectangle " + R2.area());
        System.out.println("perimeter of Rectangle " + R2.perimeter());
        R2.display();

        System.out.println("_________________________________________________________");

        System.out.println("Volume of Cuboid " + C1.volume());
        C1.display();

        System.out.println("_________________________________________________________");

        System.out.println("Volume of Cuboid " + C2.volume());
        C2.display();
    }
}
