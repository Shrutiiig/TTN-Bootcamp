// Print the elements of an array in the decreasing frequency if 2 numbers have the same frequency
// then print the one which came first.

import java.util.*;
import java.util.stream.Collectors;

class Data implements Comparable<Data> {
    int value, count, index;

    public Data(int value, int count, int index) {
        this.value = value;
        this.count = count;
        this.index = index;
    }

    public int compareTo(Data obj) {
        if (this.count != obj.count) {
            return obj.count - this.count;
        }
        return this.index - obj.index;
    }
}

public class ques6 {
    public static void customSort(int[] arr) {

        HashMap<Integer, Data> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.putIfAbsent(arr[i], new Data(arr[i], 0, i));
            hm.get(arr[i]).count++;
        }

        List<Data> values = hm.values().stream()
                .sorted()
                .collect(Collectors.toList());

        int k = 0;
        for (Data data: values) {
            for (int j = 0; j < data.count; j++) {
                arr[k++] = data.value;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4,5,6,3,4,5,3,5,4,3,5,4,4,5,4,3,6 };

        customSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}