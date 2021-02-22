package sort;

import java.util.ArrayList;
import java.util.List;
import models.TShirt;

public class BubbleSort {

    private List<TShirt> bubbleSortTShirtsBySize(List<TShirt> arr, int sortingType) // sortingType = 0 - ASC, 1 - DESC
    {
        List<TShirt> arr2 = new ArrayList<>(arr);
        int n = arr2.size();
        switch (sortingType) {
            case 0:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getSize().ordinal() > arr2.get(j + 1).getSize().ordinal()) {
                            TShirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1));
                            arr2.set(j + 1, temp);
                        }
                    }
                }
                break;
            case 1:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getSize().ordinal() < arr2.get(j + 1).getSize().ordinal()) {
                            TShirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1));
                            arr2.set(j + 1, temp);
                        }
                    }
                }
                break;
        }

        return (arr2);
    }

    private List<TShirt> bubbleSortTShirtsByColor(List<TShirt> arr, int sortingType) // sortingType = 0 - ASC, 1 - DESC
    {
        List<TShirt> arr2 = new ArrayList<>(arr);
        int n = arr2.size();
        switch (sortingType) {
            case 0:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getColor().ordinal() > arr2.get(j + 1).getColor().ordinal()) {
                            TShirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1));
                            arr2.set(j + 1, temp);
                        }
                    }
                }
                break;
            case 1:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getColor().ordinal() < arr2.get(j + 1).getColor().ordinal()) {
                            TShirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1));
                            arr2.set(j + 1, temp);
                        }
                    }
                }
                break;
        }
        return (arr2);
    }

    private List<TShirt> bubbleSortTShirtsByFabric(List<TShirt> arr, int sortingType) // sortingType = 0 - ASC, 1 - DESC
    {
        List<TShirt> arr2 = new ArrayList<>(arr);
        int n = arr2.size();
        switch (sortingType) {
            case 0:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getFabric().ordinal() > arr2.get(j + 1).getFabric().ordinal()) {
                            TShirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1));
                            arr2.set(j + 1, temp);
                        }
                    }
                }
                break;
            case 1:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getFabric().ordinal() < arr2.get(j + 1).getFabric().ordinal()) {
                            TShirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1));
                            arr2.set(j + 1, temp);
                        }
                    }
                }
                break;
        }
        return (arr2);
    }

    //     type  attr    type  attr        type  attr     type  attr      type  attr       type  attr
    // BY  ASC SIZE 0 0, DESC SIZE 1 0,   ASC COLOR  0 1, DESC COLOR 1 1, ASC FABRIQ 0 2, DESC FABRIQ 1 2
    public List<TShirt> bubbleSortTShirts(List<TShirt> arr, int sortingType, int sortByAttribute) {
        List<TShirt> arr2 = new ArrayList<>(arr);
        if (sortingType == 0) {
            switch (sortByAttribute) {
                // Size
                case 0:
                    arr2 = bubbleSortTShirtsBySize(arr, 0);
                    break;
                // Color    
                case 1:
                    arr2 = bubbleSortTShirtsByColor(arr, 0);
                    break;
                // Fabric
                case 2:
                    arr2 = bubbleSortTShirtsByFabric(arr, 0);
                    break;
            }
        } else {
            switch (sortByAttribute) {
                // Size
                case 0:
                    arr2 = bubbleSortTShirtsBySize(arr, 1);
                    break;
                // Color    
                case 1:
                    arr2 = bubbleSortTShirtsByColor(arr, 1);
                    break;
                // Fabric
                case 2:
                    arr2 = bubbleSortTShirtsByFabric(arr, 1);
                    break;
            }
        }
        return (arr2);
    }

    public List<TShirt> bubbleSortTShirtsBySizeThenByColorFinallyByFabric(List<TShirt> arr, int sortingType) // sortingType = 0 - ASC, 1 - DESC
    {
        List<TShirt> arr2 = new ArrayList<>(arr);
        int n = arr2.size();
        switch (sortingType) {
            case 0:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getSize().ordinal() > arr2.get(j + 1).getSize().ordinal()) {
                            TShirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1)); 
                            arr2.set(j + 1, temp); 
                        }
                        if (arr2.get(j).getSize().ordinal() == arr2.get(j + 1).getSize().ordinal()) {
                            if (arr2.get(j).getColor().ordinal() > arr2.get(j + 1).getColor().ordinal()) {
                                TShirt temp1 = arr2.get(j);
                                arr2.set(j, arr2.get(j + 1));  
                                arr2.set(j + 1, temp1);   
                            }
                            if (arr2.get(j).getColor().ordinal() == arr2.get(j + 1).getColor().ordinal()) {
                                if (arr2.get(j).getFabric().ordinal() > arr2.get(j + 1).getFabric().ordinal()) {
                                    TShirt temp1 = arr2.get(j);
                                    arr2.set(j, arr2.get(j + 1));  
                                    arr2.set(j + 1, temp1);                              
                                }
                            }
                        }

                    }
                }
                break;
            case 1:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getSize().ordinal() < arr2.get(j + 1).getSize().ordinal()) {
                            TShirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1)); 
                            arr2.set(j + 1, temp); 
                        }
                        if (arr2.get(j).getSize().ordinal() == arr2.get(j + 1).getSize().ordinal()) {
                            if (arr2.get(j).getColor().ordinal() < arr2.get(j + 1).getColor().ordinal()) {
                                TShirt temp1 = arr2.get(j);
                                arr2.set(j, arr2.get(j + 1));  
                                arr2.set(j + 1, temp1);    
                            }
                            if (arr2.get(j).getColor().ordinal() == arr2.get(j + 1).getColor().ordinal()) {
                                if (arr2.get(j).getFabric().ordinal() < arr2.get(j + 1).getFabric().ordinal()) {
                                    TShirt temp1 = arr2.get(j);
                                    arr2.set(j, arr2.get(j + 1)); 
                                    arr2.set(j + 1, temp1);                            
                                }
                            }
                        }
                    }
                }
                break;
        }
        return (arr2);
    }

}
