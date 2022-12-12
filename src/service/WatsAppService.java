package service;

import classes.Profile;
import enams.Status;

import java.util.List;

public interface WatsAppService {
    String installWhatsApp();
    List<Profile> getAllWhatsAppUsers();
    String changeStatus() throws Exception;
    List<Status> getAllWhatsAppStatuses();
    Profile getProfile() throws Exception;
    String addContact();
    Status getWatsAppStatus();
    void sendMessage();


}
