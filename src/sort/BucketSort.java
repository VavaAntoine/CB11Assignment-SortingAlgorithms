package sort;

import java.util.ArrayList;
import java.util.List;
import models.TShirt;
import models.enums.Size;

public class BucketSort {

    QuickSort qs = new QuickSort();

    public List<TShirt>[] bucketSortTShirts(List<TShirt> randomTShirts, int sortByAttribute, int sortingType) {
        // Step 1 - Create buckets, Size.length
        int noOfBuckets = Size.values().length;

        // Step 1, create noOfBuckets buckets  
        List<TShirt>[] buckets = new ArrayList[noOfBuckets];
        for (int i = 0; i < noOfBuckets; i++) { // noOfBuckets
            buckets[i] = new ArrayList<TShirt>(); // initialize the buckets
        }

        // Step 2, divide into buckets
        for (TShirt tShirt : randomTShirts) {
//              System.out.println(tShirt.getSize().ordinal()); // 3
            switch (sortByAttribute) {
                case 0:
                    buckets[tShirt.getSize().ordinal()].add(tShirt);
                    break;
                case 1:
                    buckets[tShirt.getColor().ordinal()].add(tShirt);
                    break;
                case 2:
                    buckets[tShirt.getFabric().ordinal()].add(tShirt);
                    break;
            }
        }
        return buckets;
    }

    public List<TShirt> bucketSortTShirtsBySizeThenColorThenFabric(List<TShirt> randomTShirts, int sortingType) {
        List<TShirt> tShirts = new ArrayList<>();
        // Step 1 - Create noOfBuckets buckets, Size.length
        int noOfBuckets = Size.values().length;
        List<TShirt>[] buckets = new ArrayList[noOfBuckets];
        for (int i = 0; i < noOfBuckets; i++) { // noOfBuckets
            buckets[i] = new ArrayList<TShirt>(); // initialize the buckets
        }
        // Step 2, divide into buckets, Sort By Size
        for (TShirt tShirt : randomTShirts) {
            buckets[tShirt.getSize().ordinal()].add(tShirt);
        }
        switch (sortingType) {
            case 0:
                // Step 3, Sort By Color
                for (List<TShirt> bucket : buckets) {
                    qs.quickSortTShirtsByColorByFabric(bucket, 0, bucket.size() - 1, sortingType);
                }
                // combine all the buckets to 1 List
                for (List<TShirt> bucket : buckets) {
                    for (TShirt tShirt : bucket) {
                        tShirts.add(tShirt);
                    }
                }
                break;

            case 1:
                // Step 3, Sort By Color
                for (List<TShirt> bucket : buckets) {
                    qs.quickSortTShirtsByColorByFabric(bucket, 0, bucket.size() - 1, sortingType);
                }
                // combine all the buckets to 1 List *** TOTORO *** 
                for (int i = noOfBuckets - 1; i >= 0; i--) { // noOfBuckets
                    for (int j = 0; j < buckets[i].size(); j++) {
                        tShirts.add(buckets[i].get(j));
                    }
                }
                break;
        }
        return tShirts;
    }

}
