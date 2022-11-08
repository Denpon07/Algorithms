package Sort;

import java.util.ArrayList;

public class QuickSorter implements Sorter {

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> input) {
        quickSort(input,0,input.size()-1);
        return input;
    }

    private void quickSort(ArrayList<Integer> input,int left, int right) {
        if (left >= right) {
            return;
        }
        int coreNumber = divide(input, left, right);
        quickSort(input, left, coreNumber - 1);
        quickSort(input, coreNumber + 1, right);
    }

    private int divide(ArrayList<Integer> input, int left, int right) {
        int coreNumber = input.get(right);
        int ptr = left - 1;
        for (int i = left; i < right; i++) {
            if(input.get(i) < coreNumber){
                ptr++;
                swap(ptr,i,input);
            }
        }
        swap(ptr+1,right,input);
        return ptr+1;
    }

    private void swap(int ptr, int i, ArrayList<Integer> input) {
        int buf = input.get(ptr);
        input.set(ptr, input.get(i));
        input.set(i, buf);
    }
}
