public class WheatherAdviser {
    public String provideWeatherAdvisory(int temperature) {
        if (temperature < 0) {
            return "it's freezing!Wear a heavy coat.";
        }
        else if (temperature >= 0 && temperature <= 10) {
            return "it's cold!Bundle up.";
        }
        else if (temperature >= 11 && temperature <= 20) {
            return "it's cool!A light jacket will do.";
        }
        else if (temperature > 20) {
            return "it's warm!Enjoy the day.";
        }
        else {
            return "Invalid temperature";
        }
    }
}
