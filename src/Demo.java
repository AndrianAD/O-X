/**
 * Created by User on 171024.
 */
public class Demo {
    private static int sum = 0;


    public static int GetSum(int a, int b) {
        if (a == b) {
            return a;
        }
        int min, max;
        if (a > b) {
            min = b;
            max = a;
        } else {
            min = a;
            max = b;
        }
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        return sum;
    }


//    public static String getMiddle(String word) {
//        int length = word.length();
//        if (length != 1) {
//            if (length % 2 == 0) {
//                String result = String.valueOf((word.charAt(length / 2 - 1)));
//                result += String.valueOf((word.charAt(length / 2)));
//                return result;
//            } else {
//                String result = String.valueOf((word.charAt((int) Math.floor(length / 2))));
//                return result;
//            }
//        }
//        return word;
//    }


    public static String getMiddle(String word) {
        //Code goes here!
        while(word.length() > 2) {
            word = word.substring(1, word.length()-1);
        }

        return word;
    }





}
