package mainpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import models.TShirt;
import models.enums.Criteria;
import models.random.RandomTShirt;
import printing.Print;

public class Utils {

    Print p = new Print();

    public static List<TShirt> createAndPrintTShirtCollection(int numberOfRandomTShirts) {
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Original Array");
        List<TShirt> randomTShirts = new ArrayList<>(numberOfRandomTShirts);
        for (int i = 0; i < numberOfRandomTShirts; i++) {
            randomTShirts.add(new RandomTShirt());
            System.out.println(randomTShirts.get(i));
        }
        return randomTShirts;
    }

    public void playComparativeAnalysis(Scanner sc) {
        String continueChoice = " ";
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("Welcome, do you wish to do a comparative analysis implementing Bubble, Quick & Bucket Sort algorithms? Y/N: ");
        continueChoice = sc.next();
        if (continueChoice.equalsIgnoreCase("Y")) {
            System.out.println("G R E A T, let's start!");
            do {
                System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.print("Set expansion for TShirt list. On a scale of 1 to 6666. We recommend at least 40 TShirts. ");
                int tempRange = validateIntNumInRange(1, 6666, sc);
                // below create list 
                List<TShirt> randomTShirts = createAndPrintTShirtCollection(tempRange);
                System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Our comparisons for Quick, Bubble & Bucket sorting algorithms. Select a sorting option from list by typing a number:");
                setCriteria(sc, randomTShirts);

                System.out.print("Do you wish to continue testing ? Y/N: ");
                continueChoice = sc.next();
            } while (continueChoice.equalsIgnoreCase("Y"));
        }
        System.out.println("==================================================================================================================================================");
        System.out.println("Thank you for being our valued tester. We are so grateful for the pleasure of serving you and hope we met your expectations.");
    }

    // * * * V A L I D A T O R S * * *
    // method validates if input typed is an int number in range rmin-rmax 
    public static int validateIntNumInRange(int rmin, int rmax, Scanner sc) {
        int wholeNumber = 6;
        boolean inputIsValid;
        do {
            System.out.print("Please type: ");
            if (sc.hasNextInt()) {
                wholeNumber = sc.nextInt();
                if (wholeNumber >= rmin && wholeNumber <= rmax) {
                    inputIsValid = true;
                } else {
                    System.out.print("You entered: " + wholeNumber + ". This is not valid. ");
                    inputIsValid = false;
                }
            } else {
                String message = sc.next();
                System.out.print("You entered: " + message + ". This is not valid. ");
                inputIsValid = false;
            }
        } while (!inputIsValid);
        System.out.println(wholeNumber + " is valid. Thank you!");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        return (wholeNumber);
    }

    public static int validateIntNum(int rmin, Scanner sc) {
        int wholeNumber = 6;
        boolean inputIsValid;
        do {
            System.out.print("Please type: ");
            if (sc.hasNextInt()) {
                wholeNumber = sc.nextInt();
                if (wholeNumber >= rmin) {
                    inputIsValid = true;
                } else {
                    System.out.print("You entered: " + wholeNumber + ". This is not valid. ");
                    inputIsValid = false;
                }
            } else {
                String message = sc.next();
                System.out.print("You entered: " + message + ". This is not valid. ");
                inputIsValid = false;
            }
        } while (!inputIsValid);
        System.out.println(wholeNumber + " is valid. Thank you!");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        return (wholeNumber);
    }

    private Criteria setCriteria(Scanner sc, List<TShirt> randomTShirts) {
        int i = 1;
        for (Criteria title : Criteria.values()) {
            System.out.println(">> " + i + ". " + title + "   ");
            i++;
        }
        int choice = validateIntNumInRange(1, Criteria.values().length, sc);
        Criteria tempC = Criteria.SIZE_IN_ASCENDING;
        switch (choice) {
            case 1:
                tempC = Criteria.SIZE_IN_ASCENDING;
                p.printTshirtListBubbleSortedBySize(randomTShirts, 0, 0);
                p.printTshirtListQuickSortedBySize(randomTShirts, 0, 0);
                p.printTshirtListBucketSortedBySizeTotoro(randomTShirts, 0, 0);
                break;
            case 2:
                tempC = Criteria.SIZE_IN_DESCENDING;
                p.printTshirtListBubbleSortedBySize(randomTShirts, 1, 0);
                p.printTshirtListQuickSortedBySize(randomTShirts, 0, 1);
                p.printTshirtListBucketSortedBySizeTotoro(randomTShirts, 0, 1);
                break;
            case 3:
                tempC = Criteria.COLOR_IN_ASCENDING;
                p.printTshirtListBubbleSortedByColor(randomTShirts, 0, 1);
                p.printTshirtListQuickSortedByColor(randomTShirts, 1, 0);
                p.printTshirtListBucketSortedByColorTotoro(randomTShirts, 1, 0);
                break;
            case 4:
                tempC = Criteria.COLOR_IN_DESCENDING;
                p.printTshirtListBubbleSortedByColor(randomTShirts, 1, 1);
                p.printTshirtListQuickSortedByColor(randomTShirts, 1, 1);
                p.printTshirtListBucketSortedByColorTotoro(randomTShirts, 1, 1);
                break;
            case 5:
                tempC = Criteria.FABRIC_IN_ASCENDING;
                p.printTshirtListBubbleSortedByFabric(randomTShirts, 0, 2);
                p.printTshirtListQuickSortedByFabric(randomTShirts, 2, 0);
                p.printTshirtListBucketSortedByFabricTotoro(randomTShirts, 2, 0);
                break;
            case 6:
                tempC = Criteria.FABRIC_IN_DESCENDING;
                p.printTshirtListBubbleSortedByFabric(randomTShirts, 1, 2);
                p.printTshirtListQuickSortedByFabric(randomTShirts, 2, 1);
                p.printTshirtListBucketSortedByFabricTotoro(randomTShirts, 2, 1);
                break;
            case 7:
                tempC = Criteria.SIZE_AND_COLOR_AND_FABRIC_IN_ASCENDING;
                p.printTshirtListBubbleSortedBySizeThenByColorFinallyByFabric(randomTShirts,0);
                p.printTshirtListQuickSortedBySizeThenByColorFinallyByFabric(randomTShirts, 0);    
                p.printTshirtListBucketSortedBySizeThenByColorFinallyByFabric(randomTShirts, 0);
                break;
            case 8:
                tempC = Criteria.SIZE_AND_COLOR_AND_FABRIC_IN_DESCENDING;
                p.printTshirtListBubbleSortedBySizeThenByColorFinallyByFabric(randomTShirts,1);
                p.printTshirtListQuickSortedBySizeThenByColorFinallyByFabric(randomTShirts, 1);      
                p.printTshirtListBucketSortedBySizeThenByColorFinallyByFabric(randomTShirts, 1);
                break;
            default:
                System.out.print("");
        }
        System.out.println("\nCriteria selected >>> " + tempC + " <<<");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        return (tempC);
    }

}
