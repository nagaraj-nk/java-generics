public class AnimalProcessor2<T extends Animal> {
    T animalType;

    public AnimalProcessor2(T animalType) {
        this.animalType = animalType;
    }

    public void process() {
        System.out.println(animalType.getType());
    }
}
