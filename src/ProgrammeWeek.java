//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.PrintStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ProgrammeWeek {
    private List<Cinema> cinemas;
    private LocalDate startDate;
    private LocalDate endDate;

    public ProgrammeWeek(List<Cinema> cinemas) {
        this.cinemas = cinemas;
        this.startDate = LocalDate.now();
        this.endDate = this.startDate.plusDays(7L);
    }

    public void printProgrammeForWeek() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd.MM.yyyy");

        for(LocalDate date = this.startDate; !date.isAfter(this.endDate); date = date.plusDays(1L)) {
            PrintStream var10000 = System.out;
            String var10001 = date.format(formatter);
            var10000.println("\nRepertuar na dzień: " + var10001);

            for(Cinema cinema : this.cinemas) {
                cinema.printProgramm(date);
            }
        }

    }
}
