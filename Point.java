public class Point {
  private double x,y;

  //construct a point given coordinates
  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  //construct a point given a point  (redundant , just provides flexibility)
  public Point(Point p){
    x= p.x;  //private access in the same file is allowed!
    y= p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public double distanceTo(Point other) {
    double otherX = other.getX();
    double otherY = other.getY();
    double thisX = this.getX();
    double thisY= this.getY();

    double distance = Math.sqrt( ((otherX - thisX)*(otherX - thisX)) + ((otherY - thisY)*(otherY - thisY)) );
    return distance;
  }

  public boolean equals(Point other) {
    return other.getX() == this.getX() && other.getY() == this.getY();
  }
}
