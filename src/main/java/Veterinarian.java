public class Veterinarian {

    public void treatAnimal(Animal animal){

        System.out.println("Животное " + animal.getClass().getName() + " кушает " +
                animal.food + " " + animal.location);
    }
}
