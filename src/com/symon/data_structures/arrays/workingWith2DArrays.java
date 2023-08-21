package com.symon.data_structures.arrays;

import java.util.Arrays;

public class workingWith2DArrays {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';
        // deepToString() is used instead of toString() because
        // the array is multidimensional
        System.out.println(Arrays.deepToString(board));

        char[][] boardTwo = new char[][]{
          new char[] {'-','-','-'},
          new char[] {'-','-','-'},
          new char[] {'-','-','-'}
        };
        System.out.println(Arrays.deepToString(boardTwo));
    }
}
