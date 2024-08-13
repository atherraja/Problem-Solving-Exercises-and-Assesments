package problem.solving.exercises.and.assesments.problem.solving.OOP.Polymorphism;

class Animal {
    public void animalSound(){
        System.out.println("The animal makes a sound : ");
    }
}

class Duck extends Animal{
    public void animalSound(){
        System.out.println("The Duck says: quack quack!!");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("The dog says: bow bow!!");
    }
}

class Main{
    public static void main(String[] args) {
        Animal myanimal = new Animal();      // Create aN Animal Object
        Animal myDuck = new Duck();          // Create a duck object
        Animal myDog = new Dog();            // Create a dog object

        myanimal.animalSound();
        myDuck.animalSound();
        myDog.animalSound();
    }
}

