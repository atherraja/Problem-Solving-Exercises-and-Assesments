package problem.solving.exercises.and.assesments.problem.solving;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int myInt = Integer.parseInt("1");
        } catch (Exception e) {
            System.out.println("hey dude, you can't make an int out of that. Stop trying to make it");
        }
        System.out.println("End here");
    }
}
