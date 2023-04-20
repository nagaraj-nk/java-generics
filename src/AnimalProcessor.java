public class AnimalProcessor<T extends Animal> {
    T animalType;

    public AnimalProcessor(T animalType) {
        this.animalType = animalType;
    }

    public void process() {
        System.out.println(animalType.getType());
    }
}
