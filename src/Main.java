import service.PersonService;
import service.impl.PersonImpl;
import service.impl.WatsAppImpl;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        PersonImpl person = new PersonImpl();
        WatsAppImpl watsApp = new WatsAppImpl();

        while (true) {
            System.out.println("""
                    1.WhatsApp Setup & Install->
                    2.Get All WhatsApp user->
                    3.Change Status->
                    4.Get All WhatsApp status->
                    5.Get Profile->
                    6.Add Contact->
                    7.Get WhatsApp Status->
                    8.Set Message ->
                    9.Create Person->
                    10.Get All Passport->
                    11.Get All Countries->
                    12.Get Person by First Name->                
                    """);
            int number = new Scanner(System.in).nextInt();
            if (number == 0) break;
            else if (number == 1) {
                System.out.println(watsApp.installWhatsApp());
            } else if (number == 2) {
                System.out.println(watsApp.getAllWhatsAppUsers());
            } else if (number == 3) {
                System.out.println(watsApp.changeStatus());
            } else if (number == 4) {
                System.out.println(watsApp.getAllWhatsAppStatuses());
            } else if (number == 5) {
                System.out.println(watsApp.getProfile());
            }else if (number == 6){
                System.out.println(watsApp.addContact());
            } else if (number == 7) {
                System.out.println(watsApp.getWatsAppStatus());
            } else if (number == 8) {
                watsApp.sendMessage();
            } else if (number == 9) {
                System.out.println(person.createPassport());
            } else if (number == 10) {
                System.out.println(person.getAllPassports());;
            } else if (number == 11) {
                System.out.println(person.getAllCountries());
            } else if (number == 12) {
                System.out.println(person.getPassportByFirstName());
            }else {
                System.out.println("Error");
            }
        }
    }
}