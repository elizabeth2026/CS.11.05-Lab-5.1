import java.text.DecimalFormat;

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
        double av = 0.0;
        for(int i = 0; i<array.length;i++){
            av+= array[i];

        }
        double a = (av/array.length);
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
        int count = 0;
        for(int i = 0; i<array.length-1;i++){
            if(array[i]<array[i+1]){
                count = array[i+1];
            }
        }
        return count;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        for(int i = 0; i<array.length-1; i++){
            int a = array[i]%10;
            if(array[i]==10 || a==0 || a==2 || a==4 || a==6 || a==8){


                    count++;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int [] result = new int [array.length];
        for (int i = 0; i < array.length/2; i++) {
            int one = array[i];
            int last = array[array.length - 1-i];
            result[i] = last;
            result[result.length-1-i] = one;


        }
        return result;
    }

    public static void reverseTwo(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            int one = array[i];
            int last = array[array.length - 1 - i];
            array[i] = last;
            array[array.length - 1 - i] = one;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for(int i = 0; i<array.length; i++){
            if(array[i]==num){
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for(int i = 0; i<array.length; i++){
            if(array[i].equals(str)){
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for(int i = 0; i<array.length; i++){
            array[i] = array[i]*2;
        }

    }

    public static void multiplyByN(int[] array, int n) {
        for(int i = 0; i<array.length; i++){
            array[i] = array[i]*n;
        }
    }

    public static String toString(int[] array) {
        String result = "";
        for(int i = 0; i<array.length-1; i++){
            int a = array[i];
            String b = String.valueOf(a);

            result+=b+", ";
        }
        int e = array[array.length-1];
        String c = String.valueOf(e);
        return result+c;
    }

    public static boolean twoSum(int[] array, int num) {
        for(int i = 0; i<array.length;i++){
            int a = array[i];
            int b = array[i+1];

            if(a+b==num){
                return true;
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        for(int i = 0; i<array.length-1;i++){
            array[0] = array[array.length-1];
            array[i+1]=array[i];

        }
    }

    public static void shiftLeft(int[] array) {

    }

    public static void shiftRightNTimes(int[] array, int n) {

    }

    public static void shiftLeftNTimes(int[] array, int n) {

    }


}
