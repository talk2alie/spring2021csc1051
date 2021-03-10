public class CombinedAssignmentOperators {
    public static void main(String[] args) {
        System.out.println();

        double quiz1Grade;
        quiz1Grade = 98.5;

        double quiz2Grade;
        quiz2Grade = 79.8;
        
        double grades;
        grades = quiz1Grade + quiz2Grade;

        double quiz3Grade;
        quiz3Grade = 88.2;
        grades = grades + quiz3Grade;
        System.out.println("grades is " + grades);

        grades += quiz3Grade;



        System.out.println(grades);
    }
}
