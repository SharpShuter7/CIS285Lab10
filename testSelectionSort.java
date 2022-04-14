import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class testSelectionSort {
@Test
public void test() {
<<<<<<< HEAD
testPositive();
testNegative();
=======
testMixed();
testDuplicates();
>>>>>>> branch2
}
    public testSelectionSort() {
    }

<<<<<<< HEAD
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
=======
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
>>>>>>> branch2

        SelectionSort selectionSort = new SelectionSort();

        int[] arrSorted = new int[5];
        arrSorted = selectionSort.basicSelectionSort(arr);

        try {
<<<<<<< HEAD
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
=======
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
>>>>>>> branch2

        SelectionSort selectionSort = new SelectionSort();

        int[] arrSorted = new int[5];
        arrSorted = selectionSort.basicSelectionSort(arr);

        try {
<<<<<<< HEAD
 	       assertEquals(Sortedarr[1], arrSorted[1]);
 	       }
 	       catch (AssertionError e) {
 	    	    System.out.println("testNegative failed");
 	    	    throw e;
 	    	}
 	    	System.out.println("testNegative passed");
=======
 	       assertEquals(Sortedarr[3], arrSorted[3]);
 	       }
 	       catch (AssertionError e) {
 	    	    System.out.println("testDuplicates failed");
 	    	    throw e;
 	    	}
 	    	System.out.println("testDuplicates passed");
>>>>>>> branch2
    }
}
