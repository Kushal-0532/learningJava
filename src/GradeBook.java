public class GradeBook

    //WORK ON THIS LATER
{
    //First dimention is for student and second for their grades.
    private int[][] studentGrades;

    //Method for finding maximum grade
    private void maximumGrade()
    {
        int maximumGrade = 0;
        for(int[] student:studentGrades)
        {
            for(int i =0;i<student.length;i++)
            {
                if(student[i]>maximumGrade){maximumGrade=student[i];}
            }
            System.out.println("Max of "+maximumGrade);

        }

    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                       {3,2,1},
                       {4,2,1}};
        GradeBook gb = new GradeBook();
        gb.studentGrades=arr;
        gb.maximumGrade();
    }

}
