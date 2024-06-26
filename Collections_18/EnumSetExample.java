package Collections_18;

import java.util.EnumSet;

public class EnumSetExample {

    // Define an enum
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        // Create an empty EnumSet
        EnumSet<Day> weekdays = EnumSet.noneOf(Day.class);

        // Add elements
        weekdays.add(Day.MONDAY);
        weekdays.add(Day.TUESDAY);
        weekdays.add(Day.WEDNESDAY);
        weekdays.add(Day.THURSDAY);
        weekdays.add(Day.FRIDAY);

        System.out.println("Weekdays: " + weekdays);

        // Create an EnumSet with all enum values
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
        System.out.println("All days: " + allDays);

        // Create an EnumSet with a range of enum values
        EnumSet<Day> weekend = EnumSet.range(Day.SATURDAY, Day.SUNDAY);
        System.out.println("Weekend: " + weekend);

        // Create an EnumSet from another EnumSet
        EnumSet<Day> businessDays = EnumSet.copyOf(weekdays);
        System.out.println("Business days: " + businessDays);

        // Perform set operations
        EnumSet<Day> daysOff = EnumSet.complementOf(businessDays);
        System.out.println("Days off: " + daysOff);

        // Check for element
        System.out.println("Is Monday a business day? " + businessDays.contains(Day.MONDAY));

        // Remove an element
        businessDays.remove(Day.FRIDAY);
        System.out.println("Business days after removing Friday: " + businessDays);

        // Bulk operations
        businessDays.addAll(weekend);
        System.out.println("Business days after adding weekend: " + businessDays);
    }
}