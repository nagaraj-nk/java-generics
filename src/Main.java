import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        AnimalProcessor<Cat> catAnimalProcessor = new AnimalProcessor<>(cat);
        catAnimalProcessor.process();

        List<Cat> catList = new ArrayList<>();
        catList.add(cat);

        printList(catList);
    }

    static void printList(List<? extends Animal> animalList) {
        System.out.println(animalList);
    }
}