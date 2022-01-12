package pl.sda.generics;

public class Main {

    public static void main(String[] args) {
        DropBoxUser user2 = new DropBoxUser("Warmachine");
        Group<OneDriveUser> group = new Group<>();
        OneDriveUser user = new OneDriveUser("IronMan");
        group.addUser(user);

        Group<User> unknown = new Group<>();
        unknown.addUser(user);
        unknown.addUser(user2);
    }
}