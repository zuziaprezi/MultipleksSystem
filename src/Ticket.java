//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ticket {
    private Reservation reservation;
    private Customer customer;

    public Ticket(Reservation reservation) {
        this.reservation = reservation;
    }

    public Reservation getReservation() {
        return this.reservation;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void printTicket() {
        Screening screening = this.reservation.getScreening();
        Cinema cinema = this.reservation.getCinema();
        if (!this.reservation.getReservedSeats().isEmpty()) {
            System.out.println("********* BILET KINOWY *********");
            System.out.println("Kino: " + cinema.getName());
            System.out.println("Adres: " + cinema.getAddress());
            System.out.println("Film: " + screening.getMovie().getTitle());
            PrintStream var10000 = System.out;
            LocalDateTime var10001 = screening.getStartTime();
            var10000.println("Data i godzina: " + var10001.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm")));
            System.out.println("Sala: " + screening.getRoom().getRoomNumber());
            System.out.println("Miejsca: " + String.valueOf(this.reservation.getReservedSeats()));
            if (screening.getIs3D()) {
                System.out.println("3D: tak");
            } else {
                System.out.println("3D: nie");
            }

            if (screening.getIsVIP()) {
                System.out.println("VIP: tak");
            } else {
                System.out.println("VIP: nie");
            }

            System.out.println("Numer rezerwacji: " + this.reservation.getReservationID());
            System.out.println("*********************************");
        } else {
            System.out.println("Zarezerwuj miejsca, które są dostepne");
        }

    }
}

