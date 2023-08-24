package Entities;

import java.util.Arrays;

public class RandomArray {
    
    private int[] firstArray;
    private int[] secondArray;

    public RandomArray() {
    }

    public RandomArray(int[] firstArray, int[] secondArray) {
        this.firstArray = firstArray;
        this.secondArray = secondArray;
    }

    public int[] getFirstArray() {
        return firstArray;
    }

    public void setFirstArray(int[] firstArray) {
        this.firstArray = firstArray;
    }

    public int[] getSecondArray() {
        return secondArray;
    }

    public void setSecondArray(int[] secondArray) {
        this.secondArray = secondArray;
    }

    @Override
    public String toString() {
        return "RandomArrayServices{" + "firstArray=" + Arrays.toString(firstArray) + ", secondArray=" + Arrays.toString(secondArray) + '}';
    }
    
}
