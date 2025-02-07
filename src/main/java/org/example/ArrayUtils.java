package org.example;

public class ArrayUtils {

    @MethodInfo(name = "findMax", returnType = "int", description = "Finds the maximum element in an array")
    @Author(firstName = "Ivan", lastName = "Petrenko")
    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    @MethodInfo(name = "findMin", returnType = "int", description = "Finds the minimum element in an array")
    @Author(firstName = "Dmytrii", lastName = "Kaminskyi")
    public static int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
