package Shape;

import Point.Point2d;

import java.util.ArrayList;
import java.util.Collection;

public class Rectangle extends BaseShape {
    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(Double width, Double height) {

        super();
        double air = width*height;
        Collection<Point2d> points = new ArrayList<>();
        Point2d point1 = new Point2d(width/2 *-1, height/2);
        Point2d point2 = new Point2d(width/2 *-1, height/2 *-1);
        Point2d point3 = new Point2d(width/2, height/2);
        Point2d point4 = new Point2d(width/2, height/2*-1);
        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);
        addAll(points);
    }

    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {

    }

    /**
     * Create a rectangle from a given collection of Points
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {

    }

    /** TODO
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {
        return null;
    }
}
