package classes;

import enams.Status;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class WhatsApp {
    private int id;
    private String phoneNumber;
    private String image = "(❁´◡`❁)";
    private String createPassword;
    private String userName;
    private Status status = Status.AT_SCHOOL;
    private List<Contact> contacts = new ArrayList<>();
    private List<String> message = new ArrayList<>();

    public WhatsApp(int id, String phoneNumber, String image, String createPassword, String userName, Status status, List<Contact> contacts, List<String> message) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.image = image;
        this.createPassword = createPassword;
        this.userName = userName;
        this.status = status;
        this.contacts = contacts;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCreatePassword() {
        return createPassword;
    }

    public void setCreatePassword(String createPassword) {
        this.createPassword = createPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "WhatsApp{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", image='" + image + '\'' +
                ", createPassword='" + createPassword + '\'' +
                ", userName='" + userName + '\'' +
                ", status=" + status +
                ", contacts=" + contacts +
                ", message=" + message +
                '}';
    }
}
