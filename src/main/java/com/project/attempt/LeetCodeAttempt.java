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

    // This method returns the first index where a row or column is completely painted.
    public static int firstCompletelyPaintedRowOrColumn(int[] arr, int[][] mat) {

        // We'll use matrixBoolean[][] to see if a certain index in mat[][] is painted or not yet.
        boolean[][] matrixBoolean = new boolean[mat.length][mat[0].length];

        // We'll loop through arr[][], and for each number, we'll loop through mat[][]
        // to find which index that number may be found in.
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < mat.length; j++) {

                for (int k = 0; k < mat[0].length; k++) {

                    // Once we find the number, we'll set the corresponding index in matrixBoolean[][]
                    // as true to indicate that it's been painted, then we'll call two helper methods
                    // to see if a complete row or column has been painted along this index. If yes,
                    // we return the current arr[][] index to indicate that this is the earliest point
                    // where a complete row or column has been painted.
                    if (arr[i] == mat[j][k]) {

                        matrixBoolean[j][k] = true;

                        if (checkRow(matrixBoolean, j) || checkColumn(matrixBoolean, k)) {
                            return i;
                        }

                    }

                }

            }

        }

        // If a complete row or column is never painted, method returns -1. This should never happen
        // if the arguments are within the challenge specification constraints, but we have to add
        // something here for the class to compile.
        return -1;

    }

    // This is a helper method that checks if the designated row is fully painted in matrixBoolean[][].
    private static boolean checkRow(boolean[][] matrixBoolean, int row) {

        boolean allPainted = true;

        // We simply loop through the designated row only, and if at any point anything is found
        // to be set to false (meaning unpainted) then the method as a whole returns false.
        for (int i = 0; i < matrixBoolean[row].length; i++) {

            if (!matrixBoolean[row][i]) {
                allPainted = false;
                break;
            }

        }

        return allPainted;

    }

    // This is a helper method that checks if the designated column is fully painted in matrixBoolean[][].
    private static boolean checkColumn(boolean[][] matrixBoolean, int column) {

        boolean allPainted = true;

        // We simply loop through the designated column only, and if at any point anything is found
        // to be set to false (meaning unpainted) then the method as a whole returns false.
        for (int i = 0; i < matrixBoolean.length; i++) {

            if (!matrixBoolean[i][column]) {
                allPainted = false;
                break;
            }

        }

        return allPainted;

    }

}
