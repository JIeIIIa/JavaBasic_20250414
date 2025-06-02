package com.gmail.onishchenko.lectures.lecture14;

import java.util.Arrays;

public class Triangle {
    private int[] edges;

    public Triangle(int[] edges) {
        this.edges = Arrays.copyOf(edges, edges.length);
    }

    public int[] getEdges() {
        return Arrays.copyOf(edges, edges.length);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "edges=" + Arrays.toString(edges) +
                '}';
    }
}
