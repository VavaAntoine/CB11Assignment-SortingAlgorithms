package printing;

import java.util.ArrayList;
import java.util.List;
import models.TShirt;
import models.Timer;
import models.enums.Size;
import sort.BubbleSort;
import sort.BucketSort;
import sort.QuickSort;

public class Print {

    BubbleSort bs = new BubbleSort();
    QuickSort qs = new QuickSort();
    BucketSort bts = new BucketSort();

    public static void printTshirtList(List<TShirt> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            System.out.println(list.get(i));
        }
    }

    /*Prints list Bubble Sorted !!! */
    public void printTshirtListBubbleSortedBySize(List<TShirt> list, int sortingType, int sortByAttribute) {
        switch (sortingType) {
            case 0:
                System.out.println("\nSorted Array With Bubble-Sort Method, By Size In Ascending Order");
                Timer timer0 = new Timer();
                List<TShirt> bubbleSortRandomTShirtsBySize0 = bs.bubbleSortTShirts(list, sortingType, sortByAttribute);
                timer0.stop();
                System.out.println("Sorted in " + timer0.elapsedTime() + " milliseconds");
                printTshirtList(bubbleSortRandomTShirtsBySize0);
                break;
            case 1:
                System.out.println("\nSorted Array With Bubble-Sort Method, By Size In Descending Order");
                Timer timer1 = new Timer();
                List<TShirt> bubbleSortRandomTShirtsBySize1 = bs.bubbleSortTShirts(list, sortingType, sortByAttribute);
                timer1.stop();
                System.out.println("Sorted in " + timer1.elapsedTime() + " milliseconds");
                printTshirtList(bubbleSortRandomTShirtsBySize1);
                break;
        }
    }

    public void printTshirtListBubbleSortedByColor(List<TShirt> list, int sortingType, int sortByAttribute) {
        switch (sortingType) {
            case 0:
                System.out.println("\nSorted Array With Bubble-Sort Method, By Color In Ascending Order");
                Timer timer0 = new Timer();
                List<TShirt> bubbleSortRandomTShirtsByColor0 = bs.bubbleSortTShirts(list, sortingType, sortByAttribute);
                timer0.stop();
                System.out.println("Sorted in " + timer0.elapsedTime() + " milliseconds");
                printTshirtList(bubbleSortRandomTShirtsByColor0);
                break;
            case 1:
                System.out.println("\nSorted Array With Bubble-Sort Method, By Color In Descending Order");
                Timer timer1 = new Timer();
                List<TShirt> bubbleSortRandomTShirtsByColor1 = bs.bubbleSortTShirts(list, sortingType, sortByAttribute);
                timer1.stop();
                System.out.println("Sorted in " + timer1.elapsedTime() + " milliseconds"); 
                printTshirtList(bubbleSortRandomTShirtsByColor1);
                break;
        }
    }

    public void printTshirtListBubbleSortedByFabric(List<TShirt> list, int sortingType, int sortByAttribute) {
        switch (sortingType) {
            case 0:
                System.out.println("\nSorted Array With Bubble-Sort Method, By Fabric In Ascending Order");
                Timer timer0 = new Timer();
                List<TShirt> bubbleSortRandomTShirtsByFabric0 = bs.bubbleSortTShirts(list, sortingType, sortByAttribute);
                timer0.stop();
                System.out.println("Sorted in " + timer0.elapsedTime() + " milliseconds");                
                printTshirtList(bubbleSortRandomTShirtsByFabric0);
                break;
            case 1:
                System.out.println("\nSorted Array With Bubble-Sort Method, By Fabric In Descending Order");
                Timer timer1 = new Timer();
                List<TShirt> bubbleSortRandomTShirtsByFabric1 = bs.bubbleSortTShirts(list, sortingType, sortByAttribute);
                timer1.stop();
                System.out.println("Sorted in " + timer1.elapsedTime() + " milliseconds");                
                printTshirtList(bubbleSortRandomTShirtsByFabric1);
                break;
        }
    }

    // Prints list By Size Then By Color Finally By Fabric !!!
    public void printTshirtListBubbleSortedBySizeThenByColorFinallyByFabric(List<TShirt> list, int sortingType) {
        switch (sortingType) {
            case 0:
                System.out.println("\nSorted Array With Bubble-Sort Method, By Size Then By Color Finally By Fabric In Ascending Order");
                Timer timer0 = new Timer();
                List<TShirt> bubbleSortRandomTShirtsByFabric0 = bs.bubbleSortTShirtsBySizeThenByColorFinallyByFabric(list, sortingType);
                timer0.stop();
                System.out.println("Sorted in " + timer0.elapsedTime() + " milliseconds");                
                printTshirtList(bubbleSortRandomTShirtsByFabric0);
                break;
            case 1:
                System.out.println("\nSorted Array With Bubble-Sort Method, By Size Then By Color Finally By Fabric In  Descending Order");
                Timer timer1 = new Timer();
                List<TShirt> bubbleSortRandomTShirtsByFabric1 = bs.bubbleSortTShirtsBySizeThenByColorFinallyByFabric(list, sortingType);
                timer1.stop();
                System.out.println("Sorted in " + timer1.elapsedTime() + " milliseconds");                
                printTshirtList(bubbleSortRandomTShirtsByFabric1);
                break;
        }    
    }
      
    /*Prints list Quick Sorted !!! */
    public void printTshirtListQuickSortedBySize(List<TShirt> list, int sortByAttribute, int sortingType) {
        switch (sortingType) {
            case 0:
                System.out.println("\nSorted Array With Quick-Sort Method, By Size In Ascending Order");
                List<TShirt> quickSortrandomTShirts0 = new ArrayList<TShirt>(list); // deep copy of list
                Timer timer0 = new Timer();
                qs.quickSortTShirts(quickSortrandomTShirts0, 0, quickSortrandomTShirts0.size() - 1, sortByAttribute, sortingType);
                timer0.stop();
                System.out.println("Sorted in " + timer0.elapsedTime() + " milliseconds");
                printTshirtList(quickSortrandomTShirts0);
                break;
            case 1:
                System.out.println("\nSorted Array With Quick-Sort Method, By Size In Descending Order");
                List<TShirt> quickSortrandomTShirts1 = new ArrayList<TShirt>(list); // deep copy of list
                Timer timer1 = new Timer();
                qs.quickSortTShirts(quickSortrandomTShirts1, 0, quickSortrandomTShirts1.size() - 1, sortByAttribute, sortingType);
                timer1.stop();
                System.out.println("Sorted in " + timer1.elapsedTime() + " milliseconds");
                printTshirtList(quickSortrandomTShirts1);
                break;
        }
    }

    public void printTshirtListQuickSortedByColor(List<TShirt> list, int sortByAttribute, int sortingType) {
        switch (sortingType) {
            case 0:
                System.out.println("\nSorted Array With Quick-Sort Method, By Color In Ascending Order");
                List<TShirt> quickSortrandomTShirts0 = new ArrayList<TShirt>(list); // deep copy of list
                Timer timer0 = new Timer();
                qs.quickSortTShirts(quickSortrandomTShirts0, 0, quickSortrandomTShirts0.size() - 1, sortByAttribute, sortingType);
                timer0.stop();
                System.out.println("Sorted in " + timer0.elapsedTime() + " milliseconds");
                printTshirtList(quickSortrandomTShirts0);
                break;
            case 1:
                System.out.println("\nSorted Array With Quick-Sort Method, By Color In Descending Order");
                List<TShirt> quickSortrandomTShirts1 = new ArrayList<TShirt>(list); // deep copy of list
                Timer timer1 = new Timer();
                qs.quickSortTShirts(quickSortrandomTShirts1, 0, quickSortrandomTShirts1.size() - 1, sortByAttribute, sortingType);
                timer1.stop();
                System.out.println("Sorted in " + timer1.elapsedTime() + " milliseconds");
                printTshirtList(quickSortrandomTShirts1);
                break;
        }
    }

    public void printTshirtListQuickSortedByFabric(List<TShirt> list, int sortByAttribute, int sortingType) {
        switch (sortingType) {
            case 0:
                System.out.println("\nSorted Array With Quick-Sort Method, By Fabric In Ascending Order");
                List<TShirt> quickSortrandomTShirts0 = new ArrayList<TShirt>(list); // deep copy of list
                Timer timer0 = new Timer();
                qs.quickSortTShirts(quickSortrandomTShirts0, 0, quickSortrandomTShirts0.size() - 1, sortByAttribute, sortingType);
                timer0.stop();
                System.out.println("Sorted in " + timer0.elapsedTime() + " milliseconds");
                printTshirtList(quickSortrandomTShirts0);
                break;
            case 1:
                System.out.println("\nSorted Array With Quick-Sort Method, By Fabric In Descending Order");
                List<TShirt> quickSortrandomTShirts1 = new ArrayList<TShirt>(list); // deep copy of list
                Timer timer1 = new Timer();
                qs.quickSortTShirts(quickSortrandomTShirts1, 0, quickSortrandomTShirts1.size() - 1, sortByAttribute, sortingType);
                timer1.stop();
                System.out.println("Sorted in " + timer1.elapsedTime() + " milliseconds");
                printTshirtList(quickSortrandomTShirts1);
                break;
        }
    }

    // 
    public void printTshirtListQuickSortedBySizeThenByColorFinallyByFabric(List<TShirt> list, int sortingType) {
        switch (sortingType) {
            case 0:
                System.out.println("\nSorted Array With Quick-Sort Method, By Size Then By Color Finally By Fabric In Ascending Order");
                List<TShirt> quickSortrandomTShirts0 = new ArrayList<TShirt>(list); // deep copy of list
                Timer timer0 = new Timer();
                qs.quickSortTShirtsBySizeThenByColorFinallyByFabric(quickSortrandomTShirts0, 0, quickSortrandomTShirts0.size()-1, sortingType);
                timer0.stop();
                System.out.println("Sorted in " + timer0.elapsedTime() + " milliseconds");
                printTshirtList(quickSortrandomTShirts0);
                break;
            case 1:
                System.out.println("\nSorted Array With Quick-Sort Method, By Size Then By Color Finally By Fabric In Descending Order");
                List<TShirt> quickSortrandomTShirts1 = new ArrayList<TShirt>(list); // deep copy of list
                Timer timer1 = new Timer();
                qs.quickSortTShirtsBySizeThenByColorFinallyByFabric(quickSortrandomTShirts1, 0, quickSortrandomTShirts1.size()-1, sortingType);
                timer1.stop();
                System.out.println("Sorted in " + timer1.elapsedTime() + " milliseconds");
                printTshirtList(quickSortrandomTShirts1);
                break;
        }
    }

        
    /* Prints list Bucket Sorted */
    public void printTshirtListBucketSortedBySizeTotoro(List<TShirt> list, int sortByAttribute, int sortingType) {
        int noOfBuckets = Size.values().length;
        switch (sortingType) {
            case 0:
                System.out.println("\nSorted Array With Bucket-Sort Method, By Size In Ascending Order");
                Timer timer0 = new Timer();
                List<TShirt>[] buckets0 = bts.bucketSortTShirts(list, sortByAttribute, sortingType);
                timer0.stop();
                System.out.println("Sorted in " + timer0.elapsedTime() + " milliseconds");
                for (int i = 0; i < noOfBuckets; i++) { // noOfBuckets
                    for (int j = 0; j < buckets0[i].size(); j++) {
                        System.out.println(buckets0[i].get(j));
                    }
                }
                break;
            case 1:
                System.out.println("\nSorted Array With Bucket-Sort Method, By Size In Descending Order");
                Timer timer1 = new Timer();
                List<TShirt>[] buckets1 = bts.bucketSortTShirts(list, sortByAttribute, sortingType);
                timer1.stop();
                System.out.println("Sorted in " + timer1.elapsedTime() + " milliseconds");
                for (int i = noOfBuckets - 1; i >= 0; i--) { // noOfBuckets
                    for (int j = 0; j < buckets1[i].size(); j++) {
                        System.out.println(buckets1[i].get(j));
                    }
                }
                break;
        }
    }

    public void printTshirtListBucketSortedByColorTotoro(List<TShirt> list, int sortByAttribute, int sortingType) {
        int noOfBuckets = Size.values().length;
        switch (sortingType) {
            case 0:
                System.out.println("\nSorted Array With Bucket-Sort Method, By Color In Ascending Order");
                Timer timer0 = new Timer();
                List<TShirt>[] buckets0 = bts.bucketSortTShirts(list, sortByAttribute, sortingType);
                timer0.stop();
                System.out.println("Sorted in " + timer0.elapsedTime() + " milliseconds");
                for (int i = 0; i < noOfBuckets; i++) { // noOfBuckets
                    for (int j = 0; j < buckets0[i].size(); j++) {
                        System.out.println(buckets0[i].get(j));
                    }
                }
                break;
            case 1:
                System.out.println("\nSorted Array With Bucket-Sort Method, By Color In Descending Order");
                Timer timer1 = new Timer();
                List<TShirt>[] buckets1 = bts.bucketSortTShirts(list, sortByAttribute, sortingType);
                timer1.stop();
                System.out.println("Sorted in " + timer1.elapsedTime() + " milliseconds");
                for (int i = noOfBuckets - 1; i >= 0; i--) { // noOfBuckets
                    for (int j = 0; j < buckets1[i].size(); j++) {
                        System.out.println(buckets1[i].get(j));
                    }
                }
                break;
        }
    }

    public void printTshirtListBucketSortedByFabricTotoro(List<TShirt> list, int sortByAttribute, int sortingType) {
        int noOfBuckets = Size.values().length;
        switch (sortingType) {
            case 0:
                System.out.println("\nSorted Array With Bucket-Sort Method, By Fabric In Ascending Order");
                Timer timer0 = new Timer();
                List<TShirt>[] buckets0 = bts.bucketSortTShirts(list, sortByAttribute, sortingType);
                timer0.stop();
                System.out.println("Sorted in " + timer0.elapsedTime() + " milliseconds");
                for (int i = 0; i < noOfBuckets; i++) { // noOfBuckets
                    for (int j = 0; j < buckets0[i].size(); j++) {
                        System.out.println(buckets0[i].get(j));
                    }
                }
                break;
            case 1:
                System.out.println("\nSorted Array With Bucket-Sort Method, By Fabric In Descending Order");
                Timer timer1 = new Timer();
                List<TShirt>[] buckets1 = bts.bucketSortTShirts(list, sortByAttribute, sortingType);
                timer1.stop();
                System.out.println("Sorted in " + timer1.elapsedTime() + " milliseconds");
                for (int i = noOfBuckets - 1; i >= 0; i--) { // noOfBuckets
                    for (int j = 0; j < buckets1[i].size(); j++) {
                        System.out.println(buckets1[i].get(j));
                    }
                }
                break;
        }
    }

    public void printTshirtListBucketSortedBySizeThenByColorFinallyByFabric(List<TShirt> list, int sortingType) {
        switch (sortingType) {
            case 0:
                System.out.println("\nSorted Array With Bucket-Sort Method, By Size Then By Color Finally By Fabric In Ascending Order");
                Timer timer0 = new Timer();
                List<TShirt> tShirts0 = bts.bucketSortTShirtsBySizeThenColorThenFabric(list, sortingType);
                timer0.stop();
                System.out.println("Sorted in " + timer0.elapsedTime() + " milliseconds");
                for (TShirt tShirt : tShirts0) {
                    System.out.println(tShirt);
                }
                
                break;
            case 1:
                System.out.println("\nSorted Array With Bucket-Sort Method, By Size Then By Color Finally By Fabric In Descending Order");
                Timer timer1 = new Timer();
                List<TShirt> tShirts1 = bts.bucketSortTShirtsBySizeThenColorThenFabric(list, sortingType);
                timer1.stop();
                System.out.println("Sorted in " + timer1.elapsedTime() + " milliseconds");
                for (TShirt tShirt : tShirts1) {
                    System.out.println(tShirt);
                }
                break;
        }
    }    
    
    
}
