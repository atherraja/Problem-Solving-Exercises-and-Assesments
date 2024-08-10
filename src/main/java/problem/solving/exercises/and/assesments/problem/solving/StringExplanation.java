package problem.solving.exercises.and.assesments.problem.solving;

public class StringExplanation {
    public static void main(String[] args) {
        String greeting = "Welcome";
        System.out.println(greeting);

        // String Length
        String txt = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("The length of String is: " + txt.length());

        // Upper case Lower case of String
        String txt1 = "Hi";
        System.out.println(txt1.toUpperCase());
        System.out.println(txt1.toLowerCase());

        // Finding a Character in a String
        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate"));

        // String Concatenation
        String firstName = "Muhammad";
        String lastName = "Ather";
        System.out.println(firstName + " " + lastName);

        // Concat Name
        String firstName1 = "Muhammad";
        String lastName1 = "Ather";
        System.out.println(firstName1.concat(lastName1));

        // Adding Numbers and Strings
        int x = 10;
        int y = 20;
        int z = x + y;
        System.out.println(z);

        //  add two strings
        String x1 = "10";
        String y1 = "20";
        String z1 = x1 + y1;
        System.out.println(z1);

    }

}
