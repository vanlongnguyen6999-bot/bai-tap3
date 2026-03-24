public class TestCircle {
    public static void main(String[] args){
        Circle c1 = new Circle();
        System.out.println("Circle 1: " + "radius = " + c1.getRadius() + " Area = " + c1.getArea());
        Circle c2 = new Circle(5);
        System.out.println("Circle 1: " + "radius = " + c2.getRadius() + " Area = " + c2.getArea());
    }
}
