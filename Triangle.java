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

  public String classify() {
    double lengthA = v1.distanceTo(v2);
    double lengthB = v1.distanceTo(v3);
    double lengthC = v2.distanceTo(v3);

    double length1 = Math.round(lengthA*10000) / 10000.0;
    double length2 = Math.round(lengthB*10000) / 10000.0;
    double length3 = Math.round(lengthC*10000) / 10000.0;

    if (length1 == length2 && length2 == length3) {
        return "equilateral";
    } else if (length1 == length2 || length1 == length3 || length2 == length3) {
      return "isosceles";
    } else {
      return "scalene";
    }
  }

  public String toString() {
    double p1x = v1.getX();
    double p1y = v1.getY();

    double p2x = v2.getX();
    double p2y = v2.getY();

    double p3x = v3.getX();
    double p3y = v3.getY();

    String retstring = "";
    retstring += "v1(" + p1x + ", " + p1y + ") ";
    retstring += "v2(" + p2x + ", " + p2y + ") ";
    retstring += "v3(" + p3x + ", " + p3y + ")";
    return retstring;
  }

  public void setVertex(int index, Point newP) {
    if (index == 0) {
      v1 = newP;
    }
    if (index == 1) {
      v2 = newP;
    }
    if (index == 2) {
      v3 = newP;
    }
  }

}
