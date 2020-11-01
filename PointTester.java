public class PointTester {
  public static void main(String[]args) {
    // Point p1 = new Point(0,0);
    // Point p2 = new Point(5,0);
    Point p1 = new Point(0,0);
    Point p2 = new Point(-5.4,0);

    System.out.println(p1.distanceTo(p2));
    // ^^should be 5 with 0,0 and 5,0 and 5.4 with 0,0 and -5.4,0
  }
}
