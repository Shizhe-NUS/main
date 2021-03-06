package seedu.address.model.person.timetable;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a day in a Person's timetable.
 */
public class Day {


    public static final String MESSAGE_CONSTRAINTS =
            "Days should only contain integers between 0 and 7, and it should not be blank";

    /*
     * The first character of the address must not be a whitespace,
     * otherwise " " (a blank string) becomes a valid input.
     */
    public static final String VALIDATION_REGEX = "[\\p{Alnum}][\\p{Alnum} ]*";

    public final String day;

    /**
     * Constructs a {@code Name}.
     *
     * @param day A valid name.
     */
    public Day(String day) {
        requireNonNull(day);
        checkArgument(isValidDay(day), MESSAGE_CONSTRAINTS);
        this.day = day;
    }

    /**
     * Returns true if a given string is a valid name.
     */
    public static boolean isValidDay(String test) {
        return test.matches(VALIDATION_REGEX);
    }


    @Override
    public String toString() {
        return day;
    }

    public int getDay() {
        return Integer.parseInt(day);
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Day // instanceof handles nulls
                && day.equals(((Day) other).day)); // state check
    }

    @Override
    public int hashCode() {
        return day.hashCode();
    }
}
