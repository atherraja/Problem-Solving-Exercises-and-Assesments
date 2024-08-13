package problem.solving.exercises.and.assesments.problem.solving.OOP.Abstraction;

// Abstract Class
abstract class Animal {
    // Abstract method (does not have a body)

    public abstract void animalSound();
    // Regular method
    public void sleep(){
        System.out.println("Zzzz");
    }
}

// Subclass (inherit from Animal)
class Duck extends Animal{
    @Override
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The Duck says : quack quack!!");
    }
}

class Main{
    public static void main(String[] args) {
        Duck myDuck = new Duck();
        myDuck.animalSound();
        myDuck.sleep();
    }
}
