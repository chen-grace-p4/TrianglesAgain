public class PointTester {
  public static void main(String[]args) {
    //TESTING FOR POINT CLASS
    // Point p1 = new Point(0,0);
    // Point p2 = new Point(5,0);
    // Point p1 = new Point(0,0);
    // Point p2 = new Point(-5.4,0);
    //
    // System.out.println(p1.distanceTo(p2));
    // ^^should be 5 with 0,0 and 5,0 and 5.4 with 0,0 and -5.4,0

    // Point p1 = new Point (5,5);
    // Point p2 = new Point (5,5);
    // Point p3 = new Point (-5, 4.2);
    // System.out.println(p1.equals(p2)); // should be true
    // System.out.println(p1.equals(p3)); // shoud be false

    //TESTER FOR TRIANGLE CLASS
    Point p1 = new Point(0,0);
    Point p2 = new Point(1,0);
    Point p3 = new Point(0,1);
    Point newp = new Point (0,2);

    Triangle a = new Triangle(p1, p2, p3);
    // System.out.println(a.getPerimeter()); // should be around 3.414
    // System.out.println(a.getArea()); // should be 0.5
    // System.out.println(a.classify()); // should be isosceles
    // System.out.println(a.toString()); // should be "v1(0,0) v2(1,0) v3(0,1)"
    a.setVertex(2, newp);
    System.out.println(a.toString()); // should be "v1(0,0) v2(1,0) v3(0,2)"
    a.setVertex(0, newp);
    System.out.println(a.toString()); // should be "v1(0,2) v2(1,0) v3(0,2)"
  }
}
