package pl.sda.generics;

import java.util.Objects;

public class OneDriveUser {

    private String nick;

    public OneDriveUser(String nick) {
        this.nick = nick;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OneDriveUser that = (OneDriveUser) o;
        return Objects.equals(nick, that.nick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nick);
    }

    @Override
    public String toString() {
        return "OneDriveUser{" +
                "nick='" + nick + '\'' +
                '}';
    }
}
