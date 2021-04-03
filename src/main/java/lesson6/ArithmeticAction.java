package lesson6;

import java.util.Arrays;
import java.util.TreeSet;

public class ArithmeticAction {

    public int arrayElementAfter(int [] arr) {
        int x = 0;
        int[] result = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                x = arr[i];
                result = new int[arr.length - i - 1];
                for (int j = i + 1, k = 0; j < arr.length; j++, k++) {
                    if (arr[j] == 4) continue;
                    result[k] = arr[j];
                    //System.out.println(result);
                }
            }
        }
        try {
            x = 1 / x;
        } catch (ArithmeticException e) {
            throw new RuntimeException();
        }
//return result;
        return x;
    }

    public TreeSet<String> sort(String ... str) {
        return new TreeSet<>(Arrays.asList(str));
    }
}
