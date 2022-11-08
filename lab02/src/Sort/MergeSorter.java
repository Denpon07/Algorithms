package Sort;

import java.util.ArrayList;

public class MergeSorter implements Sorter {

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> input) {

        divide(input,0, input.size() - 1);
        return input;

    }

    private void divide(ArrayList<Integer> input, int left, int right) {

        if (left < right && (right - left) >= 1) {
            int middleElement = (right + left) / 2;

            divide(input, left, middleElement);
            divide(input, middleElement + 1, right);

            merge(input, left, middleElement, right);
        }
    }

    private void merge(ArrayList<Integer> input, int left, int middle, int right) {
        ArrayList<Integer> tempArray = new ArrayList<>();

        int leftIndex = left;
        int rightIndex = middle + 1;

        while (leftIndex <= middle && rightIndex <= right) {

            if (input.get(leftIndex) <= input.get(rightIndex)) {

                tempArray.add(input.get(leftIndex++));

            } else {

                tempArray.add(input.get(rightIndex++));

            }
        }

        while (leftIndex <= middle) {
            tempArray.add(input.get(leftIndex++));
        }

        while (rightIndex <= right) {
            tempArray.add(input.get(rightIndex++));
        }


        for (int i = 0; i < tempArray.size(); left++) {
            input.set(left, tempArray.get(i++));

        }

    }
}

