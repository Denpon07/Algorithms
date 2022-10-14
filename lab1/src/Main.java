import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    Random random;
    public static void main(String[] args) {
        int amount = 1000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println();
        arrFiling(100000,"arrayList",arrayList);
        arrFiling(100000,"linkedList",linkedList);

        System.out.println();
        randomAccess("arrayList",arrayList);
        randomAccess("linkedList",linkedList);

        System.out.println();
        sequentialAccess("arrayList",arrayList);
        sequentialAccess("linkedList",linkedList);

        System.out.println();
        addInBeginning(amount,"arrayList",arrayList);
        addInBeginning(amount,"linkedList",linkedList);

        System.out.println();
        addInEnd(amount,"arrayList",arrayList);
        addInEnd(amount,"linkedList",linkedList);

        System.out.println();
        addInMiddle(amount,"arrayList",arrayList);
        addInMiddle(amount,"linkedList",linkedList);
    }

    public static void arrFiling(int counter, String listType, List<Integer> list){
        Random rand = new Random();
        long time = System.currentTimeMillis();
        for (int i = 0; i < counter; i++) {
            list.add(rand.nextInt(counter));
        }
        System.out.printf("Fill %s: %s%n", listType, System.currentTimeMillis() - time);
    }

    public static void randomAccess(String listType, List<Integer> list){
        Random rand = new Random();
        long time = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            int index = rand.nextInt(list.size());
                list.get(index);
        }
        System.out.printf("Random Access %s: %s%n", listType, System.currentTimeMillis() - time);
    }

    public static void sequentialAccess(String listType, List<Integer> list){
        int index = 0;
        long time = System.currentTimeMillis();
        for (Integer number :  list) {
            Integer s = number;
        }
        System.out.printf("Sequential Access %s: %s%n", listType, System.currentTimeMillis() - time);
    }

    public static void addInBeginning(int amount, String listType, List<Integer> list){
        Random random = new Random();

        long time = System.currentTimeMillis();
        for (int i = 0; i < amount; i++) {
            list.add(0,random.nextInt(amount));
        }
        System.out.printf("Insert in the begin of %s: %s%n", listType, System.currentTimeMillis() - time);
    }

    public static void addInEnd(int amount, String listType, List<Integer> list){
        Random random = new Random();

        long time = System.currentTimeMillis();
        for (int i = 0; i < amount ; i++) {
            list.add(random.nextInt(amount));
        }
        System.out.printf("Insert in the end of %s: %s%n", listType, System.currentTimeMillis() - time);
    }

    public static void addInMiddle(int amount, String listType, List<Integer> list){
        Random random = new Random();

        long time = System.currentTimeMillis();
        for (int i = 0; i < amount ; i++) {
            list.add(list.size()/2,random.nextInt(amount));
        }
        System.out.printf("Insert in the middle of %s: %s%n", listType, System.currentTimeMillis() - time);
    }
}