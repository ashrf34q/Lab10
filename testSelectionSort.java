import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
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

          int[] SortedArr = new int[5];
          SortedArr[0] = 2;
          SortedArr[1] = 7;
          SortedArr[2] = 8;
          SortedArr[3] = 9;
          SortedArr[4] = 10;

         SelectionSort temp1 = new SelectionSort();
         temp1.basicSelectionSort(arr);
         System.out.println("testPositive: ");
         for(int x = 0; x < 5; ++x) {  System.out.println(arr[x]); }
         assertArrayEquals(arr,SortedArr);
      }

      public void testNegative(){
      	  int[] arr = new int[] {-8,-9,-7,-10,-2};
           int[] SortedArr = new int[] {-10,-9,-8,-7,-2};
           SelectionSort temp1 = new SelectionSort();
           temp1.basicSelectionSort(arr);
           System.out.println("testNegative: ");
           for(int x = 0; x < 5; ++x) {  System.out.println(arr[x]); }
            assertArrayEquals(arr,SortedArr);
      }

    public void testMixed(){
    int[] arr = new int[] {3,0,1,-8,-6};
    int [] SortedArr = new int[] {-8,-6,0,1,3};
    SelectionSort temp1 = new SelectionSort();
    temp1.basicSelectionSort(arr);
    System.out.println("testMixed: ");
    for(int x = 0; x < 5; ++x) {  System.out.println(arr[x]); }
    assertArrayEquals(arr,SortedArr);
}

public void testDuplicates(){
   int[] arr = new int[] {4,-2,4,1,-2};
     int [] SortedArr = new int[] {-2,-2,1,4,4};
     SelectionSort temp1 = new SelectionSort();
     temp1.basicSelectionSort(arr);
     System.out.println("testDuplicates: ");
     for(int x = 0; x < 5; ++x) {  System.out.println(arr[x]); }
     assertArrayEquals(arr,SortedArr);
  }
}
