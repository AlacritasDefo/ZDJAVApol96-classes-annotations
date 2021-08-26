package pl.sda.generics;

import java.util.Objects;

public class DropBoxUser implements User {


    private String nick;

    public DropBoxUser(String nick) {
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
        if (!(o instanceof DropBoxUser)) return false;
        DropBoxUser that = (DropBoxUser) o;
        return Objects.equals(getNick(), that.getNick());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNick());
    }

    @Override
    public String toString() {
        return "DropBoxUser{" +
                "nick='" + nick + '\'' +
                '}';
    }
}
