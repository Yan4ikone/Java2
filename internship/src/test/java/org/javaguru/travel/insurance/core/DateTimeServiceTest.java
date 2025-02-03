package org.javaguru.travel.insurance.core;

import org.junit.jupiter.api.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateTimeServiceTest {

    private DateTimeService dateTimeService = new DateTimeService();


    @Test
    public void shouldTimeFlightBetweenDatePositive() {
        Date date1 = createDate("01.01.2025");
        Date date2 = createDate("03.01.2025");
        var daysBetween = dateTimeService.getTimeFlight(date1, date2);
        assertEquals(daysBetween, 2L);

    }
    @Test
    public void shouldTimeFlightBetweenDateNegative() {
        Date date1 = createDate("10.01.2025");
        Date date2 = createDate("03.01.2025");
        var daysBetween = dateTimeService.getTimeFlight(date1, date2);
        assertEquals(daysBetween, -7L);

    }
    @Test
    public void shouldTimeFlightBetweenDateZero() {
        Date date1 = createDate("01.01.2025");
        Date date2 = createDate("01.01.2025");
        var daysBetween = dateTimeService.getTimeFlight(date1, date2);
        assertEquals(daysBetween, 0L);
    }
    private Date createDate(String dateStr) {
        try {
            return new SimpleDateFormat("dd,MM,yyyy").parse(dateStr);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
