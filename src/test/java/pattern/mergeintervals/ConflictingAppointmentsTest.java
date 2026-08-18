package pattern.mergeintervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConflictingAppointmentsTest {

    @Test
    public void shouldReturnFalseWhenAppointmentsOverlap() {
        Interval[] intervals = {new Interval(1, 4), new Interval(2, 5), new Interval(7, 9)};
        assertFalse(ConflictingAppointments.canAttendAllAppointments(intervals));
    }

    @Test
    public void shouldReturnTrueWhenAppointmentsDoNotOverlap() {
        Interval[] intervals = {new Interval(6, 7), new Interval(2, 4), new Interval(8, 12)};
        assertTrue(ConflictingAppointments.canAttendAllAppointments(intervals));
    }

    @Test
    public void shouldReturnFalseWhenAppointmentsOverlapUnsorted() {
        Interval[] intervals = {new Interval(4, 5), new Interval(2, 3), new Interval(3, 6)};
        assertFalse(ConflictingAppointments.canAttendAllAppointments(intervals));
    }

    @Test
    public void shouldReturnTrueWhenAppointmentsTouchAtBoundary() {
        Interval[] intervals = {new Interval(1, 2), new Interval(2, 3)};
        assertTrue(ConflictingAppointments.canAttendAllAppointments(intervals));
    }

    @Test
    public void shouldReturnTrueForSingleAppointment() {
        Interval[] intervals = {new Interval(1, 2)};
        assertTrue(ConflictingAppointments.canAttendAllAppointments(intervals));
    }

    @Test
    public void shouldReturnTrueForEmptyAppointmentList() {
        Interval[] intervals = {};
        assertTrue(ConflictingAppointments.canAttendAllAppointments(intervals));
    }
}
