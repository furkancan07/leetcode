import java.time.*;
import java.time.temporal.ChronoUnit;
class Solution {
    public int daysBetweenDates(String date1, String date2) {
        LocalDate ld1 = LocalDate.parse(date1);
        LocalDate ld2 = LocalDate.parse(date2);
        long diff = ChronoUnit.DAYS.between(ld1, ld2);
        return (int)Math.abs(diff);
    }
}