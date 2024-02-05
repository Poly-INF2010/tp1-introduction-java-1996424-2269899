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
        Point2d translatingVector = new Point2d(-12.0, 20.0);
        rectangle2.translate(rectangle2.getCoords(), translatingVector);
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
        Ellipse bigEllipse = new Ellipse(maxWidth, maxHeight);
        Ellipse smallEllipse = new Ellipse(halfMaxWidth, halfMaxHeight);
        Rectangle opening = new Rectangle(maxWidth, halfMaxHeight);
        opening.translate(opening.getCoords(), new Point2d(halfMaxWidth / 2, 0.0));
        BaseShape C = new BaseShape();
        return C.add(bigEllipse).remove(smallEllipse).remove(opening);
    }

    /**
     * TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        Rectangle verticalRectangle = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle horizontalRectangle1 = new Rectangle(maxWidth, halfStripeThickness);
        Rectangle horizontalRectangle2 = horizontalRectangle1.clone();
        Rectangle horizontalRectangle3 = horizontalRectangle1.clone();
        horizontalRectangle1.translate(horizontalRectangle1.getCoords(), new Point2d(halfMaxWidth, halfMaxHeight - halfStripeThickness / 2));
        horizontalRectangle2.translate(horizontalRectangle2.getCoords(), new Point2d(halfMaxWidth, -halfMaxHeight + halfStripeThickness / 2));
        horizontalRectangle3.translate(horizontalRectangle3.getCoords(), new Point2d(halfMaxWidth, 0.0));
        BaseShape E = new BaseShape();
        return E.add(verticalRectangle).add(horizontalRectangle1).add(horizontalRectangle2).add(horizontalRectangle3);

    }

    /**
     * TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        Rectangle verticalRectangle = new Rectangle(halfStripeThickness, maxHeight);
        BaseShape newRect = new BaseShape(verticalRectangle.translate(verticalRectangle.getCoords(), new Point2d(-halfMaxWidth, 0.0)));
        Rectangle verticalRectangle2 = new Rectangle(halfStripeThickness, maxHeight);
        BaseShape newRect1 = new BaseShape(verticalRectangle2.translate(verticalRectangle2.getCoords(), new Point2d(halfMaxWidth, 0.0)));
        Rectangle horizontalRectangle = new Rectangle(maxWidth, halfStripeThickness);
        BaseShape H = new BaseShape();
        return H.add(newRect).add(horizontalRectangle).add(newRect1);
    }

    /**
     * TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        double angleRotation = 22.0;
        Rectangle verticalRectangle = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle verticalRectangle2 = new Rectangle(halfStripeThickness, maxHeight);
        verticalRectangle2.translate(verticalRectangle2.getCoords(), new Point2d(maxWidth, 0.0));
        Rectangle diagonalRectangle = new Rectangle(halfStripeThickness, maxHeight);
        diagonalRectangle.rotate(diagonalRectangle.getCoords(), Math.toRadians(-angleRotation));
        diagonalRectangle.translate(diagonalRectangle.getCoords(), new Point2d(halfMaxWidth, 0.0));
        BaseShape N = new BaseShape();
        return N.add(verticalRectangle).add(diagonalRectangle).add(verticalRectangle2);
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
