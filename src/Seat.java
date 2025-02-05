public class Seat {
    private String seatNumber;
    private boolean available;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
        this.available = true;
    }

    public String getSeatNumber() {
        return this.seatNumber;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void reserveSeat(String seatNumber) {
        this.available = false;
    }

    public boolean isAvailable() {
        return this.available;
    }
}

