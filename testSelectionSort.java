import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class testSelectionSort {
@Test
public void test() {
testMixed();
testDuplicates();
}
    public testSelectionSort() {
    }

    public void testMixed(){

        int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = -3;
        arr[2] = 8;
        arr[3] = 2;
        arr[4] = -9;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -9;
        Sortedarr[1] = -3;
        Sortedarr[2] = 0;
        Sortedarr[3] = 2;
        Sortedarr[4] = 8;

        SelectionSort selectionSort = new SelectionSort();

        int[] arrSorted = new int[5];
        arrSorted = selectionSort.basicSelectionSort(arr);

        try {
 	       assertEquals(Sortedarr[4], arrSorted[4]);
 	       }
 	       catch (AssertionError e) {
 	    	    System.out.println("testMixed failed");
 	    	    throw e;
 	    	}
 	    	System.out.println("testMixed passed");
    }

    public void testDuplicates(){

        int[] arr = new int[5];
        arr[0] = -3;
        arr[1] = 8;
        arr[2] = 0;
        arr[3] = 8;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -3;
        Sortedarr[1] = -2;
        Sortedarr[2] = 0;
        Sortedarr[3] = 8;
        Sortedarr[4] = 8;

        SelectionSort selectionSort = new SelectionSort();

        int[] arrSorted = new int[5];
        arrSorted = selectionSort.basicSelectionSort(arr);

        try {
 	       assertEquals(Sortedarr[3], arrSorted[3]);
 	       }
 	       catch (AssertionError e) {
 	    	    System.out.println("testDuplicates failed");
 	    	    throw e;
 	    	}
 	    	System.out.println("testDuplicates passed");
    }
}
