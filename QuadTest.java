
class Quadrilateral {
    int length, breadth;
    Quadrilateral() {
    }
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
    void area() {
        System.out.println("area of Rectangle is " + length * breadth);
    }
    void perimeter() {
        System.out.println("perimeter of Rectangle is " + 2 * (length + breadth));
    }
}
class Cube extends Quadrilateral {
    int height;
    Cube(int height)
    {
        this.height = height;
    }
    void volume() {
        System.out.println("valume of Cube is " + height * height * height);
    }
    void display() {
        System.out.println("height of cube is " + this.height);
    }
}
public class QuadTest {
    public static void main(String[] args) {
        //Quadrilateral obj = new Quadrilateral(12,20);
        Rectangle R1 = new Rectangle(12, 2);
        Rectangle R2 = new Rectangle(23, 45);
        Cube C1 = new Cube(12);
        Cube C2 = new Cube(12);

        System.out.println("_________________________________________________________");

        R1.area();
        R1.perimeter();
        R1.display();

        System.out.println("_________________________________________________________");

        R2.area();
        R2.perimeter();
        R2.display();

        System.out.println("_________________________________________________________");

        C1.volume();
        C1.display();

        System.out.println("_________________________________________________________");

        C2.volume();
        C2.display();




    }
}
