package org.javaguru.travel.insurance.core;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@Component
class DateTimeService {

    long getTimeFlight(Date date1, Date date2) {
        long diff = date2.getTime() - date1.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MICROSECONDS);
    }
}

