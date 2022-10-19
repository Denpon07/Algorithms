package Sort;

import java.util.ArrayList;

public class BubbleSorter implements Sorter {

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> input) {
        boolean isSorted = false;
        int buf;

        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < input.size()-1; i++) {
                if(input.get(i) > input.get(i+1)){
                    isSorted = false;

                    buf = input.get(i);
                    input.set(i,input.get(i+1));
                    input.set(i+1,buf);
                }
            }
        }

        return input;
    }
}
