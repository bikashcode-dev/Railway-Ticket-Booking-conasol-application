package entites;

public class Ticket {
    private String ticketId;
    private String userId;
    private String ticketDate;
    private String dateOfTravel;

    public Ticket(String ticketId, String userId, String ticketDate, String dateOfTravel, Train train) {
        this.ticketId = ticketId;
        this.userId = userId;
        this.ticketDate = ticketDate;
        this.dateOfTravel = dateOfTravel;
        this.train = train;
    }

    private Train train ;

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(String ticketDate) {
        this.ticketDate = ticketDate;
    }

    public String getDateOfTravel() {
        return dateOfTravel;
    }

    public void setDateOfTravel(String dateOfTravel) {
        this.dateOfTravel = dateOfTravel;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }
}
