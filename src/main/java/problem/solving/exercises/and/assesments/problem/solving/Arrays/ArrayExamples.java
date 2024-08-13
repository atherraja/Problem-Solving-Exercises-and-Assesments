package problem.solving.exercises.and.assesments.problem.solving.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        // An Array storing different ages
        int ages [] = {20, 22, 18, 35, 48, 26, 87, 70};

        float avg, sum = 0;

        // Get the length of the array
        int length = ages.length;

        // Loop through the elements of the Array
        for (int age : ages) {
            sum += age;
        }

        // Calculate the average by dividing the sum of the length
        avg = sum / length;

        // print the average
        System.out.println("The average is : " + avg);
    }
}
