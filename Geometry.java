/**
 * Here are some useful Geometry formulas to demonstrate how functions can return values.
 * Also look at the Java Docs.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Geometry 
{
    /**
     * Calculates the area of a parallelogram.
     *
     * @param b  length of base of parallelogram
     * @param h  height of the parallelogram
     * @return   area of the parallelogram
     */
    public static double parallelogramArea(double length, double width) 
    {
        return length * width;
    }
    
    /**
     * Calculates the area of a triange.
     *
     * @param b  length of base of triangle
     * @param h  height of the triangle
     * @return   area of the triangle
     */
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    /**
     * Calculates the area of a trapezoid.
     * @param base1 length of the first base
     * @param base2 length of the second base
     * @return area of the trapezoid
     */
    public static double trapezoidArea(double baseA, double baseB, double height)
    {
        double area = ((baseA * baseB) / 2.0) * height;
        return area;
    }
    /**
     * Calculates the volume of a rectangular prism.
     * @param length length of the prism
     * @param width width of the prism
     * @param height height of the prism
     * @return volume volume of the prism
     */
    public static double rectangleVolume(double length, double width, double height)
    {
        double volume = length * height * width;
        return volume;
    }
     /**
     * Calculates the volume of a cone.
     * @param radius radius of the base of the cone
     * @param height height of the cone
     * @return volume volume of the cone
     */
    public static double coneVolume(double radius, double height)
    {
      double volume = Math.PI * (Math.pow(radius, 2)) * (height/3);
      return volume;
    }
    /**
     * Calculates the surface area of a rectangular prism.
     * @param length length of the prism
     * @param width width of the prism
     * @param height height of the prism
     * @return sArea surface area of the prism
     */
    
    public static double rectangleSArea(double length, double width, double height)
    {
        double sArea = 2 * ((length* width) * (width * height) * (height * length));
        return sArea;
    }
    /**
     * Calculates the surface area of a sphere.
     * @param radius radius of the sphere
     * @return sArea surface area of the sphere
     */
    public static double sphereSArea(double radius)
    {
        double sArea = 4 * Math.PI * Math.pow(radius, 2);
        return sArea;
    }
    /**
     * Calculates the hypotenuse of a right triangle.
     * @param leg1 length of the first leg
     * @param leg2 length of the second leg
     * @return hypotenuse the hypotenuse of the triangle
     */
    public static double hyp(double leg1, double leg2)
    {
        double hypotenuse = Math.pow(leg1, 2) + Math.pow(leg2, 2);
        return Math.sqrt(hypotenuse);
    }
     /**
     * Calculates the distance between 2 points.
     * @param x1 first x value
     * @param x2 second x value
     * @param y1 first y value
     * @param y2 second y value
     * @return distance distance between the points
     */
    public static double distance(double x1, double x2, double y1, double y2)
    {
        double distance = Math.pow((y1-y2), 2) + Math.pow((x1-x2), 2);
        return Math.sqrt(distance);
    }
     /**
     * Calculates the slope between 2 points.
     * @param x1 first x value
     * @param x2 second x value
     * @param y1 first y value
     * @param y2 second y value
     * @return slope slope between the points
     */
    public static double slope(double x1, double x2, double y1, double y2)
    {
        double slope = (y2-y1) / (x2-x1);
        return slope;
    }
    /**
     * Calculates the area of a triangle.
     * @param a side a
     * @param b side b
     * @param c side c
     * @return area area of the triangle
     */
    public static double triangleArea2(double a, double b, double c)
    {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        return area;
    }
    public static void main(String[] args) 
    {
        double ta1 = triangleArea(4.2, 8.1);
        double ta2 = triangleArea(3.0, 123.157);
        double tra1 = trapezoidArea(2.0, 3.4, 4.8);
        double rv1 = rectangleVolume(2.231, 5.3123, 6.234);
        double cv1 = coneVolume(22.9, 44.5);
        double rSa1 = rectangleSArea(2.312, 5643, 23.4);
        double sSa1 = sphereSArea(1231.54);
        double hyp1 = hyp(1231.4, 124.2);
        double dist1 = distance (1.23, 54.3, 8.654, 653.3);
        double slope1 = slope(234.12, 43124.1, 124124.1, 66.4);
        double triA1 = triangleArea2(341.4, 431.3, 321.2);
        
        
        
        System.out.println(ta1);
        System.out.println(ta2);
        System.out.println(tra1);
        System.out.println(rv1);
        System.out.println(cv1);
        System.out.println(rSa1);
        System.out.println(sSa1);
        System.out.println(hyp1);
        System.out.println(dist1);
        System.out.println(triA1);
        
    }
}
