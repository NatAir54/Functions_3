package com.epam.rd.autotasks;

public class FunctionsTask3 {
    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static int multiArithmeticElements(int a1, int t, int n) {
        if (n<=0) {
            throw new IllegalArgumentException();
        }

        int[] array = new int[n];
        array[0] = a1;

        for (int i = 1; i < n; ++i) {
            array[i] = array[i - 1] + t;
        }
        int p = 1;
        for (int i = 0; i < n; i++) {
            p = p * array[i];
        }
        return p;
    }
}
