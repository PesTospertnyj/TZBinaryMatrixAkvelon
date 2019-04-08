package com.matrix;

import static com.matrix.Matrix.C;
import static org.junit.Assert.*;

public class MatrixTest {

    @org.junit.Test
    public void first() {
        Matrix matrix = new Matrix();
        int mat[][] = {{0, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};
        int actual = matrix.first(mat[0], 0, C - 1);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void rowWithMax1s() {
        Matrix matrix = new Matrix();
        int mat[][] = {{0, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};
        int actual = matrix.rowWithMax1s(mat);
        int expected = 2;
        assertEquals(expected, actual);
    }
}