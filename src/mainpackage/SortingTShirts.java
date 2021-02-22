
package mainpackage;

import java.util.Scanner;

public class SortingTShirts {

    private static Scanner sc;
    
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Utils utils = new Utils();
        utils.playComparativeAnalysis(sc);
    }
}
