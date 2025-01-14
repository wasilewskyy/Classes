package zadaniaCzas;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Przypadek 1:
        OffsetDateTime departureTime1 = OffsetDateTime.of(2025, 1, 15, 10, 0, 0, 0, ZoneId.of("Europe/Warsaw").getRules().getOffset(LocalDateTime.now()));
        OffsetDateTime arrivalTime1 = OffsetDateTime.of(2025, 1, 15, 12, 30, 0, 0, ZoneId.of("Europe/Warsaw").getRules().getOffset(LocalDateTime.now()));
        Flight flight1 = new Flight("LO123", "Warszawa", "Warszawa", departureTime1, arrivalTime1);
        System.out.println("Czas trwania lotu: " + flight1.calculateFlightDuration().toHours() + " godzin i " + flight1.calculateFlightDuration().toMinutesPart() + " minut.");

        // Przypadek 2:
        OffsetDateTime departureTime2 = OffsetDateTime.of(2025, 1, 15, 23, 0, 0, 0, ZoneId.of("Europe/Warsaw").getRules().getOffset(LocalDateTime.now()));
        OffsetDateTime arrivalTime2 = OffsetDateTime.of(2025, 1, 16, 1, 30, 0, 0, ZoneId.of("Europe/Warsaw").getRules().getOffset(LocalDateTime.now()));
        Flight flight2 = new Flight("LO124", "Warszawa", "Warszawa", departureTime2, arrivalTime2);
        System.out.println("Czas trwania lotu: " + flight2.calculateFlightDuration().toHours() + " godzin i " + flight2.calculateFlightDuration().toMinutesPart() + " minut.");

        // Przypadek 3:
        OffsetDateTime departureTime3 = OffsetDateTime.of(2025, 1, 15, 10, 0, 0, 0, ZoneId.of("Europe/Warsaw").getRules().getOffset(LocalDateTime.now()));
        OffsetDateTime arrivalTime3 = OffsetDateTime.of(2025, 1, 15, 14, 0, 0, 0, ZoneId.of("America/New_York").getRules().getOffset(LocalDateTime.now()));
        Flight flight3 = new Flight("LO125", "Warszawa", "Nowy Jork", departureTime3, arrivalTime3);
        System.out.println("Czas trwania lotu: " + flight3.calculateFlightDuration().toHours() + " godzin.");

        // Przypadek 4:
        OffsetDateTime departureTime4 = OffsetDateTime.of(2025, 3, 30, 1, 0, 0, 0, ZoneId.of("Europe/Warsaw").getRules().getOffset(LocalDateTime.now()));
        OffsetDateTime arrivalTime4 = OffsetDateTime.of(2025, 3, 30, 5, 0, 0, 0, ZoneId.of("Europe/Warsaw").getRules().getOffset(LocalDateTime.of(2025, 3, 30, 5, 0, 0, 0)));
        Flight flight4 = new Flight("LO126", "Warszawa", "Warszawa", departureTime4, arrivalTime4);
        System.out.println("Czas trwania lotu: " + flight4.calculateFlightDuration().toHours() + " godzin.");

        // Przypadek 5:
        OffsetDateTime departureTime5 = OffsetDateTime.of(2025, 10, 26, 1, 0, 0, 0, ZoneId.of("Europe/Warsaw").getRules().getOffset(LocalDateTime.now()));
        OffsetDateTime arrivalTime5 = OffsetDateTime.of(2025, 10, 26, 2, 30, 0, 0, ZoneId.of("Europe/Warsaw").getRules().getOffset(LocalDateTime.now()));
        Flight flight5 = new Flight("LO127", "Warszawa", "Warszawa", departureTime5, arrivalTime5);
        System.out.println("Czas trwania lotu: " + flight5.calculateFlightDuration().toHours() + " godzin i " + flight5.calculateFlightDuration().toMinutesPart() + " minut.");

        // Przypadek 6:
        OffsetDateTime departureTime6 = OffsetDateTime.of(2025, 1, 15, 10, 0, 0, 0, ZoneId.of("Asia/Tokyo").getRules().getOffset(LocalDateTime.now()));
        OffsetDateTime arrivalTime6 = OffsetDateTime.of(2025, 1, 14, 18, 0, 0, 0, ZoneId.of("America/Los_Angeles").getRules().getOffset(LocalDateTime.now()));
        Flight flight6 = new Flight("LO128", "Tokio", "Los Angeles", departureTime6, arrivalTime6);
        System.out.println("Czas trwania lotu: " + flight6.calculateFlightDuration().toHours() + " godzin.");

        // Przypadek 7:
        try {
            OffsetDateTime invalidZoneTime = OffsetDateTime.of(2025, 1, 15, 10, 0, 0, 0, ZoneId.of("Invalid/Zone").getRules().getOffset(LocalDateTime.now()));
        } catch (Exception e) {
            System.out.println("Błąd: " + e.getMessage());
        }

        // Przypadek 8:
        try {
            OffsetDateTime departureTime7 = OffsetDateTime.of(2025, 1, 15, 10, 0, 0, 0, ZoneId.of("Europe/Warsaw").getRules().getOffset(LocalDateTime.now()));
            OffsetDateTime arrivalTime7 = OffsetDateTime.of(2025, 1, 15, 8, 0, 0, 0, ZoneId.of("Europe/Warsaw").getRules().getOffset(LocalDateTime.now()));
            Flight flight7 = new Flight("LO129", "Warszawa", "Warszawa", departureTime7, arrivalTime7);
            System.out.println("Czas trwania lotu: " + flight7.calculateFlightDuration().toHours() + " godzin.");
        } catch (IllegalArgumentException e) {
            System.out.println("Błąd: " + e.getMessage());
        }

        // Przypadek 9:
        OffsetDateTime departureTime8 = OffsetDateTime.of(2025, 1, 15, 10, 0, 0, 0, ZoneId.of("Europe/Warsaw").getRules().getOffset(LocalDateTime.now()));
        OffsetDateTime arrivalTime8 = OffsetDateTime.of(2025, 1, 15, 12, 0, 0, 0, ZoneId.of("Asia/Kolkata").getRules().getOffset(LocalDateTime.now()));
        Flight flight8 = new Flight("LO130", "Warszawa", "Kalkuta", departureTime8, arrivalTime8);
        System.out.println("Czas trwania lotu: " + flight8.calculateFlightDuration().toHours() + " godzin i " + flight8.calculateFlightDuration().toMinutesPart() + " minut.");

        // Przypadek 10:
        OffsetDateTime departureTime9 = OffsetDateTime.of(2025, 1, 15, 6, 0, 0, 0, ZoneId.of("Europe/Warsaw").getRules().getOffset(LocalDateTime.now()));
        OffsetDateTime arrivalTime9 = OffsetDateTime.of(2025, 1, 16, 6, 0, 0, 0, ZoneId.of("Asia/Singapore").getRules().getOffset(LocalDateTime.now()));
        Flight flight9 = new Flight("LO131", "Warszawa", "Singapur", departureTime9, arrivalTime9);
        System.out.println("Czas trwania lotu: " + flight9.calculateFlightDuration().toHours() + " godzin.");

        // Przypadek 11:
        OffsetDateTime departureTime10 = OffsetDateTime.of(2025, 1, 15, 8, 0, 0, 0, ZoneId.of("Europe/Warsaw").getRules().getOffset(LocalDateTime.of(2025, 1, 15, 8, 0, 0, 0)));
        OffsetDateTime arrivalTime10 = OffsetDateTime.of(2025, 1, 15, 12, 0, 0, 0, ZoneId.of("Europe/London").getRules().getOffset(LocalDateTime.now()));
        Flight flight10 = new Flight("LO132", "Warszawa", "Londyn", departureTime10, arrivalTime10);
        System.out.println("Czas trwania lotu: " + flight10.calculateFlightDuration().toHours() + " godzin.");

        OffsetDateTime returnFlightDeparture = OffsetDateTime.of(2025, 1, 15, 16, 0, 0, 0, ZoneId.of("Europe/London").getRules().getOffset(LocalDateTime.now()));
        OffsetDateTime returnFlightArrival = OffsetDateTime.of(2025, 1, 15, 20, 0, 0, 0, ZoneId.of("Europe/Warsaw").getRules().getOffset(LocalDateTime.now()));
        Flight returnFlight = new Flight("LO133", "Londyn", "Warszawa", returnFlightDeparture, returnFlightArrival);
        System.out.println("Czas trwania lotu powrotnego: " + returnFlight.calculateFlightDuration().toHours() + " godzin.");
    }
}
