package zadaniaCzas;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Flight {

    private String flightNumber;
    private String departureAirport;
    private String arrivalAirport;
    private OffsetDateTime departureTime;
    private OffsetDateTime arrivalTime;

    public Flight(String flightNumber, String departureAirport, String arrivalAirport,
                  OffsetDateTime departureTime, OffsetDateTime arrivalTime) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public Duration calculateFlightDuration() {
        if (departureTime.isAfter(arrivalTime)) {
            throw new IllegalArgumentException("Czas wylotu nie może być po czasie przylotu.");
        }
        return Duration.between(departureTime, arrivalTime);
    }

    public static OffsetDateTime getDepartureTimeFromUser(String airportZone) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź godzinę wylotu (format: yyyy-MM-dd HH:mm:ss): ");
        String userInput = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(userInput, formatter);
        ZoneId zoneId = ZoneId.of(airportZone);

        return OffsetDateTime.of(localDateTime, zoneId.getRules().getOffset(localDateTime));
    }

    public static OffsetDateTime convertArrivalTime(OffsetDateTime departureTime, String arrivalAirportZone) {
        ZoneId arrivalZone = ZoneId.of(arrivalAirportZone);
        return departureTime.withOffsetSameInstant(arrivalZone.getRules().getOffset(departureTime.toLocalDateTime()));
    }
}
