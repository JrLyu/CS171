// The classes that implement an interface have similar actions (but not properties)
public interface ComparableThing {
    // An interface cannot have any variables.
    // An interface does not have a constructor
    int compareTo(ComparableThing x);

    static void selectionSort(ComparableThing[] list) {
        for (int i = 0; i < list.length-1; i++) {
            ComparableThing min = list[i];
            int minIndex = i;
            for (int k = minIndex+1; k < list.length; k++) {
                if (list[k].compareTo(min) < 0) {
                    min = list[k];
                    minIndex = k;
                }
            }
            if (minIndex != i) {
                ComparableThing help = list[minIndex];
                list[minIndex]= list[i];
                list[i] = help;
            }
        }
    }
}
