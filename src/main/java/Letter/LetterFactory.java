package Letter;

import Point.Point2d;
import Shape.*;

import java.util.ArrayList;
import java.util.Collection;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /**
     * TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A() {
        double angleRotation = 196.0;
        Rectangle rectangle = new Rectangle(halfStripeThickness, maxHeight);
        rectangle.rotate(rectangle.getCoords(), Math.toRadians(-angleRotation));
        rectangle.translate(rectangle.getCoords(), new Point2d(halfMaxWidth / 2.6, 0.0));
        Rectangle rectangle1 = new Rectangle(halfStripeThickness, maxHeight);
        rectangle1.rotate(rectangle1.getCoords(), Math.toRadians(angleRotation));
        rectangle1.translate(rectangle1.getCoords(), new Point2d(-halfMaxWidth, 0.0));
        Rectangle rectangle2 = new Rectangle(maxWidth, halfStripeThickness);
        rectangle2.translate(rectangle2.getCoords(), new Point2d(-12.0, 20.0));
        BaseShape A = new BaseShape();
        return A.add(rectangle).add(rectangle2).add(rectangle1);
    }

    /**
     * TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {

        Rectangle rectangle = new Rectangle(halfStripeThickness, maxHeight);
        Ellipse topEllipse = new Ellipse(stripeThickness * 1.5, halfMaxHeight);
        topEllipse.translate(topEllipse.getCoords(), new Point2d(halfMaxWidth - stripeThickness, halfMaxHeight * 0.5));

        Ellipse bottomEllipse = new Ellipse(stripeThickness * 1.5, halfMaxHeight);
        bottomEllipse.translate(bottomEllipse.getCoords(), new Point2d(halfMaxWidth - stripeThickness, -halfMaxHeight * 0.5));

        BaseShape B = new BaseShape();
        return B.add(rectangle).add(topEllipse).add(bottomEllipse);
    }


    /**
     * TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        Ellipse grosEllipse = new Ellipse(maxWidth, maxHeight);
        Ellipse petitEllipse = new Ellipse(halfMaxWidth, halfMaxHeight);
        Rectangle rectangle = new Rectangle(maxWidth, halfMaxHeight);
        rectangle.translate(rectangle.getCoords(), new Point2d(halfMaxWidth / 2, 0.0));
        BaseShape C = new BaseShape();
        return C.add(grosEllipse).remove(petitEllipse).remove(rectangle);
    }

    /**
     * TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        Rectangle vertical = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle horizontale1 = new Rectangle(maxWidth, halfStripeThickness);
        Rectangle horizontale2 = horizontale1.clone();
        Rectangle horizontale3 = horizontale1.clone();
        horizontale1.translate(horizontale1.getCoords(), new Point2d(halfMaxWidth, halfMaxHeight - halfStripeThickness / 2));
        horizontale2.translate(horizontale2.getCoords(), new Point2d(halfMaxWidth, -halfMaxHeight + halfStripeThickness / 2));
        horizontale3.translate(horizontale3.getCoords(), new Point2d(halfMaxWidth, 0.0));
        BaseShape E = new BaseShape();
        return E.add(vertical).add(horizontale1).add(horizontale2).add(horizontale3);

    }

    /**
     * TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        Rectangle rectangle = new Rectangle(halfStripeThickness, maxHeight);
        BaseShape newRect = new BaseShape(rectangle.translate(rectangle.getCoords(), new Point2d(-halfMaxWidth, 0.0)));
        Rectangle rectangle1 = new Rectangle(halfStripeThickness, maxHeight);
        BaseShape newRect1 = new BaseShape(rectangle1.translate(rectangle1.getCoords(), new Point2d(halfMaxWidth, 0.0)));
        Rectangle rectangle2 = new Rectangle(maxWidth, halfStripeThickness);
        BaseShape H = new BaseShape();
        return H.add(newRect).add(rectangle2).add(newRect1);
    }

    /**
     * TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        double angleRotation = 22.0;
        Rectangle rectangle = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle rectangle1 = new Rectangle(halfStripeThickness, maxHeight);
        rectangle1.translate(rectangle1.getCoords(), new Point2d(maxWidth, 0.0));
        Rectangle rectangle2 = new Rectangle(halfStripeThickness, maxHeight);
        rectangle2.rotate(rectangle2.getCoords(), Math.toRadians(-angleRotation));
        rectangle2.translate(rectangle2.getCoords(), new Point2d(halfMaxWidth, 0.0));
        BaseShape N = new BaseShape();
        return N.add(rectangle).add(rectangle2).add(rectangle1);
    }


    /**
     * TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        Ellipse grosEllipse = new Ellipse(maxWidth, maxHeight);
        Ellipse petitEllipse = new Ellipse(halfMaxWidth, halfMaxHeight);
        BaseShape O = new BaseShape();
        return O.add(grosEllipse).remove(petitEllipse);
    }

}
