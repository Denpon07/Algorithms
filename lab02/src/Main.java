import Sort.Sorter;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static int count;
    public static void main(String[] args) {

        for (count = 10; count <= 10000; count *= 10) {
            System.out.println("Number of elements in iteration: " + count);
            ArrayList<Integer> arrayList = filingList(count);

            for (SortingType type : SortingType.values()) {
                System.out.println("Name iteration: " + type.name());
                ArrayList<Integer> sortedList = countingTime(arrayList,FabricSort.createSorter(type));
                listOutput(sortedList);
                System.out.println();
            }
        }
    }
    public static ArrayList<Integer> filingList(int counter){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < counter; i++) {
            arrayList.add(rand.nextInt(counter));
        }
        listOutput(arrayList);
        return arrayList;
    }

    public static void listOutput(ArrayList<Integer> arrayList){
        if (count < 50){
            for (int i = 0; i < 10; i++) {
                System.out.print(" " + arrayList.get(i));
            }
        System.out.println();
        }
        else {
            for (int i = 0; i < 50; i++) {
                System.out.print(" " + arrayList.get(i));
            }
            System.out.println();
        }

    }

    public static ArrayList<Integer> countingTime (ArrayList<Integer> list, Sorter sorter){
        ArrayList<Integer> arrayList = new ArrayList<>(list);
        long time = System.currentTimeMillis();
        arrayList = sorter.sort(arrayList);
        System.out.printf("Sorting time: %s%n", System.currentTimeMillis() - time);
        return arrayList;
    }
}