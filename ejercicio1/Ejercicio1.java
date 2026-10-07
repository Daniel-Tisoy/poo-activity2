package dtisoy.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author dtisoy
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        // solution with excercice requirements
        /*
        
        Person luis = new Person("Luis", "Tisoy", "1111111111", "Colombia", 2000, 'M');
        Person daniel = new Person("Daniel", "Rojas", "2222222222", "Argentina", 2000, 'M');

        luis.showInformation();
        System.out.println();
        daniel.showInformation(); 
        
        */
        
        // Solution with user input :

        Scanner input = new Scanner(System.in);

        String name, lastname, idnumber, birthCountry; int birthdate; char gender;
        
        System.out.print("enter your name: ");
        name = input.nextLine();
        System.out.println("enter your lastname: ");
        lastname = input.nextLine();
        System.out.println("enter your id card number: ");
        idnumber = input.nextLine();
        System.out.println("enter your year of birth: ");
        birthdate = input.nextInt();
        System.out.println("Enter your country of birth: ");
        birthCountry = input.nextLine();
        System.out.println("Enter your gender (F/M): ");
        gender = input.next().toUpperCase().charAt(0);
        
        Person inputPerson = new Person(name, lastname, idnumber, birthCountry, birthdate, gender);
        System.out.println();
        inputPerson.showInformation();

    }
}
