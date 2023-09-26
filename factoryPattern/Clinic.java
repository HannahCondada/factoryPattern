package factoryPattern;

import java.util.Scanner;

public class Clinic {

    public static PetRecord petFile = new PetRecord();
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("\n\nRECORD\n[1] Dog");
        System.out.println("[2] Cat");
        System.out.println("[3] Exit");
        System.out.print("\nChoose your pet number: ");
        Integer choice = input.nextInt();

        Pet pet;

        Cat catRecord = new Cat();
        Dog dogRecord = new Dog();

        switch(choice){
            case 1: pet = new Dog();
                petFile.setPetId("D01");
                petFile.setPetName("Bantay");
                petFile.setPet(pet);
                dogRecord.setBreed("German Shepperd");
                disOut();
                System.out.println("Breed: " + dogRecord.getBreed());
                break;

            case 2: pet = new Cat();
                petFile.setPetId("C01");
                petFile.setPetName("Muning");
                petFile.setPet(pet);
                catRecord.setNoOfLives(9);
                disOut();
                System.out.println("No. of Lives: " + catRecord.getNoOfLives());
                break;
                
            case 3: 
                System.out.println("Exiting program");
                System.exit(0);
                break;

            default:
                System.out.println("Please choose a valid number from the record");
        }
        main(args);
    }    

    public static void disOut() {
        
        System.out.println("Pet id is " + petFile.getPetId());
        System.out.println("Pet name is " + petFile.getPetName());
        System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
        System.out.println("Communication sound: "+ petFile.getPet().makeSound());
        System.out.println("Play mode: " + petFile.getPet().play());
        
    }
}
