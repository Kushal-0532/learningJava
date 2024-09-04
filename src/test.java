public class test {


    static boolean is(int[] arr){
        int index = 0;
        while(arr.length>index){
            if(arr[index] == 0){
                return false;
            }
            if(arr.length-1 == index){
                return true;
            }
            index = index +arr[index];
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {3,2,1,0,4};
        System.out.println(is(array));
    }
}
