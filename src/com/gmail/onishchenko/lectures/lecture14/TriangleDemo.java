package com.gmail.onishchenko.lectures.lecture14;

public class TriangleDemo {
    public static void main(String[] args) {
        int[] edges = {3, 4, 5};
        Triangle triangle = new Triangle(edges);
        System.out.println(triangle);

        edges[0] = -1000;
        System.out.println(triangle);

        System.out.println("Unexpected changes");
        int[] privateEdges = triangle.getEdges();
        privateEdges[0] = -837465876;
        System.out.println(triangle);

    }
}
