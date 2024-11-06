package Sorting;

public class BinarySearch
{
    private void binarySearch(int start, int end, int[] array, int value)
    {
        if(start<=end){
            int middle = (start+end)/2;
            if(array[middle]==value){
                System.out.println("Found element in array!!");
            }
            else{
                if(array[middle]>value){
                    binarySearch(start,middle,array,value);
                }
                else{
                    binarySearch(middle+1,end,array,value);
                }
            }
        }
        else{
            System.out.println("Error didn't find element in array!!");
        }
    }

    private void search(int[] array, int value){
        binarySearch(0,array.length-1,array, value);
    }

    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
        obj.search(array,14);
    }
}
