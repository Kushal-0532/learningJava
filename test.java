public class test {

    public boolean canJump(int[] nums) {

    }
    boolean is(int[] arr){
        int index = 0;
        while(arr.length>index){
            if(arr.length-1 == index){
                return true;
            }
            index = index +arr[index];
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {2,3,1,1,4};
        System.out.println(is(array));
    }
}
