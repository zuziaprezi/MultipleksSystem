import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String email;
    private String phone;
    private List<Ticket> tickets;
    private List<Reservation> reservations;

    public Customer(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.tickets = new ArrayList();
        this.reservations = new ArrayList();
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    public List<Ticket> getTickets() {
        return this.tickets;
    }

    public List<Reservation> getReservations() {
        return this.reservations;
    }

    public void addReservation(Reservation reservation) {
        reservation.setCustomer(this);
        this.reservations.add(reservation);
    }

    public void addTicket(Ticket ticket) {
        ticket.setCustomer(this);
        this.tickets.add(ticket);
    }

    public void showReservations() {
        for(Reservation reservation : this.reservations) {
            PrintStream var10000 = System.out;
            String var10001 = reservation.getReservationID();
            var10000.println(var10001 + " - " + reservation.getCustomer().getName());
            System.out.println(reservation.getCustomer().getEmail());
            System.out.println(reservation.getScreening().getMovie().getTitle());
            System.out.println(reservation.getCinema().getName());
            System.out.println(reservation.getReservedSeats());
        }

    }

    public void showTickets() {
        for(Ticket ticket : this.tickets) {
            ticket.printTicket();
        }

    }
}

