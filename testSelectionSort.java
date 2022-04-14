import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class testSelectionSort {
@Test
public void test() {
testPositive();
testNegative();
}
    public testSelectionSort() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        SelectionSort selectionSort = new SelectionSort();

        int[] arrSorted = new int[5];
        arrSorted = selectionSort.basicSelectionSort(arr);

        try {
 	       assertEquals(Sortedarr[2], arrSorted[2]);
 	       }
 	       catch (AssertionError e) {
 	    	    System.out.println("testPositive failed");
 	    	    throw e;
 	    	}
 	    	System.out.println("testPositive passed");
    }

    public void testNegative(){

        int[] arr = new int[5];
        arr[0] = -3;
        arr[1] = -1;
        arr[2] = -12;
        arr[3] = -5;
        arr[4] = -7;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -12;
        Sortedarr[1] = -7;
        Sortedarr[2] = -5;
        Sortedarr[3] = -3;
        Sortedarr[4] = -1;

        SelectionSort selectionSort = new SelectionSort();

        int[] arrSorted = new int[5];
        arrSorted = selectionSort.basicSelectionSort(arr);

        try {
 	       assertEquals(Sortedarr[1], arrSorted[1]);
 	       }
 	       catch (AssertionError e) {
 	    	    System.out.println("testNegative failed");
 	    	    throw e;
 	    	}
 	    	System.out.println("testNegative passed");
    }
}
