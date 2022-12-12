package classes;

import enams.Status;

import java.util.ArrayList;
import java.util.List;

public class Profile {
    private long id;
    private String userName,password,image,phoneNumber;
    private List<Contact> contacts;
    private List<Message> messages ;
    private Status status;
    public void  addContact(Contact contact) {
        if (contacts == null) {
            contacts = new ArrayList<>();
        }
        contacts.add(contact);
    }

    public Profile(long id, String userName, String password, String image, String phoneNumber, List<Contact> contacts, List<Message> messages, Status status) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.image = image;
        this.phoneNumber = phoneNumber;
        this.contacts = contacts;
        this.messages = messages;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }



    @Override
    public String toString() {
        return "\nProfile :" +
                "\nid :" + id +
                " \nuserName :" + userName + '\'' +
                " \npassword :" + password + '\'' +
                " \nimage :" + image + '\'' +
                " \nphoneNumber :" + phoneNumber + '\'' +
                " \ncontacts :" + contacts +
                " \nmessages :" + messages + '\'' +
                " \nstatus :" + status + '\'' ;
    }
}
