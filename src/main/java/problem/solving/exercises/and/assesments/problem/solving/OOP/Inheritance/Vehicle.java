package problem.solving.exercises.and.assesments.problem.solving.OOP.Inheritance;

class Vehicle {
    protected String brand = "Ford";            // vehicle attribute
    public void honk(){                         // vehicle method
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";         // car attribute

    public static void main(String[] args) {

        // create car object
        Car myCar = new Car();

        // call the honk() method (from the vehicle class) on the myCar
        // object
        myCar.honk();

        // Display the value of the brand attribute (from the vehicle class)
        // and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
