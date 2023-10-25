package Management.Model;

public class Booking {
    private String idBooking;

    public Booking(String idBooking) {
        this.idBooking = idBooking;
    }

    public Booking() {
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }
}
