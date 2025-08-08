//Ques-1
//Platform GFG
//Companies: ABCO Accolite Amazon Cisco Hike Microsoft Snapdeal VMWare Google Adobe
import java.util.*;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class MaxAndMinInArrQ1 {
    public static void main(String[] args) {
        int[] arr = {1000, 11, 445, 1, 330, 3000};
        Pair<Integer, Integer> result = getMinMax(arr);
        System.out.println(result.getKey() + " " + result.getValue());
    }

    static Pair<Integer, Integer> getMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new Pair<>(Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return new Pair<>(max, min);
    }
}