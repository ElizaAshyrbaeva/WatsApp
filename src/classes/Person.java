package classes;

import enams.Country;
import enams.Gander;

import java.time.LocalDate;

public class Person   {
    private String phoneNumber;
    private String userName;
    private WhatsApp whatsApp;

    public Person(String phoneNumber, String userName) {
        this.phoneNumber = phoneNumber;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public WhatsApp getWhatsApp() {
        return whatsApp;
    }

    public void setWhatsApp(WhatsApp whatsApp) {
        this.whatsApp = whatsApp;
    }

    @Override
    public String toString() {
        return "Person :" +
                "phoneNumber :" + phoneNumber  +
                ", userName :" + userName ;
    }
}
