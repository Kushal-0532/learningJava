public class Dsa2_37 {
    void patternFunction(int n){
        for(int i=3;i<n;i++){
            for(int j=0;j<i;j++){
                int[] array = new int[j];
                int[] tempArray = new int[array.length+2];
                tempArray[0] = 1;
                for(int k=0;k<tempArray.length;k++){
                    if((k==1)||(k==(tempArray.length-1))){
                        tempArray[k] = array[k-1]+array[k];
                    }
                    else{
                        tempArray[k] = array[k]+array[k-1]+array[k-2];
                    }
                }

            }
        }
    }
}
