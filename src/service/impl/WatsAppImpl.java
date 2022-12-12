package service.impl;

import classes.Contact;
import classes.Message;
import classes.Profile;
import enams.Status;
import service.WatsAppService;
import java.util.*;

public class WatsAppImpl implements WatsAppService {
    private List<Profile>profiles = new ArrayList<>();
    private TreeMap<Integer,String> whatsApp = new TreeMap<>();



    public List<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<Profile> profiles) {
        this.profiles = profiles;
    }

    public TreeMap<Integer, String> getWhatsApp() {
        return whatsApp;
    }

    public void setWhatsApp(TreeMap<Integer, String> whatsApp) {
        this.whatsApp = whatsApp;
    }

    @Override
    public String installWhatsApp() {
        try {
            System.out.println("Напишите свой ID :");
            long id = new Scanner(System.in).nextLong();
            System.out.println("Напишите номер телефона :");
            String phoneNumber = new Scanner(System.in).next();
            System.out.println("Создайте пароль");
            String password = new Scanner(System.in).next();
            System.out.println("Напишите имя пользователя:");
            String userName = new Scanner(System.in).nextLine().toUpperCase();

            if (phoneNumber.length() != 13 || !phoneNumber.startsWith("+996"))
                throw new Exception("Ошибка проверки номера телефона. Неверный номер телефона!");
            if (password.length() < 3) throw new Exception("Ошибка проверки пароля. Пароль не может быть коротким.");
            if (userName.length() < 4)
                throw new Exception("Ошибка проверки имени пользователя. Имя пользователя не может быть коротким");

            for (Profile profile : profiles) {
                if (profile.getUserName().equals(userName))
                    throw new Exception("Предоставленное вами имя пользователя ИСПОЛЬЗУЕТСЯ КЕМ-ТО ДРУГИМ. Попробуйте другое ИМЯ ПОЛЬЗОВАТЕЛЯ.");
                if (profile.getId() == id)
                    throw new Exception("Предоставленный вами идентификатор ИСПОЛЬЗУЕТСЯ КТО-ТО ДРУГОЙ. Попробуйте другой идентификатор.");
                if (profile.getPhoneNumber().equals(phoneNumber))
                    throw new Exception("Предоставленный вами номер телефона ИСПОЛЬЗУЕТСЯ КЕМ-ТО ДРУГИМ. Попробуйте другой номер телефона.");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);

        }
        return "Successfully WatsApp";
    }

    @Override
    public List<Profile> getAllWhatsAppUsers() {
        return profiles;
    }

    @Override
    public String changeStatus() throws Exception {
        System.out.print("Введите имя пользователя : ");
        String username = new Scanner(System.in).nextLine().toLowerCase();
        System.out.print("Введите свой пароль : ");
        String password = new Scanner(System.in).nextLine();
        for (Profile profile : profiles) {
            if (profile.getUserName().equals(username) && profile.getPassword().equals(password)) {
                System.out.println(" СПИСОК СОСТОЯНИЙ: " + Arrays.toString(Status.values()));
                System.out.print("Введите индекс вашего статуса : ");
                int index = new Scanner(System.in).nextInt();
                profile.setStatus(Status.valueOf(String.valueOf(Status.values()[index])));
                break;
            }
        }
        return "Статус профиля успешно ОБНОВЛЕНО!";
    }

    @Override
    public List<Status> getAllWhatsAppStatuses() {
        return List.of(Status.values());
    }

    @Override
    public Profile getProfile() throws Exception {
        System.out.println("Напишите свое имя пользователя");
        String userName = new Scanner(System.in).nextLine().toLowerCase();
        System.out.println("Напишите свой пароль");
        String password = new Scanner(System.in).next();
        for (Profile profile : profiles) {
            if((profile.getUserName().equals(userName) && profile.getPassword().equals(password))){
                return profile;
            }
        }
        return null;
    }

    @Override
    public String addContact() {
        System.out.println("Add  new contact to profile :");
        System.out.println("Enter your Name :");
        String userName = new Scanner(System.in).nextLine();
        for (Profile profile : profiles) {
            if (profile.getUserName().equals(userName)) {
                System.out.println("Enter your password ");
                String password = new Scanner(System.in).nextLine();
                if (profile.getPassword().equals(password)) {
                    System.out.println("Write your Phone Number");
                    String phoneNumber = new Scanner(System.in).nextLine();
                    System.out.println("Write contact user name ");
                    String userName1 = new Scanner(System.in).nextLine();
                    profile.getContacts().add(new Contact(userName1, phoneNumber));
                    System.out.println("Successfully new contact added");
                }
            }
        }
        return null;
    }


    @Override
    public Status getWatsAppStatus() {
        System.out.print("Введите имя пользователя : ");
        String username = new Scanner(System.in).nextLine().toLowerCase();
        System.out.print("Введите свой пароль : ");
        String password = new Scanner(System.in).nextLine();
        for (Profile profile : profiles) {
            if(profile.getUserName().equals(username) && profile.getPassword().equals(password)){
                return profile.getStatus();
            }
        }
        return null;
    }

    @Override
    public void sendMessage() {
        System.out.println("Enter your password : ");
        String password = new Scanner(System.in).nextLine();
        for (Profile profile : profiles) {
            if(profile.equals(profile.getPassword())){
                System.out.println("Your contact " + profile.getContacts());
                System.out.println("Contact user name which you want send message ");
                String userName= new Scanner(System.in).nextLine();
                if(userName.equalsIgnoreCase(profile.getUserName())){
                    while (true){
                        for (Message message:profile.getMessages()) {
                            System.out.println(profile.getUserName() + "::"+message.getMessage());
                        }
                        System.out.println("Message :");
                        String message = new Scanner(System.in).nextLine();
                        if(message.equals("Exit "))break;
                    }
                }else {
                    Message message = new Message();
                    profile.getMessages().add(message);
                }
            }
        }
    }


}
