public class Question2
{
    int[] stack = {1,3,2,4,1};

    void DuplicateFinder(){
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(stack[i]==stack[j]){
                    System.out.println("Duplicate");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Question2 obj = new Question2();
        obj.DuplicateFinder();
    }


}
