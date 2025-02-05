//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.PrintStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String name;
    private String address;
    private List<ScreeningRoom> screeningRooms;
    private List<Screening> screenings;

    public Cinema(String name, String address) {
        this.name = name;
        this.address = address;
        this.screenings = new ArrayList();
        this.screeningRooms = new ArrayList();
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public List<Screening> getScreening() {
        return this.screenings;
    }

    public void printProgramm(LocalDate localDate) {
        System.out.println("Repertuar kina: " + this.name);
        boolean hasScreening = false;

        for(Screening screening : this.screenings) {
            if (screening.getStartTime().toLocalDate().equals(localDate)) {
                hasScreening = true;
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                String formattedDate = screening.getStartTime().format(formatter);
                PrintStream var10000 = System.out;
                String var10001 = screening.getMovie().getTitle();
                var10000.println(var10001 + " " + formattedDate);
            }
        }

        if (!hasScreening) {
            System.out.println("Brak zaplanowanych seansów na ten dzień.");
        }

    }

    public void printScreenings() {
        System.out.println("Seanse w kinie: " + this.name);

        for(Screening screening : this.screenings) {
            System.out.println(screening);
        }

    }

    public List<Movie> findMovies(String partialTitle) {
        List<Movie> foundMovies = new ArrayList();

        for(Screening screening : this.screenings) {
            Movie movie = screening.getMovie();
            if (movie.getTitle().toLowerCase().contains(partialTitle.toLowerCase()) && !foundMovies.contains(movie)) {
                foundMovies.add(movie);
            }
        }

        return foundMovies;
    }

    public List<Screening> findScreening(String partialTitle) {
        List<Screening> foundScreenings = new ArrayList();

        for(Screening screening : this.screenings) {
            if (screening.getMovie().getTitle().toLowerCase().contains(partialTitle.toLowerCase())) {
                foundScreenings.add(screening);
            }
        }

        return foundScreenings;
    }

    public void addScreening(Screening screening) {
        if (screening.getCinema() != null && screening.getCinema() != this) {
            System.out.println("BŁĄD: Seans należy już do innego kina i nie może zostać dodany!");
        } else {
            this.screenings.add(screening);
        }
    }
}

