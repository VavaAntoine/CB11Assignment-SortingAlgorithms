package sort;

import java.util.List;
import models.TShirt;

public class QuickSort {

    int partition(List<TShirt> arr, int low, int high, int sortByAttribute, int sortingType) {
        TShirt pivot = arr.get(high);
        int i = (low - 1); // index of smaller element 
        for (int j = low; j < high; j++) {
            if (sortingType == 0) { // ASC
                switch (sortByAttribute) {
                    // Size
                    case 0:
                        // If current element is smaller than the pivot 
                        if (arr.get(j).getSize().ordinal() < pivot.getSize().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j] 
                            TShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                    // Color
                    case 1:
                        if (arr.get(j).getColor().ordinal() < pivot.getColor().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j] 
                            TShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                    // Fabric
                    case 2:
                        if (arr.get(j).getFabric().ordinal() < pivot.getFabric().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j] 
                            TShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                }
            } else { // DESC
                switch (sortByAttribute) {
                    // Size
                    case 0:
                        // If current element is smaller than the pivot 
                        if (arr.get(j).getSize().ordinal() > pivot.getSize().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j] 
                            TShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                    // Color
                    case 1:
                        if (arr.get(j).getColor().ordinal() > pivot.getColor().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j] 
                            TShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                    // Fabric
                    case 2:
                        if (arr.get(j).getFabric().ordinal() > pivot.getFabric().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j] 
                            TShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                }
            }

        }

        // swap arr[i+1] and arr[high] (or pivot) 
        TShirt temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);

