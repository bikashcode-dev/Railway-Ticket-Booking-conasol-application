package entites;

import java.util.List;

public class User {
    private String name;
    private String password;
    private String hashPassword;
    private List<Ticket> ticketsBooking;
    private String userId;

    public User(String name, String password, String hashPassword, List<Ticket> ticketsBooking, String userId) {
        this.name = name;
        this.password = password;
        this.hashPassword = hashPassword;
        this.ticketsBooking = ticketsBooking;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public List<Ticket> getTicketsBooking() {
        return ticketsBooking;
    }

    public void setTicketsBooking(List<Ticket> ticketsBooking) {
        this.ticketsBooking = ticketsBooking;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
