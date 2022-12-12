package service.impl;

import classes.Passport;
import enams.Country;
import enams.Gander;
import service.PersonService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonImpl implements PersonService {
    private  List<Passport>passports = new ArrayList<>();



    public List<Passport> getPassports() {
        return passports;
    }
    public void setPassports(List<Passport> passports) {
        this.passports = passports;
    }


    @Override
    public String createPassport()  {
            System.out.println("ID :");
            long id = new Scanner(System.in).nextLong();
            System.out.println("First Name :");
            String firstName = new Scanner(System.in).next();
            System.out.println("Last Name :");
            String lastName = new Scanner(System.in).next();
            System.out.println("Country : ");
            Country country = Country.valueOf(new Scanner(System.in).next());
            System.out.println("Gender :");
            Gander gender = Gander.valueOf(new Scanner(System.in).next());
            System.out.println("Data of Birth (mm-yy-dddd) :");
            String [] dataOfBirth = new Scanner(System.in).nextLine().trim().split("-");
            LocalDate date = LocalDate.of(
                    Integer.parseInt(dataOfBirth[0]),
                    (Integer.parseInt(dataOfBirth[1])),
                    Integer.parseInt(dataOfBirth[2]));
            Passport passport = new Passport(id,firstName,lastName,gender,country,date);
            passports.add(passport);
        return "Successfully";
    }

    @Override
    public List<Passport> getAllPassports() {
        return passports;
    }

    @Override
    public List<Country> getAllCountries() {
        return List.of(Country.values());
    }

    @Override
    public List<Passport> getPassportByFirstName() {
        System.out.println("Напишите фамилию :");
        String lastName = new Scanner(System.in).nextLine();
        List<Passport>passports1 = new ArrayList<>();
        for (Passport passport : passports) {
            if(passport.getLastName().equals(lastName));
            passports1.add(passport);
        }
        return passports1;
    }

}
