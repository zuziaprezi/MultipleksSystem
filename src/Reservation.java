//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.List;

public class Reservation {
    private static int counter = 1;
    private String reservationID;
    private Screening screening;
    private Cinema cinema;
    private List<String> reservedSeats;
    private Customer customer;

    public Reservation(Screening screening) {
        this.screening = screening;
        this.cinema = screening.getCinema();
        this.reservedSeats = new ArrayList();
        this.reservationID = this.generateReservationID();
        this.customer = this.customer;
    }

    public Cinema getCinema() {
        return this.cinema;
    }

    public Screening getScreening() {
        return this.screening;
    }

    public String getReservationID() {
        return this.reservationID;
    }

    public List<String> getReservedSeats() {
        return this.reservedSeats;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    private synchronized String generateReservationID() {
        Object[] var10001 = new Object[]{counter++};
        return "RES-" + String.format("%04d", var10001);
    }

    public void reservePlace(String... seatNumbers) {
        for(String seatNumber : seatNumbers) {
            for(Seat seat : this.screening.getSeats()) {
                if (seat.getSeatNumber().equals(seatNumber)) {
                    if (seat.isAvailable()) {
                        System.out.println("Miejsce " + seatNumber + " zostało zarezerwowane.");
                        seat.reserveSeat(seatNumber);
                        this.reservedSeats.add(seatNumber);
                        break;
                    }

                    System.out.println("Miejsce " + seatNumber + " jest juz zajęte.");
                }
            }
        }

    }
}
