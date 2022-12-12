package service;

import classes.Passport;
import enams.Country;

import java.util.List;

public interface PersonService {
    String  createPassport() throws Exception;
    List<Passport> getAllPassports();
    List<Country> getAllCountries();
    List<Passport> getPassportByFirstName();


}
