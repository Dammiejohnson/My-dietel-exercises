package chapterEight.example;

import java.time.LocalDate;

public enum FavoriteDay {
    HBD("Birthday", "Ajah", LocalDate.of(2019,05,01)),
    GD("Graduation", "Unilag", LocalDate.of(2022, 01, 18)),
    WD("WeddingDay", "United-Kingdom", LocalDate.of(2024,04,05)),
    NM("Naming Ceremony", "United-Kingdom", LocalDate.of(2024,12,27));

    private final String name;
    private final String location;
    private final LocalDate date;

    FavoriteDay(String name, String location, LocalDate date) {
        this.name = name;
        this.location = location;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public LocalDate getDate() {
        return date;
    }
}
