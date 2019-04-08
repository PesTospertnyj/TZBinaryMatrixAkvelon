package com.matrix;

public class Program {
    public static void main(String[] args) {
        Matrix matr = new Matrix();
        int mat[][] = {{0, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};
        System.out.println("Index of row with maximum 1s is "
                + matr.rowWithMax1s(mat));
    }
}
