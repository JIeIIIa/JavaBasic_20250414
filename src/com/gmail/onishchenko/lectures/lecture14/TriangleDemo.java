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
        String importantColor = "red";

//        importantColor = "default";

        Triangle.SimpleEdge boldEdge = new Triangle.SimpleEdge(5, "red") {
            @Override
            public String toString() {
                return "BoldEdge{" +
                        "length=" + getLength() +
                        ", color='" + importantColor + '\'' +
                        '}';
            }
        };

        Triangle.SimpleEdge[] complexEdges = {
                new Triangle.SimpleEdge(3, "black"),
                new Triangle.SimpleEdge(4, "green"),
                boldEdge
        };
        Triangle coloredTriangle = new Triangle(complexEdges);
        System.out.println(coloredTriangle);

        System.out.println("Scale triangle");
        Triangle.increase(coloredTriangle, 2);
        System.out.println(coloredTriangle);

        Edge edge = boldEdge;
        System.out.println("Edge length is " + edge.getLength());

        Edge defaultEdge = new Edge() {
            @Override
            public int getLength() {
                return 10;
            }

//            @Override
//            public String getColor() {
//                return "green";
//            }
        };
        System.out.println("Default edge length: " + defaultEdge.getLength());
        System.out.println("Default edge color: " + defaultEdge.getColor());
    }
}
