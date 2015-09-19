package geometry.interfaces;

public interface Vertexable {
    double getX();

    double getY();

    double calculateDistance(Vertexable otherVertex);
}
