import java.util.Arrays;
public class arrayJava
{
    /**
     * A simple graph using arrays
     * */
    public static void main(String[] args)
    {
        // Array of integers
        int[] grades = {1,2,0,3,1};
        //Array of ranges
        String[] ranges = {"00-10","10-20","20-30","30-40","40-50"};
        //Loop 1 for the ranges
        for(int i=0;i< grades.length;i++)
        {
          System.out.print(ranges[i]+"| ");
          //Loop 2 for printing the frequency
            for(int j=0;j<grades[i];j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
