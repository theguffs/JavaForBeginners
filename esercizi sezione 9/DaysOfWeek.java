enum DaysOfWeek {
    MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"), THURSDAY("Thursday"), FRIDAY("Friday"), SATURDAY("Saturday"), SUNDAY("Sunday");
    private String name;
    DaysOfWeek(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
public String getName() {
    return switch (this) {
        case MONDAY -> "Monday";
        case TUESDAY -> "Tuesday";
        case WEDNESDAY -> "Wednesday";
        case THURSDAY -> "Thursday";
        case FRIDAY -> "Friday";
        case SATURDAY -> "Saturday";
        case SUNDAY -> "Sunday";
    };
}
public boolean isWeekend() {
    return this != SATURDAY && this != SUNDAY;
} 
public boolean isHoliday() {
    return this == SATURDAY || this == SUNDAY;
}