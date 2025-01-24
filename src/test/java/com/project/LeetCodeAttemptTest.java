package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void firstCompletelyPaintedRowOrColumnTest() {

        int[] arr1 = new int[]{1,3,4,2};
        int[][] mat1 = new int[][]{{1,4},{2,3}};
        assertEquals(2, LeetCodeAttempt.firstCompletelyPaintedRowOrColumn(arr1, mat1));

        int[] arr2 = new int[]{2,8,7,4,1,3,5,6,9};
        int[][] mat2 = new int[][]{{3,2,5},{1,4,6},{8,7,9}};
        assertEquals(3, LeetCodeAttempt.firstCompletelyPaintedRowOrColumn(arr2, mat2));

    }

}
