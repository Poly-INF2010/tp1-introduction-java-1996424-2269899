package Point;

import java.util.*;

public final class PointOperator {

    /**
     * TODO
     * Translates a vector of size N by another vector of size N
     * Similar to adding two vector of size N together
     * @param vector          Vector to translate
     * @param translateVector Translation to apply
     */
    public static void translate(Double[] vector, Double[] translateVector) {
        for (int i = 0; i < vector.length; i++) vector[i] += translateVector[i];
    }

    /**
     * TODO
     * Rotates a vector of size N by a matrix of size N x N
     * Similar to a matrix vector multiplication
     * @param vector         Vector to rotate
     * @param rotationMatrix Matrix by which to rotate
     */
    public static void rotate(Double[] vector, Double[][] rotationMatrix) {
        Double[] vecteur_finale_temp = new Double[vector.length];
        for (int i = 0; i < rotationMatrix.length; i++) {
            vecteur_finale_temp[i] = 0.0;
            for (int j = 0; j < rotationMatrix[i].length; j++) {
                vecteur_finale_temp[i] += (rotationMatrix[i][j]) * vector[j];
            }
        }
        System.arraycopy(vecteur_finale_temp, 0, vector, 0, vector.length);
    }

    /**
     * TODO
     * Divide a vector of size N by a scalar
     * @param vector  Vector to divide
     * @param divider Scalar by which to divide
     */
    public static void divide(Double[] vector, Double divider) {
        Double[] vecteur_devided = new Double[vector.length];
        for (int i = 0; i < vector.length; i++) {
            vecteur_devided[i] = vector[i] / divider;
        }
        System.arraycopy(vecteur_devided, 0, vector, 0, vector.length);
    }

    /**
     * TODO
     * Multiply a vector of size N by a scalar
     * @param vector     Vector to multiply
     * @param multiplier Scalar by which to multiply
     */
    public static void multiply(Double[] vector, Double multiplier) {
        Double[] vecteur_multi = new Double[vector.length];
        for (int i = 0; i < vector.length; i++) {
            vecteur_multi[i] = vector[i] * multiplier;
        }
        System.arraycopy(vecteur_multi, 0, vector, 0, vector.length);
    }

    /**
     * TODO
     * Add a scalar to a vector of size N
     * @param vector Vector that we have to add to
     * @param adder  Scalar to add to vector
     */
    public static void add(Double[] vector, Double adder) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] += adder;
        }
    }
}