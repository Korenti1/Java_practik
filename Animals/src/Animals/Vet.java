package Animals;

public class Vet {

    public void treatAnimal(Animal animal) {
        System.out.println(animal.getName() +
                " пришел на прием к ветеринару\n"+
                animal.getName() + " - " + animal.getDescription());
    }

}
