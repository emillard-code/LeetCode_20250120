package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        int[] arr1 = new int[]{1,3,4,2};
        int[][] mat1 = new int[][]{{1,4},{2,3}};
        System.out.println(firstCompletelyPaintedRowOrColumn(arr1, mat1));

        int[] arr2 = new int[]{2,8,7,4,1,3,5,6,9};
        int[][] mat2 = new int[][]{{3,2,5},{1,4,6},{8,7,9}};
        System.out.println(firstCompletelyPaintedRowOrColumn(arr2, mat2));

    }

    public static int firstCompletelyPaintedRowOrColumn(int[] arr, int[][] mat) {

        boolean[][] matrixBoolean = new boolean[mat.length][mat[0].length];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < mat.length; j++) {

                for (int k = 0; k < mat[0].length; k++) {

                    if (arr[i] == mat[j][k]) {

                        matrixBoolean[j][k] = true;

                        if (checkRow(matrixBoolean, j) || checkColumn(matrixBoolean, k)) {
                            return i;
                        }

                    }

                }

            }

        }

        return -1;

    }

    private static boolean checkRow(boolean[][] matrixBoolean, int row) {

        boolean allPainted = true;

        for (int i = 0; i < matrixBoolean[row].length; i++) {

            if (!matrixBoolean[row][i]) {
                allPainted = false;
                break;
            }

        }

        return allPainted;

    }

    private static boolean checkColumn(boolean[][] matrixBoolean, int column) {

        boolean allPainted = true;

        for (int i = 0; i < matrixBoolean.length; i++) {

            if (!matrixBoolean[i][column]) {
                allPainted = false;
                break;
            }

        }

        return allPainted;

    }

}
