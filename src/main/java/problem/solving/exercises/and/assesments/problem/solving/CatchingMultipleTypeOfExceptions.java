package problem.solving.exercises.and.assesments.problem.solving;

import static com.sun.tools.javac.util.StringUtils.toUpperCase;

public class CatchingMultipleTypeOfExceptions {
    public static void main(String[] args) {
        try
        {
            //1
            int a = 10/2;
            System.out.println(a);

            //2
            int arr[] = {10,20,30};
            System.out.println(arr[0]);

            //3
            String str = "ather";
            System.out.println(toUpperCase(str));
        }

        catch (ArrayIndexOutOfBoundsException a)
        {
            System.out.println("Array Exception");

        }

        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");

        }

        catch(Exception x)
        {
            System.out.println("All type Exception");
        }
    }
}
