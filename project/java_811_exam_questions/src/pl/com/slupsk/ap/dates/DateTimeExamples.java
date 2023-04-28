package pl.com.slupsk.ap.dates;

import java.time.*;
import java.util.Set;
import java.util.TreeSet;

class DateTimeExamples {

    public static void main(String[] args) {
//        LocalTime now = LocalTime.now();
//        System.out.println("1: " + now);
//        LocalTime newTime = now.withMinute(0);
//        System.out.println("2: " + now);
//        System.out.println("New time: " + newTime);

        // dates + zones
//        ZonedDateTime zonedNow = ZonedDateTime.now();
//        LocalDate withoutZoneNow = LocalDate.now();
//
//        System.out.println("zonedNow: " + zonedNow);
//        System.out.println("withoutZoneNow: " + withoutZoneNow);

        //
//        LocalDate date = LocalDate.of(2023, Month.APRIL, 28);
//        LocalTime time = LocalTime.of(10, 4);
//        ZoneId zone = ZoneId.of("Europe/Paris");
//        ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
//        System.out.println(zonedDateTime);

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();

        // 1.
//        for (String availableZoneId : availableZoneIds) {
//            System.out.println(availableZoneId);
//        }

        // 2.
//        availableZoneIds.forEach(element -> System.out.println(element));

        // 3.
//        availableZoneIds.forEach(System.out::println);

        // 4
//        availableZoneIds.stream()
//                .sorted()
//                .forEach(System.out::println);

        // 5
        TreeSet<String> treeSet = new TreeSet<>(availableZoneIds);

        // alternatywnie:
//        TreeSet<String> treeSet = new TreeSet<>();
//        availableZoneIds.forEach(availableZoneId -> treeSet.add(availableZoneId));

        treeSet.forEach(System.out::println);
    }
}
