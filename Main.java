import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String clouds = "thunderstorm with light rain";
        double f = 125;
        System.out.println(cloudiness(clouds));
        System.out.println(wind_vector(f));
    }
    public static String wind_vector( double f) {
        String vector = "";
        if ( 0 < f && f < 22.5) {
            vector = "U00002b06";
        } else if (22.5 < f && f < 67.5) {
            vector = "U00002197";
        } else if (67.5 < f && f < 112.5) {
            vector = "U000027a1";
        } else if (112.5 < f && f < 157.5) {
            vector = "U00002198";
        } else if (157.5 < f && f < 202.5) {
            vector = "U00002b07";
        } else if (202.5 < f && f < 245.5) {
            vector = "U00002199";
        } else if (245.5 < f && f < 292.5) {
            vector = "U00002b05";
        } else if (292.5 < f && f < 337.5) {
            vector = "U00002196";
        } else if (337.5 < f && f < 360){
            vector = "U00002b06";
        }
        return vector;

        }

    public static String cloudiness( String clouds) {
       HashMap<String, String> cloudsMap = new HashMap<String, String>();
       cloudsMap.put("clear sky" , "☀");
       cloudsMap.put("few clouds" , "U000026C5");
       cloudsMap.put("scattered clouds" , "U00002601");
       cloudsMap.put("broken clouds" , "U00002601");
       cloudsMap.put("overcast clouds" , "U00002601");
       cloudsMap.put("overcast" , "U00002601");
       cloudsMap.put("shower rain" , "U0001F327");
       cloudsMap.put("light intensity shower rain" , "U0001F327");
       cloudsMap.put("rain" , "U0001F327");
       cloudsMap.put("light rain" , "U0001F327");
       cloudsMap.put("shower sleet" , "U0001F327");
       cloudsMap.put("snow" , "U0001F328");
       cloudsMap.put("light shower snow" , "U0001F328");
       cloudsMap.put("light snow" , "U0001F328");
       cloudsMap.put("thunderstorm" , "U0001F329");
       cloudsMap.put("thunderstorm with light rain" , "U0001F329");
       cloudsMap.put("mist" , "U0001F32B");
       return cloudsMap.get(clouds);
    }
}

