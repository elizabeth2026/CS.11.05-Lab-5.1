public class ArrayUtility {

    public static void print(int[] array) {
        System.out.print(array);

    }

    public static int sum(int[] array) {
        int a = 0;
        for(int i = 0; i<array.length;i++){
            int b = array[i];
            a+=b;
        }
        return a;
    }

    public static double average(int[] array) {
        double a = 0.0;
        for(int i = 0; i<array.length;i++){
            int b = array[i];
            a+=b;

        }
        a/=array.length-1;
        return a;
    }

    public static int minimum(int[] array) {
        int min = 0;
        for(int i = 0; i<array.length-1; i++){
            int smallest = array[i];
            int second = array[i+1];
            if(smallest>=second){
                min=second;
            }
        }
        return min;

    }

    public static int maximum(int[] array) {
        return 0;
    }

    public static int evenCount(int[] array) {
        return 0;
    }

    public static int[] reverseOne(int[] array) {
        return null;
    }

    public static void reverseTwo(int[] array) {

    }

    public static boolean linearSearchInt(int[] array, int num) {
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        return false;
    }

    public static void multiplyByTwo(int[] array) {

    }

    public static void multiplyByN(int[] array, int n) {

    }

    public static String toString(int[] array) {
        return null;
    }

    public static boolean twoSum(int[] array, int num) {
        return false;
    }

    public static void shiftRight(int[] array) {

    }

    public static void shiftLeft(int[] array) {

    }

    public static void shiftRightNTimes(int[] array, int n) {

    }

    public static void shiftLeftNTimes(int[] array, int n) {

    }


}
