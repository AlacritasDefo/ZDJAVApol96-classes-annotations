package pl.sda.generics;

import java.util.ArrayList;
import java.util.List;

public class Group<T> {

    private List<T> users = new ArrayList<>();

    public List<T> getUsers() {
        return users;
    }

    public void addUser(T user) {
        users.add(user);
    }
}
