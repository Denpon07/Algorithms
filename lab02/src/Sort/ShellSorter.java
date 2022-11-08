package Sort;

import Sort.Sorter;

import java.util.ArrayList;

public class ShellSorter implements Sorter {
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> input) {
        int n = input.size();
        int h = 1;

        while (h < n/3) {
            h = 3 * h + 1;
        }

        while (h >= 1){
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && input.get(j) < input.get(j-h) ; j-= h) {
                    int buf = input.get(j);
                    input.set(j, input.get(j-h));
                    input.set(j-h, buf);
                }
            }
            h = h / 3;
        }

        return input;
    }
}
