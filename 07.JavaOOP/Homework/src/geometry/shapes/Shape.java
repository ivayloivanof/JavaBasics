package geometry.shapes;

import geometry.interfaces.Vertexable;

import java.util.ArrayList;

public abstract class Shape {
    private ArrayList<Vertexable> vertices;

    protected Shape(){
        this.vertices = new ArrayList<>();
    }
}
