import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

    boolean binarySearchFunction(int[] array, int element, int left, int right) {
        if (left <= right) {
            int mid =(left+right) / 2;

            if (array[mid] == element) {
                System.out.println("Found element!");
                return true;
            }
            if (array[mid] > element) {
                return binarySearchFunction(array, element, left, mid - 1);
            } else {
                return binarySearchFunction(array, element, mid + 1, right);
            }
        }
        System.out.println("Not found!");
        return false;
    }

    public static void main(String[] args) {
        Random random = new Random();

        int[] arrayOfRandElements = new int[1000000];  // Random elements in the array
        for (int i = 0; i < 1000000; i++) {
            arrayOfRandElements[i] = random.nextInt(1000);
        }
        Arrays.sort(arrayOfRandElements);
        int element = arrayOfRandElements[arrayOfRandElements.length-1];
        System.out.println(element);
        BinarySearch binarySearchObj = new BinarySearch();

        long y; long z;
         y = System.nanoTime();

        for (int i = 0; i < arrayOfRandElements.length; i++) {
            if (arrayOfRandElements[i] == element) {
                System.out.println("Element found!");
                break;
            }
        }

         z = System.nanoTime();
        System.out.println(z - y);


        y=System.nanoTime();
        binarySearchObj.binarySearchFunction(arrayOfRandElements, element, 0, arrayOfRandElements.length - 1);
        z=System.nanoTime();
        System.out.println( (z - y) );

    }
}
