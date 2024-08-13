package problem.solving.exercises.and.assesments.problem.solving.OOP.Interface;

public class Duck implements Animal {

    @Override
    public void animalSound() {
        System.out.println("The Duck says : quack quack!!");
    }

    @Override
    public void sleep() {
        System.out.println("Zzzz");
    }
}
