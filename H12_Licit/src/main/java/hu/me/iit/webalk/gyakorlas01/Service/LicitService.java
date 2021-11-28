package hu.me.iit.webalk.gyakorlas01.Service;

public interface LicitService {
    int getHighest();

    int getHighestForUser(int userId);

    void saveNewLicit(int licit, int userId);


}
