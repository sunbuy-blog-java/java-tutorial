package maxelementinarray;

public class MaxElementUsingLoop {
	public static void main(String[] args) {
        int[] intArray = {134, 12, 20, 324, 112, 10, 25};

        int maxNum = intArray[0];

        for (int j : intArray) {
            if (j > maxNum)
                maxNum = j;
        }

        System.out.println("Maximum number in array is: " + maxNum);
    }

}
