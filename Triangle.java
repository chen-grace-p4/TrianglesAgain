public class Triangle {
  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1,double x2, double y2,double x3, double y3) {
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }

  public double getPerimeter() {
    double length1 = v1.distanceTo(v2);
    double length2 = v1.distanceTo(v3);
    double length3 = v2.distanceTo(v3);
    return length1 + length2 + length3;
  }

  public double getArea() {
    double semi = this.getPerimeter() / 2.0;
    double lengthA = v1.distanceTo(v2);
    double lengthB = v1.distanceTo(v3);
    double lengthC = v2.distanceTo(v3);

    double area =  Math.sqrt( semi * (semi-lengthA) * (semi-lengthB) * (semi-lengthC));
    return area;
  }
}
