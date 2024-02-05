package Shape;

import Point.Point2d;

import java.util.Collection;

public class Rectangle extends BaseShape {
    /**
     * TODO
     * Create a filled rectangle centered on (0, 0)
     * @param width  Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(Double width, Double height) {
        super();
        Collection<Point2d> points = getCoords();
        int numXPoints = (int) (width / 0.5);
        int numYPoints = (int) (height / 0.5);

        double firstX = -width / 2.0 + 0.5 / 2.0;
        double firstY = -height / 2.0 + 0.5 / 2.0;
        for (int i = 0; i < numXPoints; i++) {
            for (int j = 0; j < numYPoints; j++) {
                double x = firstX + i * 0.5;
                double y = firstY + j * 0.5;
                points.add(new Point2d(x, y));
            }
        }
        addAll(points);
    }

    /**
     * TODO
     * Create a filled rectangle centered on (0, 0)
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {
        super();
        Rectangle rectangle = new Rectangle(dimensions.X(), dimensions.Y());
        addAll(rectangle.getCoords());
    }

    /**
     * Create a rectangle from a given collection of Points
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {
        super(coords);
    }

    /**
     * TODO
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {
        return new Rectangle(getCoords().stream().map(Point2d::clone).toList());
    }
}
