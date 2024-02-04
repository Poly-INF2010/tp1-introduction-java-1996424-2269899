package Interface;

import Point.Point2d;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Transform implements Rotate, Translate{
    /** TODO
     * Rotate all points of collections given in parameters
     * with the angle given
     * @param coords collections of Point2d
     * @param angle
     * @return rotated collection
     * */
    public Collection<Point2d> rotate(Collection<Point2d> coords, Double angle) {
        Iterator<Point2d> iterator = coords.iterator();
        Collection<Point2d> rotatedCoords = new ArrayList<>();

        while (iterator.hasNext()) {
            Point2d point = iterator.next();
            Point2d rotatedPoint = point.rotate(angle);
            rotatedCoords.add(rotatedPoint);
        }

        return rotatedCoords;
    }

    /** TODO
     * Translate all points of a collection by a given vector
     * @param coords Collection of Point2d
     * @param translateVector Vector of translation
     * @return translated coords
     * */
    public Collection<Point2d> translate(Collection<Point2d> coords, Point2d translateVector) { //utiliser la fonction qui se trouve dans point2d!!!!
        Iterator<Point2d> iterator = coords.iterator();
        Collection<Point2d> coordsTranslated = new ArrayList<>();
        while (iterator.hasNext()){
            Point2d point = iterator.next();
            Point2d translatedPoint = point.translate(translateVector);
            coordsTranslated.add(translatedPoint);
        }
        return coordsTranslated;
    }
}
