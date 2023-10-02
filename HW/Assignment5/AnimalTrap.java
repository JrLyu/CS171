// AnimalTrap can only trap an object of a type T that is a subclass of Animal
public class AnimalTrap<A extends Animal> extends Trap<A>{
    AnimalTrap() {
        super();
    }
}