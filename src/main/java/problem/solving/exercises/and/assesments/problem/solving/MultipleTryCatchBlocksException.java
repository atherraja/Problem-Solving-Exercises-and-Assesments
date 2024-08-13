package problem.solving.exercises.and.assesments.problem.solving;

public class MultipleTryCatchBlocksException {
    public static void main(String[] args) {
        try
        {
            int a = 10,b = 0, c;
            c = a/b;
            System.out.println(c);
        }

        catch(ArithmeticException a)
        {
            System.out.println("Can't divide by zero");
        }

        try
        {
            int a[] = {10,20,30,40};
            System.out.println(a[5]);
        }

        catch(ArrayIndexOutOfBoundsException b) {
            System.out.println("Beyond the array limit");

        }
    }
}
