package com.gmail.onishchenko.lectures.lecture14;

import java.util.Arrays;

public class Triangle {
    private SimpleEdge[] edges;
    private String[] color;

    public Triangle(int[] edges) {
        this.edges = new SimpleEdge[edges.length];
        for (int i = 0; i < this.edges.length; i++) {
            this.edges[i] = new SimpleEdge(edges[i], "black");
        }
    }

    public Triangle(SimpleEdge[] edges) {
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
            SimpleEdge edge = triangle.edges[i];
            edge.length *= scale;
        }

    }

    public static class SimpleEdge implements Edge {
        private int length;
        private String color;

        public SimpleEdge(int length, String color) {
            this.length = length;
            this.color = color;
        }

        public int getLength() {
            return length;
        }

        public String getColor() {
            return color;
        }

        @Override
        public String toString() {
            return "SimpleEdge{" +
                    "length=" + length +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
}
