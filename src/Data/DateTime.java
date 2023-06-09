package Data;

/** Клас DateTime використовується для того, щоб можна було вказати день тижня та час (class Time). */
public class DateTime {
    private String day;
    private Time time;
    private boolean isWeekend;

    public DateTime(String day, Time time, boolean isWeekend) {
        this.day = day;
        this.time = time;
        this.isWeekend = isWeekend;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
}