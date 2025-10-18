
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TemperatureConverter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter temperature in Fahrenheit: ");
        String input = reader.readLine();
        float fahrenheit = Float.parseFloat(input);
        
        float centigrade = convertFahrenheitToCentigrade(fahrenheit);
        
        System.out.println("Temperature in Centigrade: " + centigrade);
    }

    public static float convertFahrenheitToCentigrade(float fahrenheit) {
        float centigrade = (fahrenheit - 32) * 5 / 9;
        return centigrade;
    }
}
