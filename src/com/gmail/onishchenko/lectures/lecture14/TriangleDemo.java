package com.gmail.onishchenko.lectures.lecture14;

public class TriangleDemo {
    public static void main(String[] args) {
        int[] edges = {3, 4, 5};
        Triangle triangle = new Triangle(edges);
        System.out.println(triangle);

        edges[0] = -1000;
        System.out.println(triangle);

//        System.out.println("Unexpected changes");
//        int[] privateEdges = triangle.getEdges();
//        privateEdges[0] = -837465876;
//        System.out.println(triangle);

        Triangle.Edge boldEdge = new Triangle.Edge(5, "red") {
            @Override
            public String toString() {
                return "BoldEdge{" +
                        "length=" + getLength() +
                        ", color='" + getColor() + '\'' +
                        '}';
            }
        };

        Triangle.Edge[] complexEdges = {
                new Triangle.Edge(3, "black"),
                new Triangle.Edge(4, "green"),
                boldEdge
        };
        Triangle coloredTriangle = new Triangle(complexEdges);
        System.out.println(coloredTriangle);

        System.out.println("Scale triangle");
        Triangle.increase(coloredTriangle, 2);
        System.out.println(coloredTriangle);
    }
}
