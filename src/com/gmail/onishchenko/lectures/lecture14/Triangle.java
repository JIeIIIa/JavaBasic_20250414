package com.gmail.onishchenko.lectures.lecture14;

import java.util.Arrays;

public class Triangle {
    private Edge[] edges;
    private String[] color;

    public Triangle(int[] edges) {
        this.edges = new Edge[edges.length];
        for (int i = 0; i < this.edges.length; i++) {
            this.edges[i] = new Edge(edges[i], "black");
        }
    }

    public Triangle(Edge[] edges) {
        this.edges = Arrays.copyOf(edges, edges.length);
    }

    //    public int[] getEdges() {
//        return Arrays.copyOf(edges, edges.length);
//    }

    @Override
    public String toString() {
        return "Triangle{" +
                "edges=" + Arrays.toString(edges) +
                '}';
    }

    public static void increase(Triangle triangle, int scale) {
        for (int i = 0; i < triangle.edges.length; i++) {
            Edge edge = triangle.edges[i];
            edge.length *= scale;
        }

    }

    public static class Edge {
        private int length;
        private String color;

        public Edge(int length, String color) {
            this.length = length;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Edge{" +
                    "length=" + length +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
}
