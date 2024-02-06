package Shape;

import Point.Point2d;

import java.util.Collection;

public class Ellipse extends BaseShape {
    /**
     * TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * @param widthDiameter  Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {
        super();
        Collection<Point2d> points = getCoords();
        double a = widthDiameter / 2;
        double b = heightDiameter / 2;
        double pixelSpacing = 0.5;
        double perimetre = 2 * Math.PI * Math.sqrt((a * a + b * b) / 2);
        int numPoints = (int) (perimetre / pixelSpacing);
        double dt = 2 * Math.PI / numPoints;

        for (double i = 0; i < 2 * Math.PI; i += dt) {
            double x = a * Math.cos(i);
            double y = b * Math.sin(i);
            points.add(new Point2d(x, y));
        }
        addAll(points);

    }

    /**
     * TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        super();
        Ellipse ellipse = new Ellipse(dimensions.X(), dimensions.Y());
        addAll(ellipse.getCoords());
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        super(coords);
    }

    /**
     * TODO
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        return new Ellipse(getCoords().stream().map(Point2d::clone).toList());
    }
}
