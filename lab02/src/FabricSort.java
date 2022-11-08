import Sort.*;

public class FabricSort {
    public static Sorter createSorter(SortingType typeSort){
        switch (typeSort){
            case MERGESORTER:
                return new MergeSorter();

            case QUICKSORTER:
                return new QuickSorter();

            case SHELLSORTER:
                return new ShellSorter();

            case BUBBLESORTER:
                return new BubbleSorter();

            default:
                throw new RuntimeException();
        }
    }
}