        return i + 1;
    }

    /* The main function that implements QuickSort(), arr[] --> Array to be sorted, low  --> Starting index, high  --> Ending index */
    public void quickSortTShirts(List<TShirt> arr, int low, int high, int sortByAttribute, int sortingType) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is now at right place */
            int pi = 0;
            switch (sortingType) {
                // ASC
                case 0:
                    pi = partition(arr, low, high, sortByAttribute, sortingType); // part <--- Size, Color, Fabric

                    // Recursively sort elements before 
                    // partition and after partition 
                    quickSortTShirts(arr, low, pi - 1, sortByAttribute, 0);
                    quickSortTShirts(arr, pi + 1, high, sortByAttribute, 0);
                    break;
                // DESC
                case 1:
                    pi = partition(arr, low, high, sortByAttribute, sortingType); // part <--- Size, Color, Fabric

                    // Recursively sort elements before 
                    // partition and after partition 
                    quickSortTShirts(arr, low, pi - 1, sortByAttribute, 1);
                    quickSortTShirts(arr, pi + 1, high, sortByAttribute, 1);
                    break;
            }
        }
    }

    // *** By Size Then By Color Finally By Fabric
    int partitionBySizeThenByColorFinallyByFabric(List<TShirt> arr, int low, int high, int sortingType) {
        TShirt pivot = arr.get(high);
        int i = (low - 1); // index of smaller element 
        for (int j = low; j < high; j++) {
            if (sortingType == 0) { // ASC
                // If current element is smaller than the pivot 
                if (arr.get(j).getSize().ordinal() < pivot.getSize().ordinal()) {
                    i++;

                    // swap arr[i] and arr[j] 
                    TShirt temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
                if (arr.get(j).getSize().ordinal() == pivot.getSize().ordinal()) {
                    if (arr.get(j).getColor().ordinal() < pivot.getColor().ordinal()) {
                        i++;

                        // swap arr[i] and arr[j] 
                        TShirt temp = arr.get(i);
                        arr.set(i, arr.get(j));
                        arr.set(j, temp);
                    }
                    if (arr.get(j).getColor().ordinal() == pivot.getColor().ordinal()) {
                        if (arr.get(j).getFabric().ordinal() < pivot.getFabric().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j] 
                            TShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                    }
                }
            } else { // DESC
                // If current element is smaller than the pivot 
                if (arr.get(j).getSize().ordinal() > pivot.getSize().ordinal()) {
                    i++;

                    // swap arr[i] and arr[j] 
                    TShirt temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
                if (arr.get(j).getSize().ordinal() == pivot.getSize().ordinal()) {
                    if (arr.get(j).getColor().ordinal() > pivot.getColor().ordinal()) {
                        i++;

                        // swap arr[i] and arr[j] 
                        TShirt temp = arr.get(i);
                        arr.set(i, arr.get(j));
                        arr.set(j, temp);
                    }
                    if (arr.get(j).getColor().ordinal() == pivot.getColor().ordinal()) {
                        if (arr.get(j).getFabric().ordinal() > pivot.getFabric().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j] 
                            TShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                    }
                }
            }
        }

        // swap arr[i+1] and arr[high] (or pivot) 
        TShirt temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);

        return i + 1;}
    
    public void quickSortTShirtsBySizeThenByColorFinallyByFabric(List<TShirt> arr, int low, int high, int sortingType) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is now at right place */
            int pi = 0;
            switch (sortingType) {
                // ASC
                case 0:
                    pi = partitionBySizeThenByColorFinallyByFabric(arr, low, high, sortingType); // part <--- Size, Color, Fabric

                    // Recursively sort elements before 
                    // partition and after partition 
                    quickSortTShirtsBySizeThenByColorFinallyByFabric(arr, low, pi - 1, 0);
                    quickSortTShirtsBySizeThenByColorFinallyByFabric(arr, pi + 1, high, 0);
                    break;
                // DESC
                case 1:
                    pi = partitionBySizeThenByColorFinallyByFabric(arr, low, high, sortingType); // part <--- Size, Color, Fabric

                    // Recursively sort elements before 
                    // partition and after partition 
                    quickSortTShirtsBySizeThenByColorFinallyByFabric(arr, low, pi - 1, 1);
                    quickSortTShirtsBySizeThenByColorFinallyByFabric(arr, pi + 1, high, 1);
                    break;
            }
        }
    }

    
    // *** to be called from bucket sort By Color Then By Fabric
    int partitionByColorByFabric(List<TShirt> arr, int low, int high, int sortingType) {
        TShirt pivot = arr.get(high);
        int i = (low - 1); // index of smaller element 
        for (int j = low; j < high; j++) {
            if (sortingType == 0) { // ASC
                // If current element is smaller than the pivot 
                    if (arr.get(j).getColor().ordinal() < pivot.getColor().ordinal()) {
                        i++;

                        // swap arr[i] and arr[j] 
                        TShirt temp = arr.get(i);
                        arr.set(i, arr.get(j));
                        arr.set(j, temp);
                    }
                    if (arr.get(j).getColor().ordinal() == pivot.getColor().ordinal()) {
                        if (arr.get(j).getFabric().ordinal() < pivot.getFabric().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j] 
                            TShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                    }
            } else { // DESC
                // If current element is smaller than the pivot 
                if (arr.get(j).getSize().ordinal() == pivot.getSize().ordinal()) {
                    if (arr.get(j).getColor().ordinal() > pivot.getColor().ordinal()) {
                        i++;

                        // swap arr[i] and arr[j] 
                        TShirt temp = arr.get(i);
                        arr.set(i, arr.get(j));
                        arr.set(j, temp);
                    }
                    if (arr.get(j).getColor().ordinal() == pivot.getColor().ordinal()) {
                        if (arr.get(j).getFabric().ordinal() > pivot.getFabric().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j] 
                            TShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                    }
                }
            }
        }

        // swap arr[i+1] and arr[high] (or pivot) 
        TShirt temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);

        return i + 1;}
    
    public void quickSortTShirtsByColorByFabric(List<TShirt> arr, int low, int high, int sortingType) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is now at right place */
            int pi = 0;
            switch (sortingType) {
                // ASC
                case 0:
                    pi = partitionByColorByFabric(arr, low, high, sortingType); // part <--- Size, Color, Fabric

                    // Recursively sort elements before 
                    // partition and after partition 
                    quickSortTShirtsByColorByFabric(arr, low, pi - 1, 0);
                    quickSortTShirtsByColorByFabric(arr, pi + 1, high, 0);
                    break;
                // DESC
                case 1:
                    pi = partitionByColorByFabric(arr, low, high, sortingType); // part <--- Size, Color, Fabric

                    // Recursively sort elements before 
                    // partition and after partition 
                    quickSortTShirtsByColorByFabric(arr, low, pi - 1, 1);
                    quickSortTShirtsByColorByFabric(arr, pi + 1, high, 1);
                    break;
            }
        }
    }

    
    
}
