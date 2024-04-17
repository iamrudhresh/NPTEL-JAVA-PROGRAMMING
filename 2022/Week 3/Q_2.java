
class Point{
  double x;
  double y;

public static void distance(Point p1,Point p2){
        double d;
	  d=Math.sqrt((p2.x-p1.x)*(p2.x-p1.x) + (p2.y-p1.y)*(p2.y-p1.y));
	  System.out.println(d);
  }	
}  