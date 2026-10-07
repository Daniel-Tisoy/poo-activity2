package dtisoy.ejercicio1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Person {

    String name, lastname, idCardNumber, birthCountry;
    int yearBirthdate;
    char gender;

    Person(String name, String lastname, String idCardNumber, String birthCountry,
            int yearBirthdate, char gender) {
        this.name = name;
        this.lastname = lastname;
        this.idCardNumber = idCardNumber;
        this.birthCountry = birthCountry;
        this.yearBirthdate = yearBirthdate;
        this.gender = gender;
    }

    public void showInformation() {
        System.out.println("Name: " + this.name);
        System.out.println("Lastname: " + this.lastname);
        System.out.println("Identity card number: " + this.idCardNumber);
        System.out.println("Year of birth: " + this.yearBirthdate);
        System.out.println("Country of birth: " + this.birthCountry);
        System.out.println("Gender: " + this.gender);

    }
}
