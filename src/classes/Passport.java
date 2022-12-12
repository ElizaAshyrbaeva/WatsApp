package classes;

import enams.Country;
import enams.Gander;

import java.time.LocalDate;

public class Passport {
    private long id;
    private String lastName,name;
    private Gander gander;
    private Country country;
    private LocalDate dateOfBirth;

    public Passport(long id, String name, String lastName, Gander gander, Country country, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.gander = gander;
        this.country = country;
        this.dateOfBirth = dateOfBirth;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gander getGander() {
        return gander;
    }

    public void setGander(Gander gander) {
        this.gander = gander;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "\nid=" + id +
                "\n, name='" + name + '\'' +
                "\n, lastName='" + lastName + '\'' +
                "\n, gander=" + gander +
                "\n, country=" + country +
                "\n, dateOfBirth=" + dateOfBirth ;
    }
}
