//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.PrintStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Cinema cinema1 = new Cinema("Super Tarasy", "ul. Akademicka 5");
        Cinema cinema2 = new Cinema("Ars", "ul. Filipa 7");
        Movie movie1 = new Movie("Interstelar", "Christopher Nolan", "3h");
        Movie movie2 = new Movie("Terminal", "Steven Spilberg", "2h");
        LocalDateTime startdate1 = LocalDateTime.of(2025, 2, 1, 18, 30);
        LocalDateTime startdate2 = LocalDateTime.of(2025, 1, 30, 20, 30);
        LocalDateTime startdate3 = LocalDateTime.of(2025, 1, 31, 20, 30);
        ScreeningRoom screeningRoom1 = new ScreeningRoom(1, 50);
        Screening screening1 = new Screening(cinema1, movie1, startdate1, screeningRoom1, true, false);
        Screening screening2 = new Screening(cinema1, movie2, startdate2, screeningRoom1, true, false);
        Screening screening3 = new Screening(cinema2, movie1, startdate3, screeningRoom1, true, false);
        cinema1.addScreening(screening1);
        cinema1.addScreening(screening2);
        cinema2.addScreening(screening3);
        LocalDate today = LocalDate.now();
        cinema1.printProgramm(today);
        cinema2.printProgramm(today);
        List<Cinema> cinemas = new ArrayList();
        cinemas.add(cinema1);
        cinemas.add(cinema2);
        ProgrammeWeek programmeWeek = new ProgrammeWeek(cinemas);
        programmeWeek.printProgrammeForWeek();
        if (!cinema1.getScreening().isEmpty()) {
            cinema1.printScreenings();
        } else {
            System.out.println("Brak seansów w repertuarze kina.");
        }

        Customer customer1 = new Customer("Zuzanna Wawro", "zuzanna.wawro7@gmail.com", "77887877");
        Screening screening4 = (Screening)cinema1.getScreening().get(0);
        Reservation reservation1 = new Reservation(screening4);
        reservation1.reservePlace(new String[]{"H21", "H20", "H22"});
        customer1.addReservation(reservation1);
        Ticket ticket1 = new Ticket(reservation1);
        customer1.addTicket(ticket1);
        customer1.showReservations();
        customer1.showTickets();
        Customer customer2 = new Customer("Jaroslaw Brzozowski", "jaroslaw.brzozowski@gmail.com", "738929274");
        Reservation reservation2 = new Reservation(screening1);
        reservation2.reservePlace(new String[]{"H23", "H24", "H25"});
        customer2.addReservation(reservation2);
        customer2.showReservations();
        Ticket ticket2 = new Ticket(reservation2);
        customer2.addTicket(ticket2);
        customer2.showTickets();

        for(Movie movie : cinema1.findMovies("ter")) {
            PrintStream var10000 = System.out;
            String var10001 = cinema1.getName();
            var10000.println("Znaleziono filmy w kinie " + var10001 + ":" + movie.getTitle());
        }

        List<Screening> foundScreenings = cinema2.findScreening("ter");

        for(Screening screening : foundScreenings) {
            PrintStream var30 = System.out;
            String var31 = cinema2.getName();
            var30.println("Znaleznione seanse w kinie " + var31 + ": " + screening.toString());
        }

        Reservation reservation3 = new Reservation((Screening)foundScreenings.get(0));
        reservation3.reservePlace(new String[]{"H23", "H24", "H25"});
        Ticket ticket3 = new Ticket(reservation3);
        ticket3.printTicket();
    }
}
