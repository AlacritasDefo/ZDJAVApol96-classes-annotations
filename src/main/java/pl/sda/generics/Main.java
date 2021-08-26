package pl.sda.generics;

public class Main {

    public static void main(String[] args) {
        Group<OneDriveUser> group = new Group<>();
        OneDriveUser user = new OneDriveUser("IronMan");
        group.addUser(user);

        Group<?> unknown = new Group<>();
        group.addUser(user);
    }
}
